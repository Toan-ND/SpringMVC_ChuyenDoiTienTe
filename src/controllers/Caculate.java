package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Caculate {

    @GetMapping("/index")
    public String caculate(){

        return "index";
    }

    @PostMapping("/caculate")
    public  String caculate(@RequestParam double tigia, @RequestParam double USD, Model model){
        double vnd = tigia * USD;
        model.addAttribute("vnd", vnd);
        return "caculate";
    }


}
