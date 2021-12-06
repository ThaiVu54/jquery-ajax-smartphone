package com.codegym.service;

import com.codegym.model.Smartphone;
import com.codegym.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartphoneService implements ISmartphoneService{
    @Autowired
    private SmartphoneRepository phoneRepo;
    @Override
    public Iterable<Smartphone> findAll() {
        return phoneRepo.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return phoneRepo.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartphone) {
        return phoneRepo.save(smartphone);
    }

    @Override
    public void remove(Long id) {
        phoneRepo.deleteById(id);
    }
}
