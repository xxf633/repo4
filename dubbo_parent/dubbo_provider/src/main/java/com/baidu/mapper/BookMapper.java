package com.baidu.mapper;

import com.baidu.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xxf123 on 2019/10/9.
 */
@Mapper
public interface BookMapper {
    @Select("SELECT * FROM t_book")
    List<Book> findAll();
}
