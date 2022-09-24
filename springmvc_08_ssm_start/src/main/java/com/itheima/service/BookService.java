package com.itheima.service;

import com.itheima.domain.Book;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Transactional
public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 删除
     * @param id
     * @return
     */

    public boolean delete(Integer id);

    /**
     * 根据id查询
     * @param id
     * @return
     */

    public Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */

    public List<Book> getAll();

}
