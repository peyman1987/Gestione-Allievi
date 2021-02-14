package com.peyman.gestione_allievi.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class IndexController {

    @GetMapping({"","/","/index"})
    public String getIndex(){
        return "Index";
    }
}
