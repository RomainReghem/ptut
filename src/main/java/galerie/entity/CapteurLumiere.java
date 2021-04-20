package galerie.entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author romai
 */
@Getter @Setter @NoArgsConstructor @ToString
@Entity // Une entité JPA
public class CapteurLumiere implements Serializable {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    private int lumiereIndex;
    
    private LocalDateTime dateMesure = LocalDateTime.now();
    
    @ManyToOne
    Salle SalleLumiere;
}
