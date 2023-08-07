package unit2psw.unit2psw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 커밋을 위한 주석추가
@RestController
@RequestMapping("/api")
public class TodoController {

    @GetMapping("/printMessage")
    public String printMessage() {
        return "To-do Application!";
    }
}
