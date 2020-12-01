package com.baba.mybatisplus;

import com.baba.mybatisplus.dao.UserMapper;
import com.baba.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询测试
     */
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    /**
     * 插入测试
     * 主键生成方案：雪花算法
     * 自动填充
     */
    @Test
    void insertTest(){
        User user = new User();
        user.setName("迪迦奥特曼");
        user.setAge(5);
        userMapper.insert(user);
    }

    @Test
    void updateTest(){
        User user = new User();
        user.setId(2L);
        user.setAge(100);
        userMapper.updateById(user);
    }

    @Test
    void deletedTest(){
        userMapper.deleteById(2L);
    }


}
