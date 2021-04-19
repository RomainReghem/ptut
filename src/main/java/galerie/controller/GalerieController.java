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
        model.addAttribute("galeries", dao.findAll());
        return "salle";

    }

    @GetMapping(path = "salle2")
    public String afficheSalle2(Model model) {
        model.addAttribute("salles", dao.findAll());
        model.addAttribute("cBruit", cBruit.findAll());
        model.addAttribute("cHum", cHum.findAll());
        model.addAttribute("cLum", cLum.findAll());
        model.addAttribute("cTemp", cTemp.findAll());
        return "salle2";
    }
    
    @GetMapping(path = "salle3")
    public String afficheSalle3(Model model) {
        model.addAttribute("salles", dao.findAll());
        model.addAttribute("cBruit", cBruit.findAll());
        model.addAttribute("cHum", cHum.findAll());
        model.addAttribute("cLum", cLum.findAll());
        model.addAttribute("cTemp", cTemp.findAll());
        return "salle3";
    }
    
    @GetMapping(path = "salle4")
    public String afficheSalle4(Model model) {
        model.addAttribute("salles", dao.findAll());
        model.addAttribute("cBruit", cBruit.findAll());
        model.addAttribute("cHum", cHum.findAll());
        model.addAttribute("cLum", cLum.findAll());
        model.addAttribute("cTemp", cTemp.findAll());
        return "salle4";
    }
}
