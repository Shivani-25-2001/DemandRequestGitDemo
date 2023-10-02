package com.example.SpringProject.repository;


import com.example.SpringProject.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface RoleRepository extends CrudRepository<Role,String> {
}
