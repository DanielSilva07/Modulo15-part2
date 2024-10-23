package com.daniel.silva.cadastro_de_memes.service;

import com.daniel.silva.cadastro_de_memes.entity.Meme;
import com.daniel.silva.cadastro_de_memes.repository.MemeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemeService {

    private final MemeRepository repository;

    public MemeService(MemeRepository repository) {
        this.repository = repository;
    }

    public Meme newMeme(Meme meme){
        return repository.save(meme);
    }


    public List<Meme>getAll(){
        return repository.findAll();
    }








}
