package claudioServer.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;
    private String nivelEducativo;
    @Column(length = 300)
    private String institucion;

    public Educacion() {
    }

    public Educacion(Long id, String titulo, String nivelEducativo, String institucion) {
        this.id = id;
        this.titulo = titulo;
        this.nivelEducativo = nivelEducativo;
        this.institucion = institucion;
    }
}
