package galerie.entity;
import java.util.LinkedList;
import java.util.List;
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
    
    @OneToMany(mappedBy = "SalleBruit")
    private List<CapteurBruit> cBruit = new LinkedList<>();
    
    @OneToMany(mappedBy = "SalleHumidite")
    private List<CapteurHumidite> cHum = new LinkedList<>();
    
    @OneToMany(mappedBy = "SalleLumiere")
    private List<CapteurLumiere> cLum = new LinkedList<>();
    
    @OneToMany(mappedBy = "SalleTemperature")
    private List<CapteurTemperature> cTemp = new LinkedList<>(); 
   
}
