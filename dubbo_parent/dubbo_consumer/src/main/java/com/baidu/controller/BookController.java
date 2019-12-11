package com.baidu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baidu.pojo.Book;
import com.baidu.service.BookInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by xxf123 on 2019/10/9.
 */
@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {
    @Reference
    private BookInterfaceService service;

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/list")
    public String query(){

        return "list";
    }

    @GetMapping("/findAll")
    public List<Book> queryBook(){
        return service.findAll();
    }
}
