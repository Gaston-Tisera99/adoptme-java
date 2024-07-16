package com.adoptme.petshop.services;

import org.springframework.beans.factory.annotation.Autowired;

public class PetsService {


    public User save(User user){
        return repository.save(user);
    }

    public List<User> readAll(){}

    public Optional<User> readOne(Long id){

    }

    public void destroyOne(Long id){
        repository.deleteById(id);
    }
}
