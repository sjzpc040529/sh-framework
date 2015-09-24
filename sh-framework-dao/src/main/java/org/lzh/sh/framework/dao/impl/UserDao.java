package org.lzh.sh.framework.dao.impl;

/**
 * @Description:
 * @author: lizhaohua
 * @date: 15/9/24 下午11:19
 * @version: V1.0
 */


import org.lzh.sh.framework.dao.AbstractHibernateDao;
import org.lzh.sh.framework.dao.IUserDao;
import org.lzh.sh.framework.domain.entity.User;
import org.springframework.stereotype.Repository;
@Repository("usersDao")
public class UserDao extends AbstractHibernateDao<User> implements IUserDao {

    public UserDao() {
        super();

        setClazz(User.class);
    }
}