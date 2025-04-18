package lk.ijse.dep13.requesttime.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyHttpController {

    @GetMapping
    public String greeting(String str) {
        return "<h1>Hello Controller</h1>";
    }
}
