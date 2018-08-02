package com.example.demo.controller;


import com.example.demo.entity.Test;
import com.example.demo.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lorne on 2017/6/26.
 */
@RestController
@RequestMapping("/demo")
@Api("demo1的DemoController相关api")
public class DemoController {

    @Autowired
    private DemoService demoService;


    @ApiOperation(value = "list", notes = "controller")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<Test> list(){
        return demoService.list();
    }


    @ApiOperation(value = "save", notes = "controller")
    @RequestMapping(value = "/save", method = RequestMethod.GET)
    @ResponseBody
    public int save(){
        return demoService.save();
    }
}
