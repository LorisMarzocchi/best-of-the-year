package org.lessons.bestoftheyear.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class indexController {
    @GetMapping//risponde solo a ("/")
    @ResponseBody
    public String index() {
        return "<html><body><h1>CIAOooooo</h1></body></html>";
    }
}
