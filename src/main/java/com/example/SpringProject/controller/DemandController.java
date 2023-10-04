package com.example.SpringProject.controller;

import com.example.SpringProject.dao.DemandImpl;
//import com.example.SpringProject.dao.DemandInterface;
import com.example.SpringProject.model.DemandRequest;
import com.example.SpringProject.model.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemandController {

    @Autowired
    private DemandImpl demandImpl;

    @GetMapping("/getdemands")
    public ResponseEntity<List<DemandRequest>> getAllDemand(){
        List<DemandRequest> demands=null;
        try
        {
            demands=demandImpl.getAllDemandRequest();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("console added for get request");
        return new ResponseEntity<List<DemandRequest>>(demands,HttpStatus.OK);


    }

    @PostMapping("/createdemand")
    public ResponseEntity<String> createDemand(@RequestBody DemandRequest demandRequest){
        String response="";
        try
        {
            response+=demandImpl.addDemand(demandRequest);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("console for post request added");
        return new ResponseEntity<String>(response,HttpStatus.OK);

    }
    @GetMapping("/getdemandlevels")
    public ResponseEntity<List<String>> getAllDemandLevel(){
        List<String> level=null;
        try
        {
            level=demandImpl.getAllLevel();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("cnsole for getAll request");
        return new ResponseEntity<List<String>>(level,HttpStatus.OK);

    }

    @GetMapping("/getrequestedBy")
    public ResponseEntity<List<String>> getAllRequestedBy(){
        List<String> reqBy=null;
        try
        {
            reqBy=demandImpl.getAllRequestedBy();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<List<String>>(reqBy,HttpStatus.OK);

    }

    @GetMapping("/getrole")
    public ResponseEntity<List<String>> getAllRole(){
        List<String> role=null;
        try
        {
            role=demandImpl.getAllRole();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<List<String>>(role,HttpStatus.OK);

    }

    @GetMapping("/getstatus")
    public ResponseEntity<List<String>> getAllStatus(){
        List<String> status=null;
        try
        {
            status=demandImpl.getAllStatus();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<List<String>>(status,HttpStatus.OK);

    }

    @GetMapping("/getTechnology")
    public ResponseEntity<List<String>> getAllTechnology(){
        List<String> technology=null;
        try
        {
            technology=demandImpl.getAllTechnology();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<List<String>>(technology,HttpStatus.OK);

    }
}
