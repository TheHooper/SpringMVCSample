package com.hooper.service;

import com.hooper.common.constants.ServiceErrorConstants;
import com.hooper.common.exception.WebException;
import com.hooper.mapper.ReportMapper;
import com.hooper.model.Report;
import com.hooper.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

/**
 * Created by hooper on 2016/12/6.
 */
@Service
public class ReportService implements BaseService<Report, Integer> {

    @Autowired
    private ReportMapper reportMapper;

    @Override
    public Report get(Integer integer) {
        return reportMapper.selectByPrimaryKey(integer);
    }

    @Override
    public void insert(Report report) {
        reportMapper.insertSelective(report);
    }

    @Override
    public void modify(Report report) {
        Report old = reportMapper.selectByPrimaryKey(report.getId());
        if (old == null) {
            throw new WebException(ServiceErrorConstants.NOT_FOUND, "修改操作失败");
        } else {
            reportMapper.updateByPrimaryKeySelective(report);
        }
    }

    public void modifyContext(Report report) {
        Report old = reportMapper.selectByPrimaryKey(report.getId());
        if (old == null) {
            throw new WebException(ServiceErrorConstants.NOT_FOUND, "修改操作失败");
        } else {
//            reportMapper.updateByPrimaryKeyWithBLOBs(report);
        }
    }

    @Override
    public void delete(Integer integer) {
        reportMapper.deleteByPrimaryKey(integer);
    }
}
