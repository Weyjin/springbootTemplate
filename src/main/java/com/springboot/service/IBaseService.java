package com.springboot.service;

import java.util.List;
import java.util.Map;

/**
 * Created by len_pc on 2018/6/30.
 */
public interface IBaseService<T> {

    boolean insert(T t);
    boolean delete(String id);
    boolean update(T t);
    List<T> toList(Map<String, Object> map);
    T selectByPrimaryKey(String id);
}
