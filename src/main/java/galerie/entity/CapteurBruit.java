package galerie.entity;
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
    
    @OneToOne
    private Salle SalleBruit;
}