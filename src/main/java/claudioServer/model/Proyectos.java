package claudioServer.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String proNombre;
    private String proFecha;
    @Column (length = 500)
    private String proLink;
    @Lob
    private String proImg;
    @Column(length = 1000)
    private String proDescripcion;



    public Proyectos() {
    }

    public Proyectos(Long id, String proNombre, String proFecha, String proLink, String proImg, String proDescripcion) {
        this.id = id;
        this.proNombre = proNombre;
        this.proFecha = proFecha;
        this.proLink = proLink;
        this.proImg = proImg;
        this.proDescripcion = proDescripcion;

    }
}
