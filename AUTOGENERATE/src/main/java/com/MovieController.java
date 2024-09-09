package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entities")
public class MovieController {

    @Autowired
    private Repo repository;

    @PostMapping
    public MovieEntity createEntity(@RequestBody MovieEntity entity) {
        entity.setSn(IdGenerator.generateId());
        entity.setMovieid(IdGenerator.generateMovieId());
        return repository.save(entity);
    }

    @GetMapping
    public List<MovieEntity> getAllEntities() {
        return repository.findAll();
    }

}
