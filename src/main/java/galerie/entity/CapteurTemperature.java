package galerie.entity;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.time.temporal.ChronoUnit;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author romai
 */
public class CapteurTemperature {
    
    private int temperatureIndex;
    
    @OneToOne
    private Salle SalleTemperature;
}
