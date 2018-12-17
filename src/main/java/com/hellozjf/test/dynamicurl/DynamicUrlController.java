package com.hellozjf.test.dynamicurl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class DynamicUrlController {

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @GetMapping("/test")
    public String test(@RequestParam("hello") String hello) {
        log.debug("hello = {}", hello);
        return "test";
    }
}
