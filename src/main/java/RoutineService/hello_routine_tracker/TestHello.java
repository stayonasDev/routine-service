package RoutineService.hello_routine_tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestHello {

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
