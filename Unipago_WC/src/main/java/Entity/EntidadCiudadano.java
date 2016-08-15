package Entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "PERSONA")
@NamedQuery(name="Ciudadano.findAll", query="SELECT p FROM EntidadCiudadano p")
public class EntidadCiudadano implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "NOMBRE")
    private String Nombre;
    @Column(name = "APELLIDO")
    private String Apellido;
    @Column(name = "SEXO")
    private char Sexo;
    @Column(name = "FECHA_NACIMIENTO")
    private String Fecha;
    @Column(name = "DIRECCION")
    private String Direccion;
    @Column(name = "CORREO_ELECTRONICO")
    private String Correo;
    @Column(name = "TELEFONO")
    private String Telefono;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

}
