package com.baidu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baidu.mapper.BookMapper;
import com.baidu.pojo.Book;
import com.baidu.service.BookInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by xxf123 on 2019/10/9.
 */
@Service
public class BookServiceImpl implements BookInterfaceService{

    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> findAll() {
        return bookMapper.findAll();
    }
}
