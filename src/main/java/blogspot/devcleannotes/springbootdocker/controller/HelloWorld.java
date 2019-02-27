package blogspot.devcleannotes.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello from docker container";
    }

}
