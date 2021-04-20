package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import galerie.entity.Salle;

// This will be AUTO IMPLEMENTED by Spring 
public interface SalleRepository extends JpaRepository<Salle, Integer> {

    @Query(value = "SELECT bruit_index FROM capteur_bruit WHERE salle_bruit_id = :id ORDER BY date_mesure DESC LIMIT 1", nativeQuery = true)
    int lastBruit(Integer id);

    @Query(value = "SELECT humidite_index FROM capteur_humidite WHERE salle_humidite_id = :id ORDER BY date_mesure DESC LIMIT 1", nativeQuery = true)
    int lastHum(Integer id);

    @Query(value = "SELECT lumiere_index FROM capteur_lumiere WHERE salle_lumiere_id = :id ORDER BY date_mesure DESC LIMIT 1", nativeQuery = true)
    int lastLum(Integer id);

    @Query(value = "SELECT temperature_index FROM capteur_temperature WHERE salle_temperature_id = :id ORDER BY date_mesure DESC LIMIT 1", nativeQuery = true)
    int lastTemp(Integer id);
    
    @Query(value = "SELECT id FROM capteur_bruit WHERE salle_bruit_id = :id ORDER BY date_mesure DESC LIMIT 1", nativeQuery = true)
    int lastBruitID(Integer id);

    @Query(value = "SELECT id FROM capteur_humidite WHERE salle_humidite_id = :id ORDER BY date_mesure DESC LIMIT 1", nativeQuery = true)
    int lastHumID(Integer id);

    @Query(value = "SELECT id FROM capteur_lumiere WHERE salle_lumiere_id = :id ORDER BY date_mesure DESC LIMIT 1", nativeQuery = true)
    int lastLumID(Integer id);

    @Query(value = "SELECT id FROM capteur_temperature WHERE salle_temperature_id = :id ORDER BY date_mesure DESC LIMIT 1", nativeQuery = true)
    int lastTempID(Integer id);

}
