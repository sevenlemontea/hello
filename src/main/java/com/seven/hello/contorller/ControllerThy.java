package com.seven.hello.contorller;

import com.seven.hello.bean.Flight;
import com.seven.hello.bean.User;
import com.seven.hello.service.FlightService;
import com.seven.hello.service.LoginService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Name LemonTea
 * @Time 2023-03-21-15:15
 */
//@RestController
public class ControllerThy {

    @Autowired
    FlightService flightService;
    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public boolean login(User user){
        System.out.println(user);
        return loginService.login(user);
    }

    @GetMapping("/getAll")
    public List<Flight> getAllFlight(){
      return   flightService.getAll();
    }
    @PostMapping("/add")
    public int add(@RequestBody Flight info){
        System.out.println(info);
        return flightService.add(info);

    }
    @DeleteMapping("/del")
    public int del( String flightid){
        return flightService.del(flightid);
    }
    @PutMapping("/update")
    public int upd(@RequestBody Flight flight){
        return flightService.upd(flight);
    }

}
