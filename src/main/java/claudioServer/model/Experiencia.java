package claudioServer.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String empleo;
    @Column(length = 1000)
    private String descripcionEmpleo;


    public Experiencia() {
    }

    public Experiencia(Long id, String empleo, String descripcionEmpleo) {
        this.id = id;
        this.empleo = empleo;
        this.descripcionEmpleo = descripcionEmpleo;
    }
}
