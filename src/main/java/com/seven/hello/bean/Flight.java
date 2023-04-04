package com.seven.hello.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Name LemonTea
 * @Time 2023-03-27-11:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    private String flightid ;
    private String company ;
    private String leaveairport ;
    private String arriveairport ;
    private String leavetime ;
    private String arrivetime ;
    private String airplane ;
}
