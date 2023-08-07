package unit2psw.unit2psw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// BE 45기 박성원
// dev에서 main 브랜치 머지 연습을 위한 주석
@RestController
@RequestMapping("/api")
public class TodoController {

    @GetMapping("/printMessage")
    public String printMessage() {
        return "To-do Application!";
    }
}
