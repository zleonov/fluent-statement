package software.leonov.common.sql;

import static java.util.Objects.requireNonNull;

import java.sql.ResultSet;
import java.util.function.Consumer;

/**
 * Static utility methods for working with {@link ResultSet}s.
 * 
 * @author Zhenya Leonov
 */
public final class ResultSets {

    private ResultSets() {
    }

    /**
     * Closes the specified {@code ResultSet} if it is not {@code null}. If an error is thrown it will be
     * {@link Throwable#addSuppressed(Throwable) appended} to the primary exception.
     * <p>
     * This method is primarily useful when cleaning up resources in a catch/finally block stemming from an earlier error.
     * 
     * @param rs the specified {@code ResultSet}
     * @param t  the primary exception which occurred earlier
     */
    public static void closeQuietly(final ResultSet rs, final Throwable t) {
        requireNonNull(t, "t == null");
        closeQuietly(rs, t::addSuppressed);
    }

    /**
     * Closes the specified {@code ResultSet} if it is not {@code null}. If an error is thrown it will be
     * {@link Consumer#accept(Object) passed} to the specified {@code Consumer}.
     * <p>
     * This method is primarily useful when cleaning up resources in a catch/finally block stemming from an earlier error.
     * 
     * @param rs       the specified {@code ResultSet}
     * @param consumer the {@code Consumer} which will handle the error
     */
    public static void closeQuietly(final ResultSet rs, final Consumer<Throwable> consumer) {
        if (rs != null)
            try {
                rs.close();
            } catch (final Throwable th) {
                consumer.accept(th);
            }
    }

}
