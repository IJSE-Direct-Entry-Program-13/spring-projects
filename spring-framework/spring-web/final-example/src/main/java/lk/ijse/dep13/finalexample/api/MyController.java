package lk.ijse.dep13.finalexample.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello2")
public class MyController {

    @GetMapping
    public ModelAndView hello(){
        System.out.println("MyController:hello()");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello.jsp");
        mv.addObject("id", "C001");
        mv.addObject("name", "Kasun");
        mv.addObject("address", "Galle");
        return mv;
    }
}
