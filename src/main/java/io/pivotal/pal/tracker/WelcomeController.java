package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
    private String msg;

    public WelcomeController(@Value("${the.msg}") String msg)
    {
        this.msg = msg;
    }

    @GetMapping("/")
    public String sayHello()
    {
        return msg;
    }
}