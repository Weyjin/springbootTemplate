package com.springboot.dao;

import java.util.List;
import java.util.Map;

/**
 *
 */
public  interface IBaseDao<T> {

    int insert(T t);
    int delete(String id);
    int update(T t);
    List<T> toList(Map<String, Object> map);
    T selectByPrimaryKey(String id);
}
