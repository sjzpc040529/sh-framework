package org.lzh.sh.framework.dao;

/**
 * @Description:通用的操作接口
 * @author: lizhaohua
 * @date: 15/9/24 下午11:16
 * @version: V1.0
 */


import java.io.Serializable;
import java.util.List;

public interface IOperations<T extends Serializable> {

    T findOne(final long id);

    List<T> findAll();

    void create(final T entity);

    T update(final T entity);

    void delete(final T entity);

    void deleteById(final long entityId);

}