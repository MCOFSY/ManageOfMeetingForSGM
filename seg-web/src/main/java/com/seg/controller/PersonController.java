package com.seg.controller;

import com.seg.domain.PersonDemo;
import com.seg.service.PersonServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 *
 * @author zsq
 * @date 2019/7/22
 */
@Controller
@RequestMapping("/seg")
public class PersonController {

    @Autowired
    private PersonServiceDemo personServiceDemo;

    /**
     * url=  http://localhost:8080/seg/index
     * 页面展示
     * @return
     */
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("name","jack");
        return modelAndView;
    }
    /**
     * url= http://localhost:8080//queryPersonById/1
     * 查询一个实体
     * @param id
     * @return
     */
    @GetMapping("/queryPersonById/{id}")
    @ResponseBody
    public PersonDemo queryPersonById(@PathVariable("id") Long id){
        PersonDemo personDemo = this.personServiceDemo.queryPersonById(id);
        return personDemo;
    }
    @GetMapping("/queryAll")
    @ResponseBody
    public List<PersonDemo> queryAll(){
        List<PersonDemo> personDemos = this.personServiceDemo.queryOrderList();
        return personDemos;
    }
}
