package com.example.SpringProject.dao;

import com.example.SpringProject.model.*;
import com.example.SpringProject.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Component
public  class DemandImpl  {

    @Autowired
    private DemandRequestRepository demandRequestRepository;

    @Autowired
    private LevelRepository levelRepository;

    @Autowired
    private RequestedByRepository requestedByRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private StatusRepository statusRepository;

    @Autowired
    private TechnologyRepository technologyRepository;

    public String addDemand(DemandRequest demandRequest){
        String id="";
        DemandRequest demandRequest1= demandRequestRepository.save(demandRequest);
        id+=demandRequest1.getReqId();
        if(id.length()>0)
        {
            return "Demand Request "+id+" created sucessfully";
        }
        return "Demand Request not added";
    }

    public List<DemandRequest> getAllDemandRequest(){
        return (List<DemandRequest>) demandRequestRepository.findAll();
    }
    public List<String>getAllLevel(){
        return ((List<Level>) levelRepository.findAll()).stream().map(level -> level.getLevel()).collect(Collectors.toList());
    }

    public List<String> getAllRequestedBy(){
        return ((List<RequestedBy>) requestedByRepository.findAll()).stream().map(requestedBy ->requestedBy.getRequestedBy()).collect(Collectors.toList());
    }

    public List<String> getAllRole(){
        return ((List<Role>) roleRepository.findAll()).stream().map(role -> role.getRole()).collect(Collectors.toList());
    }

    public List<String> getAllStatus(){
        return ((List<Status>) statusRepository.findAll()).stream().map(status -> status.getStatus()).collect(Collectors.toList());
    }

    public List<String> getAllTechnology(){
        return ((List<Technology>) technologyRepository.findAll()).stream().map(technology -> technology.getTechnology()).collect(Collectors.toList());
    }

    public DemandRequest getById(String reqId){
        return demandRequestRepository.findById(reqId).orElse(null);

    }

}
