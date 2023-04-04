package com.seven.hello.service.impl;

import com.seven.hello.bean.Flight;
import com.seven.hello.mapper.FlightMapper;
import com.seven.hello.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Name LemonTea
 * @Time 2023-03-27-11:05
 */
@Service
public class ImplFlightService implements FlightService {

    @Autowired
    FlightMapper flightMapper;
    @Override
    public List<Flight> getAll() {
        return flightMapper.getAll();
    }

    @Override
    public int add(Flight info) {
        return flightMapper.add(info);
    }

    @Override
    public int del(String flightid) {
        return flightMapper.del(flightid);
    }

    @Override
    public int upd(Flight flight) {
        return flightMapper.upd(flight);
    }
}
