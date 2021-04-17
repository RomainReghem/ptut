package galerie.entity;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.time.temporal.ChronoUnit;
import javax.persistence.*;
import lombok.*;

public class Salle {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @NonNull
    private String nom;
    
    //Penibility index
    private int pIndex;
    
   @OneToOne(mappedBy = "SalleBruit")
    private CapteurBruit cBruit;
    
    @OneToOne(mappedBy = "SalleHumidite")
    private CapteurBruit cHum;
    
    @OneToOne(mappedBy = "SalleLumiere")
    private CapteurBruit cLum;
    
    @OneToOne(mappedBy = "SalleTemperature")
    private CapteurBruit cTemp;
   
}
