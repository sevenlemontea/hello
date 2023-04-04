package com.seven.hello.mapper;

import com.seven.hello.bean.Flight;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Name LemonTea
 * @Time 2023-03-27-11:06
 */
@Mapper
public interface FlightMapper {
    List<Flight> getAll();

    int add(Flight info);

    int del(String flightid);

    int upd(Flight flight);
}
