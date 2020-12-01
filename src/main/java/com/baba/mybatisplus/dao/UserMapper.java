package com.baba.mybatisplus.dao;

import com.baba.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: immor
 * @Date: 2020/12/1
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
