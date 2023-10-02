package com.example.demo.controller;

import com.example.demo.dto.DadosAdicionarFilme;
import com.example.demo.dto.DadosAtualizarFilme;
import com.example.demo.model.Filme;
import com.example.demo.repository.FilmeRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme")
public class FilmeController {
    
    @Autowired
    private FilmeRepository repository;
    
    @PostMapping
    public void adicionarFilme(@RequestBody DadosAdicionarFilme dados){
        repository.save(new Filme(dados));
        
    }
    
    @GetMapping
    public ArrayList<Filme> recuperarFilmes(){
        ArrayList<Filme> filmes = (ArrayList<Filme>) repository.findAll();
        
        return filmes;
        
    }
    
    @PutMapping
    public void atualizarFilme(DadosAtualizarFilme dados){
      
  
    }
    
}
