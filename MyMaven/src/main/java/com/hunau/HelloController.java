package com.hunau;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


    /**
     * Created by sang on 2018/7/4.
     */
    @RestController
    public class HelloController {
        @GetMapping("/hello")
        public String hello() {
            return "高彭，学号为201841882120";
        }
    }


