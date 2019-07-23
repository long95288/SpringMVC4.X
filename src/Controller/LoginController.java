package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author longquanxiao
 */
@Controller
public class LoginController {

    /**
     * @param model 首页请求
     * @return index,jsp
     */
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title","首页");
        model.addAttribute("END","首页结尾");
        return "index";
    }

    /**
     * info 接口
     * @param model 信息的接口
     * @return  提示信息
     */
    @RequestMapping("/info")
    public String info(Model model){
        model.addAttribute("info","Model传过来的数据");
        return "info";
    }

    /**
     * login的get方法
     * @param model 未登录返回的模型
     * @return info
     */
    @GetMapping(path = "/login")
    public String login2(Model model) {
        model.addAttribute("info","未登陆");
        return "info";
    }

    /**
     * @param model 模型
     * @return info,jsp
     */
     @RequestMapping(path = "/login",method = RequestMethod.POST)
    public String login(Model model,String account,String password ) {
        model.addAttribute("account",account);
        model.addAttribute("password",password);
        return "info";
    }

    /**
     *
     * @param model 错误模型
     * @return 返回错误界面
     *
     */
    @RequestMapping("/error")
    public String e(Model model){
        model.addAttribute("errorMsg","模型传送错误信息");
        return "error";
    }
}
