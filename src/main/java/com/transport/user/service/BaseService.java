package com.transport.user.service;

import java.util.List;

public interface BaseService<T> {

	T getObjectById(Integer id);

	List<T> selectObjectList(T t);
}
