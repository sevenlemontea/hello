package com.seven.hello.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oracle.webservices.internal.api.message.BasePropertySet;
import com.seven.hello.bean.Flight;
import com.seven.hello.mapper.MpMapper;
import com.seven.hello.service.MpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Name LemonTea
 * @Time 2023-03-31-14:45
 */
@Service
public class ImplMpService extends ServiceImpl<MpMapper, Flight> implements MpService {


}
