package com.api.bjjhunters.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("bbjhunters")
public class AthleteController {
    
}
