package org.lzh.sh.framework.service.common;


import java.io.Serializable;
import java.util.List;

import org.lzh.sh.framework.dao.IOperations;
import org.springframework.transaction.annotation.Transactional;


/**
 * @Description:
 * @author: lizhaohua
 * @date: 15/9/24 下午11:21
 * @version: V1.0
 */
@Transactional
public abstract class AbstractService<T extends Serializable> implements IOperations<T> {

    protected abstract IOperations<T> getDao();

    @Override
    public T findOne(final long id) {
        return getDao().findOne(id);
    }

    @Override
    public List<T> findAll() {
        return getDao().findAll();
    }

    @Override
    public void create(final T entity) {
        getDao().create(entity);
    }

    @Override
    public T update(final T entity) {
        return getDao().update(entity);
    }

    @Override
    public void delete(final T entity) {
        getDao().delete(entity);
    }

    @Override
    public void deleteById(long entityId) {
        getDao().deleteById(entityId);
    }

}