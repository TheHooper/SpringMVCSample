package com.hooper.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hooper.model.Game;
import com.hooper.model.GameExample;
import tk.mybatis.mapper.common.Mapper;

public interface GameMapper extends Mapper<Game> {
    int countByExample(GameExample example);

    int deleteByExample(GameExample example);

    List<Game> selectByExampleWithBLOBs(GameExample example);

    List<Game> selectByExample(GameExample example);

    int updateByExampleSelective(@Param("record") Game record, @Param("example") GameExample example);

    int updateByExampleWithBLOBs(@Param("record") Game record, @Param("example") GameExample example);

    int updateByExample(@Param("record") Game record, @Param("example") GameExample example);
}