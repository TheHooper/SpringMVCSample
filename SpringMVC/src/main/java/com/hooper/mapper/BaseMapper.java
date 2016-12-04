package com.hooper.mapper;

/**
 * Created by hooper on 2016/11/20.
 */
public interface BaseMapper<T,PK> {

    int deleteByPrimaryKey(PK id);

    int insert(T record);

    T selectByPrimaryKey(PK id);

    int updateByPrimaryKey(T record);
}
