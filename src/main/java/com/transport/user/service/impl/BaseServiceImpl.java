package com.transport.user.service.impl;

import com.transport.user.dao.MapperBase;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class BaseServiceImpl<T> {
    @Autowired
    private MapperBase<T> mapper;

    public T getObjectById(Integer id) {
        T t = mapper.selectByPrimaryKey(id);
        return t;
    }
}
