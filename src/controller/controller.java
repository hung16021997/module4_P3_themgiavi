package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {

    @GetMapping("/choose")
    public String showChoosenList(){
        return "choosenList";
    }


    @PostMapping("/save")
    public String save(@RequestParam(value = "condiment",defaultValue = "You do not choice anything") String[] condiment, Model model){
        if(condiment!=null){
            model.addAttribute("sandwich",condiment);

        }else {
            condiment[0] = "You do not choice anything";
            model.addAttribute("condiment",condiment);
        }
        return "finalSandwich";
    }
}
