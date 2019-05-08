package clase2.domain;



import java.util.Objects;

public class Materia extends Entidad {

    private String nombre;
    private int cargaHoraria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Materia{");
        sb.append("id='").append(getId()).append('\'');
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", cargaHoraria=").append(cargaHoraria);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return getId().equals(materia.getId()) && cargaHoraria == materia.cargaHoraria &&
                nombre.equals(materia.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cargaHoraria);
    }
}
