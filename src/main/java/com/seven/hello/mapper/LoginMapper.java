package com.seven.hello.mapper;

import com.seven.hello.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Name LemonTea
 * @Time 2023-03-27-10:36
 */
@Mapper
public interface LoginMapper {


    boolean login(User user);

}
