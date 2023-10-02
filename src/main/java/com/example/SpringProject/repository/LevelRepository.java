package com.example.SpringProject.repository;

import com.example.SpringProject.model.Level;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface LevelRepository extends CrudRepository<Level,String> {
}
