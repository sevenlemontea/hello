package com.seven.hello.service;

import com.seven.hello.bean.Flight;

import java.util.List;

/**
 * @Name LemonTea
 * @Time 2023-03-27-11:05
 */
public interface FlightService {
    List<Flight> getAll();

    int add(Flight info);

    int del(String flightid);

    int upd(Flight flight);
}
