package com.seven.hello.contorller;

import com.seven.hello.bean.Flight;
import com.seven.hello.service.MpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Name LemonTea
 * @Time 2023-03-31-14:36
 */

@RestController
public class MpController{

    @Autowired
    MpService mpService;

    @GetMapping("getAll")
    public List<Flight> getAll(){
        return mpService.list();
    }

}
