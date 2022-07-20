package claudioServer.model;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@Entity
public class Soft {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String softTitulo;
    @Column(length = 1000)
    private String softDescripcion;
    private String Icono;


    public Soft() {
    }

    public Soft(Long id, String softTitulo, String softDescripcion, String icono) {
        this.id = id;
        this.softTitulo = softTitulo;
        this.softDescripcion = softDescripcion;
        this.Icono = icono;
    }
}
