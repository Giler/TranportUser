package com.transport.user.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MapperBase<T> {

    int deleteByPrimaryKey(Integer id);

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);
}
