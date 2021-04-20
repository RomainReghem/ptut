package galerie.entity;
import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author romai
 */
@Getter @Setter @NoArgsConstructor @ToString
@Entity // Une entité JPA
public class CapteurHumidite {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    private int humiditeIndex;
    
    private LocalDateTime dateMesure = LocalDateTime.now();
    
    @ManyToOne
    Salle SalleHumidite;
}