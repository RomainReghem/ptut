package galerie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import galerie.dao.CapteurBruitRepository;
import galerie.dao.CapteurHumiditeRepository;
import galerie.dao.CapteurLumiereRepository;
import galerie.dao.CapteurTemperatureRepository;
import galerie.dao.SalleRepository;
import galerie.entity.Salle;
import galerie.entity.CapteurBruit;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Edition des catégories, sans gestion des erreurs
 */
@Controller
@RequestMapping(path = "/capteurs")

public class GalerieController {

    @Autowired
    private SalleRepository dao;
    
    @Autowired
    private CapteurBruitRepository cBruit;
    
    @Autowired
    private CapteurHumiditeRepository cHum;
    
    @Autowired
    private CapteurLumiereRepository cLum;
    
    @Autowired
    private CapteurTemperatureRepository cTemp;
    

    /**
     * Affiche toutes les catégories dans la base
     *
     * @param model pour transmettre les informations à la vue
     * @return le nom de la vue à afficher ('afficheGaleries.html')
     */
    @GetMapping(path = "show")
    public String afficheToutesLesGaleries(Model model) {
        //model.addAttribute("salles", dao.findAll());
        return "afficheSalles";
    }

    @GetMapping(path = "salle")
    public String afficheLaSalle(Model model) {
        model.addAttribute("salles", dao.findAll());
        model.addAttribute("cBruit", cBruit.findAll());
        model.addAttribute("cHum", cHum.findAll());
        model.addAttribute("lastHumValue", dao.lastHum(1));
        model.addAttribute("lastTempValue", dao.lastTemp(1));
        model.addAttribute("lastBruitValue", dao.lastBruit(1));
        model.addAttribute("lastLumValue", dao.lastLum(1));
        model.addAttribute("cLum", cLum.findAll());
        model.addAttribute("cTemp", cTemp.findAll());
        model.addAttribute("lastBruitID", dao.lastBruitID(1));
        model.addAttribute("lastHumID", dao.lastHumID(1));
        model.addAttribute("lastLumID", dao.lastLumID(1));
        model.addAttribute("lastTempID", dao.lastTempID(1));        
        model.addAttribute("index", calculPenibilite(1));
        return "salle";

    }

    @GetMapping(path = "salle2")
    public String afficheSalle2(Model model) {
        model.addAttribute("salles", dao.findAll());
        model.addAttribute("cBruit", cBruit.findAll());
        model.addAttribute("cHum", cHum.findAll());
        model.addAttribute("lastHumValue", dao.lastHum(2));
        model.addAttribute("lastTempValue", dao.lastTemp(2));
        model.addAttribute("lastBruitValue", dao.lastBruit(2));
        model.addAttribute("lastLumValue", dao.lastLum(2));
        model.addAttribute("cLum", cLum.findAll());
        model.addAttribute("cTemp", cTemp.findAll());
        model.addAttribute("lastBruitID", dao.lastBruitID(2));
        model.addAttribute("lastHumID", dao.lastHumID(2));
        model.addAttribute("lastLumID", dao.lastLumID(2));
        model.addAttribute("lastTempID", dao.lastTempID(2));        
        model.addAttribute("index", calculPenibilite(2));
        return "salle2";
    }
    
    @GetMapping(path = "salle3")
    public String afficheSalle3(Model model) {
        model.addAttribute("salles", dao.findAll());
        model.addAttribute("cBruit", cBruit.findAll());
        model.addAttribute("cHum", cHum.findAll());
        model.addAttribute("cLum", cLum.findAll());
        model.addAttribute("cTemp", cTemp.findAll());
        model.addAttribute("lastHumValue", dao.lastHum(3));
        model.addAttribute("lastTempValue", dao.lastTemp(3));
        model.addAttribute("lastBruitValue", dao.lastBruit(3));
        model.addAttribute("lastLumValue", dao.lastLum(3));
        model.addAttribute("lastBruitID", dao.lastBruitID(3));
        model.addAttribute("lastHumID", dao.lastHumID(3));
        model.addAttribute("lastLumID", dao.lastLumID(3));
        model.addAttribute("lastTempID", dao.lastTempID(3));
        model.addAttribute("index", calculPenibilite(3));
        return "salle3";
    }
    
    @GetMapping(path = "salle4")
    public String afficheSalle4(Model model) {
        model.addAttribute("salles", dao.findAll());
        model.addAttribute("cBruit", cBruit.findAll());
        model.addAttribute("cHum", cHum.findAll());
        model.addAttribute("cLum", cLum.findAll());
        model.addAttribute("cTemp", cTemp.findAll());
        model.addAttribute("lastHumValue", dao.lastHum(4));
        model.addAttribute("lastTempValue", dao.lastTemp(4));
        model.addAttribute("lastBruitValue", dao.lastBruit(4));
        model.addAttribute("lastLumValue", dao.lastLum(4));
        model.addAttribute("lastBruitID", dao.lastBruitID(4));
        model.addAttribute("lastHumID", dao.lastHumID(4));
        model.addAttribute("lastLumID", dao.lastLumID(4));
        model.addAttribute("lastTempID", dao.lastTempID(4));
        model.addAttribute("index", calculPenibilite(4));
        return "salle4";
    }
    
    // l'id de la salle en paramètre
    public int calculPenibilite(int s) {
        int b = dao.lastBruit(s);
        int h = dao.lastHum(s);
        int l = dao.lastLum(s);
        int t = dao.lastTemp(s);
        int p = 0;
        // pénibilité bruit
        if(b < 30){
            p += 5;
        }
        else if(30 <= b && b <= 70){
            p += 4;
        }
        else if(71 <= b && b <= 100){
            p += 3;
        }
        else if(101 <= b && b <= 130){
            p += 2;
        }
        else if(b > 130){
            p += 1;
        }
        // pénibilité humidité
        
        if (h >= 40 && h <= 60){
            p += 5;
        }
        
        else if ((h < 40 && h >= 30) || (h > 60 && h <= 70)){
            p += 4;
        }
        
        else if ((h < 30 && h >= 20) || (h > 70 && h <= 80)){
            p += 3;
        }
        
        else if ((h < 20 && h >= 10) || (h > 80 && h <= 90)){
            p += 2;
        }
        else{
            p += 1;
        }
        
        // pénibilité lumière
        
        if (l >= 250 && l <= 510){
            p += 5;
        }
        
        else if ((l < 250 && l >= 200) || (l > 510 && l <= 750)){
            p += 4;
        }
        
        else if ((l < 200 && l >= 150) || (l > 750 && l <= 1000)){
            p += 3;
        }
        
        else if ((l < 150 && l >= 100) || (l > 1000 && l <= 1500)){
            p += 2;
        }
        
        else{
            p += 1;
        }
        
        // pénibilité température
        
        if (t >= 18 && t <= 21){
            p += 5;
        }
        
        else if ((t < 18 && t >= 17)|| (t > 21 && t <= 22)){
            p += 4;
        }
        
        else if ((t < 17 && t >= 16)|| (t > 22 && t <= 23)){
            p += 3;
        }
        
        else if ((t < 16 && t >= 15)|| (t > 23 && t <= 24)){
            p += 2;
        }
        else {
            p += 1;
        }
        return p;
       
    }
}
