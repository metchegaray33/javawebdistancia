package clase2.persistence;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {

    T grabar(T entidad)throws SQLException;
    void actualizar(T actualizar) throws SQLException;
    void borrar(Integer id) throws SQLException;
    List<T> obtenerTodos() throws SQLException;
    T obtenerPorId(Integer id) throws SQLException;
    List<T> obtenerPor(String campo, Object value) throws SQLException;

}
