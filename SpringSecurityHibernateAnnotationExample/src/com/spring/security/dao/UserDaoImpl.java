package com.spring.security.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.spring.security.model.User;
import com.spring.security.model.UserProfile;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {
 
    public User findById(int id) {
        return getByKey(id);
    }
 
    public User findBySSO(String sso) {
    	Criteria crit = createEntityCriteria();
    	crit.add(Restrictions.eq("ssoId",sso));
        return (User) crit.uniqueResult();
    }
}