package cn.abc.action.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Think on 2018/6/27
 */
@Controller
@RequestMapping(value = "/hello", method = RequestMethod.GET)
public class OneController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(Model model) {
        String a = "你是真的可爱!";
        model.addAttribute("msg", "Spring MVC Say Hello!");
        model.addAttribute("name", "你是真的可爱");
        System.out.println(a);
        return "hello";
    }
}
