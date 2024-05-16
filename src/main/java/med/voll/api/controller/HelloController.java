package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
<<<<<<< HEAD
    public String olaMundo() {
        return "Hello World Spring!";
    }
=======
    public String olaMundo(){
        return "Hello World! raytisso";
    }

>>>>>>> 3f58f9e61c24eb35e694b53387087f9d73fb9746
}
