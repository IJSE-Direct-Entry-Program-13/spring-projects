package lk.ijse.dep13.spring.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class MyHttpController {

    @GetMapping
    public List<String> greeting(){
        // return "<h1>Hello Spring Web</h1>";
        return List.of("Kasun", "Nuwan", "Ruwan");
    }
}
