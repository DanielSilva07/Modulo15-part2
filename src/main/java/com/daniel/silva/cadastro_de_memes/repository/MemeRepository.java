package com.daniel.silva.cadastro_de_memes.repository;

import com.daniel.silva.cadastro_de_memes.entity.Meme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemeRepository extends JpaRepository<Meme,Long> {
}
