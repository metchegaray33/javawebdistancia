package clase2.persistence;


import clase2.domain.Materia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MateriaDao extends DaoSupport<Materia> {

    @Override
    protected Set<String> columnNames() {
        return null;
    }

    @Override
    protected String pkName() {
        return null;
    }

    public MateriaDao(ConnectionManager connectionManager) {
        super(connectionManager);
    }

    @Override
    protected String sqlInsert(Materia entidad) {
        return "insert into materia (nombre, carga_horaria) values (?,?)";
    }


    @Override
    protected String sqlUpdate(Materia entidad) {
        return "update materia set nombre=?, carga_horaria = ? where id = ?";
    }

    @Override
    protected Map<Integer, Object> getParameters(Materia entidad) {
        Map<Integer, Object> parameters = new HashMap<>();
        parameters.put(1, entidad.getNombre() );
        parameters.put(2, entidad.getCargaHoraria());

        return parameters;
    }

    @Override
    protected String tableName() {
        return "materia";
    }

    @Override
    protected Materia createEntity(ResultSet resultSet) throws SQLException {
        Materia materia = new Materia();
        materia.setId(resultSet.getInt("id"));
        materia.setNombre(resultSet.getString("nombre"));
        materia.setCargaHoraria(resultSet.getInt("carga_horaria"));
        return materia;
    }
}


