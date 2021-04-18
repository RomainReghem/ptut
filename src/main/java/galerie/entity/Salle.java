package galerie.entity;
import javax.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Salle {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @NonNull
    private String nom;
    
    //Penibility index
    private int pIndex;
    
  /* @OneToOne(mappedBy = "SalleBruit")
    private CapteurBruit cBruit;
    
    @OneToOne(mappedBy = "SalleHumidite")
    private CapteurBruit cHum;
    
    @OneToOne(mappedBy = "SalleLumiere")
    private CapteurBruit cLum;
    
    @OneToOne(mappedBy = "SalleTemperature")
    private CapteurBruit cTemp; */
   
}
