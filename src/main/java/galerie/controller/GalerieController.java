package galerie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import galerie.dao.SalleRepository;
import galerie.entity.Salle;
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
    

    /**
     * Affiche toutes les catégories dans la base
     *
     * @param model pour transmettre les informations à la vue
     * @return le nom de la vue à afficher ('afficheGaleries.html')
     */
    @GetMapping(path = "show")
    public String afficheToutesLesGaleries(Model model) {
        model.addAttribute("galeries", dao.findAll());
        return "afficheSalles";
    }
    
     @GetMapping(path = "salle")
    public String afficheLaSalle(Model model) {
        model.addAttribute("galeries", dao.findAll());
        return "salle";
    }
}
