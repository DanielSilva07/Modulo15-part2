package com.daniel.silva.cadastro_de_memes.controller;

import com.daniel.silva.cadastro_de_memes.entity.Meme;
import com.daniel.silva.cadastro_de_memes.service.MemeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meme")
public class MemeController {

    private final MemeService service;

    public MemeController(MemeService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Meme>newMeme(@RequestBody Meme meme){
        return ResponseEntity.status(201).body(service.newMeme(meme));
    }

    @GetMapping
    public ResponseEntity<List<Meme>>getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }










}
