package com.example.SpringProject.repository;

import com.example.SpringProject.model.RequestedBy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface RequestedByRepository extends CrudRepository<RequestedBy,String> {
}
