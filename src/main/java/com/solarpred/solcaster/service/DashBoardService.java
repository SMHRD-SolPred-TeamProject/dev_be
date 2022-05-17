package com.solarpred.solcaster.service;

import com.solarpred.solcaster.domain.Temp_weather;
import com.solarpred.solcaster.mapper.DashBoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashBoardService {

    @Autowired
    DashBoardMapper mapper;

    /**
     * temp_weather에서 현재시간과 같은 값 가져오기
     */
    public List<Temp_weather> getTemp_weather(String parsingTime){
        return mapper.getTemp_weather(parsingTime);
    }


}
