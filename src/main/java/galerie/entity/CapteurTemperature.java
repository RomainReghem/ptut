package galerie.entity;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author romai
 */
@Getter @Setter @NoArgsConstructor @ToString
@Entity // Une entité JPA
public class CapteurTemperature {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    private int temperatureIndex;
    
    @OneToOne
    private Salle SalleTemperature;
}
