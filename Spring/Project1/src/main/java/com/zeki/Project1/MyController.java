package com.zeki.Project1;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/home")
public class MyController  {

    @GetMapping(path="/path1",produces = "application/json")
    public String getEmployeeByID() {
        return "Home";
    }

}
