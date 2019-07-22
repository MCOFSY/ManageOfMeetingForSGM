package com.seg.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用mapper
 * @author zsq
 * @date 2019/7/22
 */
public interface BaseMapper<T> extends Mapper<T>,MySqlMapper<T>{

}
