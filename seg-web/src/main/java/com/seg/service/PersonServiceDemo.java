package com.seg.service;

import com.seg.dao.PersonDaoDemo;
import com.seg.domain.PersonDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author zsq
 * @date 2019/7/22
 */
@Service
public class PersonServiceDemo{

    @Autowired
    private PersonDaoDemo personDaoDemo;

    /**
     * 通过id，返回单个实例
     * @param id
     * @return
     */
    public PersonDemo queryPersonById(Long id){
        PersonDemo personDemo = this.personDaoDemo.selectByPrimaryKey(id);
        return personDemo;
    }

    public List<PersonDemo> queryOrderList(){
        List<PersonDemo> personDemos = this.personDaoDemo.queryPersonList();
        return personDemos;
    }
}
