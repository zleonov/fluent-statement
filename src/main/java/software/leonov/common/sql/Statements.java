package software.leonov.common.sql;

import static java.util.Objects.requireNonNull;

import java.sql.Statement;
import java.util.function.Consumer;

/**
 * Static utility methods for working with {@link Statement}s.
 * 
 * @author Zhenya Leonov
 */
final public class Statements {

    private Statements() {
    }

    /**
     * Closes the specified {@code Statement} if it is not {@code null}. If an error is thrown it will be
     * {@link Throwable#addSuppressed(Throwable) appended} to the primary exception.
     * <p>
     * This method is primarily useful when cleaning up resources in a catch/finally block stemming from an earlier error.
     * 
     * @param stmt the specified {@code Statement}
     * @param t    the primary exception which occurred earlier
     */
    public static void closeQuietly(final Statement stmt, final Throwable t) {
        requireNonNull(t, "t == null");
        closeQuietly(stmt, t::addSuppressed);
    }

    /**
     * Closes the specified {@code Statement} if it is not {@code null}. If an error is thrown it will be
     * {@link Consumer#accept(Object) passed} to the specified {@code Consumer}.
     * <p>
     * This method is primarily useful when cleaning up resources in a catch/finally block stemming from an earlier error.
     * 
     * @param stmt     the specified {@code Statement}
     * @param consumer the {@code Consumer} which will handle the error
     */
    public static void closeQuietly(final Statement stmt, final Consumer<Throwable> consumer) {
        if (stmt != null)
            try {
                stmt.close();
            } catch (final Throwable th) {
                consumer.accept(th);
            }
    }

}
