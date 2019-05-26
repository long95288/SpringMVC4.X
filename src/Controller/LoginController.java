package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/info")
    public String info(Model model){
        model.addAttribute("info","Model传过来的数据");
        return "info";
    }

    @RequestMapping("/error")
    public String e(){
        return "error";
    }
}
