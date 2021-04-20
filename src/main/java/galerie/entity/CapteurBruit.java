package galerie.entity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author romai
 */
@Getter @Setter @NoArgsConstructor @ToString
@Entity // Une entité JPA
public class CapteurBruit {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private int bruitIndex;
    
    private LocalDateTime dateMesure = LocalDateTime.now();
    
    @ManyToOne
    Salle SalleBruit;
}