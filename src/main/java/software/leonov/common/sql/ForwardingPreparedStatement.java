package software.leonov.common.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

/**
 * A {@code PreparedStatement} which forwards all of its method calls to another {@code PreparedStatement}. Subclasses
 * should override one or more methods to modify the behavior of the backing statement as desired per the
 * <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.
 * <p>
 * <b>Warning:</b> The methods of {@code ForwardingPreparedStatement} forward <b>indiscriminately</b> to the methods of
 * the delegate. Overriding a particular method will not change the behavior of other methods which invoke it
 * internally. This can lead to unexpected behavior.
 * 
 * @author Zhenya Leonov
 */
public abstract class ForwardingPreparedStatement extends ForwardingStatement implements PreparedStatement {

    protected ForwardingPreparedStatement() {
    }

    @Override
    protected abstract PreparedStatement delegate();

    @Override
    public void setArray(int parameterIndex, Array x) throws SQLException {
        delegate().setArray(parameterIndex, x);
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
        delegate().setAsciiStream(parameterIndex, x);
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
        delegate().setAsciiStream(parameterIndex, x, length);
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
        delegate().setAsciiStream(parameterIndex, x, length);
    }

    @Override
    public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
        delegate().setBigDecimal(parameterIndex, x);
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
        delegate().setBinaryStream(parameterIndex, x);
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
        delegate().setBinaryStream(parameterIndex, x, length);
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {
        delegate().setBinaryStream(parameterIndex, x, length);
    }

    @Override
    public void setBlob(int parameterIndex, Blob x) throws SQLException {
        delegate().setBlob(parameterIndex, x);
    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
        delegate().setBlob(parameterIndex, inputStream);
    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {
        delegate().setBlob(parameterIndex, inputStream, length);
    }

    @Override
    public void setBoolean(int parameterIndex, boolean x) throws SQLException {
        delegate().setBoolean(parameterIndex, x);
    }

    @Override
    public void setByte(int parameterIndex, byte x) throws SQLException {
        delegate().setByte(parameterIndex, x);
    }

    @Override
    public void setBytes(int parameterIndex, byte[] x) throws SQLException {
        delegate().setBytes(parameterIndex, x);
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
        delegate().setCharacterStream(parameterIndex, reader);
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
        delegate().setCharacterStream(parameterIndex, reader, length);
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {
        delegate().setCharacterStream(parameterIndex, reader, length);
    }

    @Override
    public void setClob(int parameterIndex, Clob x) throws SQLException {
        delegate().setClob(parameterIndex, x);
    }

    @Override
    public void setClob(int parameterIndex, Reader reader) throws SQLException {
        delegate().setClob(parameterIndex, reader);
    }

    @Override
    public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
        delegate().setClob(parameterIndex, reader, length);
    }

    @Override
    public void setDate(int parameterIndex, Date x) throws SQLException {
        delegate().setDate(parameterIndex, x);
    }

    @Override
    public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
        delegate().setDate(parameterIndex, x, cal);
    }

    @Override
    public void setDouble(int parameterIndex, double x) throws SQLException {
        delegate().setDouble(parameterIndex, x);
    }

    @Override
    public void setFloat(int parameterIndex, float x) throws SQLException {
        delegate().setFloat(parameterIndex, x);
    }

    @Override
    public void setInt(int parameterIndex, int x) throws SQLException {
        delegate().setInt(parameterIndex, x);
    }

    @Override
    public void setLong(int parameterIndex, long x) throws SQLException {
        delegate().setLong(parameterIndex, x);
    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
        delegate().setNCharacterStream(parameterIndex, value);
    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {
        delegate().setNCharacterStream(parameterIndex, value, length);
    }

    @Override
    public void setNClob(int parameterIndex, NClob value) throws SQLException {
        delegate().setNClob(parameterIndex, value);
    }

    @Override
    public void setNClob(int parameterIndex, Reader reader) throws SQLException {
        delegate().setNClob(parameterIndex, reader);
    }

    @Override
    public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
        delegate().setNClob(parameterIndex, reader, length);
    }

    @Override
    public void setNString(int parameterIndex, String value) throws SQLException {
        delegate().setNString(parameterIndex, value);
    }

    @Override
    public void setNull(int parameterIndex, int sqlType) throws SQLException {
        delegate().setNull(parameterIndex, sqlType);
    }

    @Override
    public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
        delegate().setNull(parameterIndex, sqlType, typeName);
    }

    @Override
    public void setObject(int parameterIndex, Object x) throws SQLException {
        delegate().setObject(parameterIndex, x);
    }

    @Override
    public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
        delegate().setObject(parameterIndex, x, targetSqlType);
    }

    @Override
    public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {
        delegate().setObject(parameterIndex, x, targetSqlType, scaleOrLength);
    }

    @Override
    public void setRef(int parameterIndex, Ref x) throws SQLException {
        delegate().setRef(parameterIndex, x);
    }

    @Override
    public void setRowId(int parameterIndex, RowId x) throws SQLException {
        delegate().setRowId(parameterIndex, x);
    }

    @Override
    public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
        delegate().setSQLXML(parameterIndex, xmlObject);
    }

    @Override
    public void setShort(int parameterIndex, short x) throws SQLException {
        delegate().setShort(parameterIndex, x);
    }

    @Override
    public void setString(int parameterIndex, String x) throws SQLException {
        delegate().setString(parameterIndex, x);
    }

    @Override
    public void setTime(int parameterIndex, Time x) throws SQLException {
        delegate().setTime(parameterIndex, x);
    }

    @Override
    public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
        delegate().setTime(parameterIndex, x, cal);
    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
        delegate().setTimestamp(parameterIndex, x);
    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
        delegate().setTimestamp(parameterIndex, x, cal);
    }

    @Override
    public void setURL(int parameterIndex, URL x) throws SQLException {
        delegate().setURL(parameterIndex, x);
    }

    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@code setCharacterStream}
     */
    @Override
    public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
        delegate().setUnicodeStream(parameterIndex, x, length);
    }

    @Override
    public ResultSet executeQuery() throws SQLException {
        return delegate().executeQuery();
    }

    @Override
    public int executeUpdate() throws SQLException {
        return delegate().executeUpdate();
    }

    @Override
    public void clearParameters() throws SQLException {
        delegate().clearParameters();
    }

    @Override
    public boolean execute() throws SQLException {
        return delegate().execute();
    }

    @Override
    public void addBatch() throws SQLException {
        delegate().addBatch();
    }

    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        return delegate().getMetaData();
    }

    @Override
    public ParameterMetaData getParameterMetaData() throws SQLException {
        return delegate().getParameterMetaData();
    }

}
