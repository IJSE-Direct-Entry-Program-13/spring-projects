package lk.ijse.dep13.spring.web.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/hello")
public class MyHttpController {

    @GetMapping
    public String greeting(){
        return "<h1>Hello World!</h1>";
    }

}
