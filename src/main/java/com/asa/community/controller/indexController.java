package com.asa.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by codedrinker on 2020/1/16
 */
@Controller
public class indexController {
    @GetMapping("/")
    public String index() { return "index"; }
}
