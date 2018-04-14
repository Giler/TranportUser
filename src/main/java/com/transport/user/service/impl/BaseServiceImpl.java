package com.transport.user.service.impl;

import com.transport.user.dao.MapperBase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import sun.rmi.runtime.Log;

import java.util.List;

@Slf4j
public abstract class BaseServiceImpl<T> {
    @Autowired
    private MapperBase<T> mapper;

    public T getObjectById(Integer id) {
        T t = mapper.selectByPrimaryKey(id);
        return t;
    }

    public List<T> selectObjectList(T t){
        List<T> ts = mapper.selectObjectList(t);
        return ts;
    }
}
