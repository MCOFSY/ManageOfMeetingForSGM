package com.seg.dao;

import com.seg.common.BaseMapper;
import com.seg.domain.PersonDemo;

import java.util.List;

/**
 * 测试Dao
 * @author zsq
 * @date 2019/7/22
 */
public interface PersonDaoDemo extends BaseMapper<PersonDemo>{
    List<PersonDemo> queryPersonList();
}
