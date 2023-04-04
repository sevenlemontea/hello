package com.seven.hello.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seven.hello.bean.Flight;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Name LemonTea
 * @Time 2023-03-31-14:39
 */
@Mapper
public interface MpMapper extends BaseMapper<Flight> {


}
