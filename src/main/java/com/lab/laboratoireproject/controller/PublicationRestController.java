package com.lab.laboratoireproject.controller;

import com.lab.laboratoireproject.entites.Publication;
import com.lab.laboratoireproject.service.IPublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PublicationRestController {
    @Autowired
    IPublicationService publicationService;

    @RequestMapping(value = "/publication" ,method = RequestMethod.GET)
    public List<Publication> findAll(){
        return publicationService.findAllPub();
    }
    @GetMapping(value = "/publication/{id}")
    public Publication findbyID(@PathVariable long id){
        return publicationService.findPubById(id);
    }
    @GetMapping(value = "/publication/{type}")
    public List<Publication> findbyType(@PathVariable String type){
        return publicationService.findPubByType(type);
    }
    @PostMapping(value = "/publications")
    public void addPublication(@RequestBody Publication publication){
        publicationService.addPub(publication);
    }

}
