package claudioServer.model;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@Entity
public class Hard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int primercirculo;
    private int segundocirculo;
    private int tercercirculo;
    private int cuartocirculo;
    private int quintocirculo;
    private int sextocirculo;


    public Hard() {
    }

    public Hard(Long id, int primercirculo, int segundocirculo, int tercercirculo, int cuartocirculo, int quintocirculo, int sextocirculo) {
        this.id = id;
        this.primercirculo = primercirculo;
        this.segundocirculo = segundocirculo;
        this.tercercirculo = tercercirculo;
        this.cuartocirculo = cuartocirculo;
        this.quintocirculo = quintocirculo;
        this.sextocirculo = sextocirculo;
    }
}
