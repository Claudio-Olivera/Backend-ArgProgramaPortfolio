package claudioServer.model;
import javax.persistence.*;

@Entity
public class Acerca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombres;
    private String apellidos;
    private String ocupacion;
    @Column(length = 1000)
    private String sobremi;
    private String email;
    private String fechaNacimiento;
    private String urlCV;
    private String telefono;
    @Lob
    private String imgPerfil;
    @Lob
    private String imgRepresentativa;

    public Acerca(String urlCV) {
        this.urlCV = urlCV;
    }

    public Acerca(Long id, String nombres, String apellidos, String ocupacion, String sobremi, String email, String fechaNacimiento, String urlCV, String telefono, String imgPerfil, String imgRepresentativa) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ocupacion = ocupacion;
        this.sobremi = sobremi;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.urlCV = urlCV;
        this.telefono = telefono;
        this.imgPerfil = imgPerfil;
        this.imgRepresentativa = imgRepresentativa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getSobremi() {
        return sobremi;
    }

    public void setSobremi(String sobremi) {
        this.sobremi = sobremi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUrlCV() {
        return urlCV;
    }

    public void setUrlCV(String urlCV) {
        this.urlCV = urlCV;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getImgRepresentativa() {
        return imgRepresentativa;
    }

    public void setImgRepresentativa(String imgRepresentativa) {
        this.imgRepresentativa = imgRepresentativa;
    }
}
