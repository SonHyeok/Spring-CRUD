package firstCRUD.son.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")

public class border_controller {
    @GetMapping("/hello")
    public String Hello() {
        return "/boards/hello";
    }
}
