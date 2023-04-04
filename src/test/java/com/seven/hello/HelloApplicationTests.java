package com.seven.hello;

import com.seven.hello.bean.Flight;
import com.seven.hello.bean.User;
import com.seven.hello.contorller.ControllerThy;
import com.seven.hello.contorller.MpController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HelloApplicationTests {

//    @Autowired
//    ControllerThy controllerThy;

    @Autowired
    MpController mpController;
//    @Test
//    void contextLoads() {
//
//        List<Flight> allFlight = controllerThy.getAllFlight();
//        allFlight.forEach(System.out::println);
//
//
//    }
    @Test
    public void test2(){
        System.out.println(mpController.getAll());
    }

}
