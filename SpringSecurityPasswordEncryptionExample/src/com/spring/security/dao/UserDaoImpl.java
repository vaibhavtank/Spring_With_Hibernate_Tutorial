package com.spring.security.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
 


import com.spring.security.model.User;
 
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {
 
    public void save(User user) {
        persist(user);
    }
     
    public User findById(int id) {
        return getByKey(id);
    }
 
    public User findBySSO(String sso) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("ssoId", sso));
        return (User) crit.uniqueResult();
    }

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		Criteria crit = createEntityCriteria();
		
		return crit.list();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

		Session session = getSession();
		session.update(user);

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
		Session session = getSession();
		session.delete(user);
		
	}
}