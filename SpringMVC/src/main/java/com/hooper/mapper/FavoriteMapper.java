package com.hooper.mapper;

import com.hooper.model.Favorite;


public interface FavoriteMapper extends BaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Favorite record);

    int insertSelective(Favorite record);

    Favorite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Favorite record);

    int updateByPrimaryKey(Favorite record);
}