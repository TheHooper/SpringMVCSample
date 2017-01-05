package com.hooper.mapper;

import com.hooper.model.Report;
import com.hooper.model.ReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ReportMapper extends BaseMapper, Mapper<Report> {
    int countByExample(ReportExample example);

    int deleteByExample(ReportExample example);

    List<Report> selectByExampleWithBLOBs(ReportExample example);

    List<Report> selectByExample(ReportExample example);

    int updateByExampleSelective(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByExampleWithBLOBs(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByExample(@Param("record") Report record, @Param("example") ReportExample example);
}