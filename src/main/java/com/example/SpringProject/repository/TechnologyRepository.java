package com.example.SpringProject.repository;


import com.example.SpringProject.model.Technology;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface TechnologyRepository extends CrudRepository<Technology,String> {
}
