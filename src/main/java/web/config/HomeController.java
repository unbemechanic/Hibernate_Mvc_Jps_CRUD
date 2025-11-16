package web.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "users"; // JSP or Thymeleaf view name
    }
    @GetMapping("/spring_crud") // optional specific mapping
    public String springCrud() {
        return "users";
    }
}

