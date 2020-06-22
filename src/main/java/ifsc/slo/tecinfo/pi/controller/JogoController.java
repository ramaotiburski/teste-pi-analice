package ifsc.slo.tecinfo.pi.controller;

import ifsc.slo.tecinfo.pi.modelo.Jogo;
import ifsc.slo.tecinfo.pi.repositorio.AvaliacaoRepositorio;
import ifsc.slo.tecinfo.pi.repositorio.JogoRepositorio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author analice
 */
@Controller
@RequestMapping("/jogos/")
public class JogoController {
    
    private List<Jogo> jogos = new ArrayList<>();

    private JogoRepositorio JogoRepositorio;
    @Autowired
    private AvaliacaoRepositorio avaliacaoRepositorio;
    
    @Autowired 
    public JogoController(JogoRepositorio repositorio) {
        this.JogoRepositorio = repositorio;
    }
    
    @GetMapping("cadastrar")
    public String showSignUpForm(Jogo jogo, Model model) {
        
              
        model.addAttribute("jogos", JogoRepositorio.findAll());
        return "add-game";
    }
    
    @GetMapping("mostrar")
    public String showUpdateForm(Model model) {
   
        model.addAttribute("jogos", JogoRepositorio.findAll());
        return "index";
    }
    
    
    
}
