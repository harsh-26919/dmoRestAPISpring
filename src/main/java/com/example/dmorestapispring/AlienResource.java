package com.example.dmorestapispring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlienResource
{
    @Autowired
    AlienRespository repo;

    @GetMapping("aliens")
    public List<Alien> getAliens()
    {
        List<Alien> aliens = (List<Alien>)repo.findAll();



        return aliens;
    }
}
