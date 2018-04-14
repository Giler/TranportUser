package com.transport.user.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MapperBase<T> {

    int deleteByPrimaryKey(Integer id);

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Integer id);

    List<T> selectObjectList(T t);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);
}
