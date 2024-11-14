package controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/home"}) // Mapping cho trang chính
    public String home(Model model) {
        model.addAttribute("message", "Welcome to my Spring Boot application!");
        return "index"; // Trả về tệp index.jsp trong /WEB-INF/views/
    }
    
}
