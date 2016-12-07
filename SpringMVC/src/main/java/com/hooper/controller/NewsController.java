package com.hooper.controller;

import com.hooper.dto.input.ReportInput;
import com.hooper.model.Report;
import com.hooper.service.ReportService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * Created by hooper on 2016/12/6.
 */
@Controller
@RequestMapping("/news")
public class NewsController {

    @Resource
    private ReportService reportService;

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    public void insert(@Valid ReportInput reportInput) {
        Report report = new Report();
        BeanUtils.copyProperties(reportInput, report);
        reportService.insert(report);
    }

    @RequestMapping(value = "/modify/{id}", method = {RequestMethod.POST})
    public void modify(@Valid ReportInput reportInput, @PathVariable Integer id) {
        Report report = new Report();
        report.setId(id);
        BeanUtils.copyProperties(reportInput, report);
        reportService.modify(report);
    }

    @RequestMapping(value = "/delete/{id}", method = {RequestMethod.POST})
    public void delete(@Valid ReportInput reportInput, @PathVariable Integer id) {
        Report report = new Report();
        report.setId(id);
        BeanUtils.copyProperties(reportInput, report);
        reportService.modify(report);
    }
}
