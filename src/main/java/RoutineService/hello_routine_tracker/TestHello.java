package RoutineService.hello_routine_tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/routines")
public class TestHello {

    @GetMapping("/routines/hello")
    public String routines() {
        return "/routines/hello";
    }

    @GetMapping("/hello")
    public String hello() {
        return "/hello";
    }
}
