package com.hooper.mapper;

import com.hooper.model.Favorite;
import com.hooper.model.FavoriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface FavoriteMapper extends BaseMapper, Mapper<Favorite> {
    int countByExample(FavoriteExample example);

    int deleteByExample(FavoriteExample example);

    List<Favorite> selectByExample(FavoriteExample example);

    int updateByExampleSelective(@Param("record") Favorite record, @Param("example") FavoriteExample example);

    int updateByExample(@Param("record") Favorite record, @Param("example") FavoriteExample example);
}