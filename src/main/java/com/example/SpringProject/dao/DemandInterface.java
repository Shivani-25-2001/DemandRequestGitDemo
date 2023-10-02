package com.example.SpringProject.dao;

import com.example.SpringProject.model.DemandRequest;

import java.util.List;

 interface DemandInterface {
public String createDemand(DemandRequest demandRequest);
public List<DemandRequest> getAllDemandRequest();
public List<String>getAllLevels();

}
