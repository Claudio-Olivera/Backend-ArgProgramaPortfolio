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
    private int circulo;
    private String icono;
    private String nombre;
    private String color;

    public Hard() {
    }

    public Hard(Long id, int circulo, String icono, String nombre , String color) {
        this.id = id;
        this.circulo = circulo;
        this.icono = icono;
        this.nombre = nombre;
        this.color = color;
    }
}
