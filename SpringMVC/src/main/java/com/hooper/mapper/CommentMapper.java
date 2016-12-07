package com.hooper.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hooper.model.Comment;
import com.hooper.model.CommentExample;
import tk.mybatis.mapper.common.Mapper;

public interface CommentMapper extends Mapper<Comment> {
    int countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    List<Comment> selectByExample(CommentExample example);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);
}