package org.lzh.sh.framework.service.impl;




import javax.annotation.Resource;


import javax.annotation.Resource;

import org.lzh.sh.framework.dao.IOperations;
import org.lzh.sh.framework.dao.IUserDao;
import org.lzh.sh.framework.domain.entity.User;
import org.lzh.sh.framework.service.IUserService;
import org.lzh.sh.framework.service.common.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description:
 * @author: lizhaohua
 * @date: 15/9/24 下午4:02
 * @version: V1.0
 */
@Transactional
@Service("userService")
public class UserService extends AbstractService<User> implements IUserService {

    @Resource(name="usersDao")
    private IUserDao dao;

    public UserService() {
        super();
    }

    @Override
    protected IOperations<User> getDao() {
        return this.dao;
    }
}

