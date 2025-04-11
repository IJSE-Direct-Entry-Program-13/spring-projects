package lk.ijse.dep13.finalexample.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello1")
@RestController
public class MyHttpController {

    @GetMapping
    public String hello() {
        System.out.println("MyHttpController:hello()");
        return "<h1>Hello</h1>";
    }
}
