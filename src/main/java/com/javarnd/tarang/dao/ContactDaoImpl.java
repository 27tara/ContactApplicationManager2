package com.javarnd.tarang.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javarnd.tarang.model.User;

@Repository
public class ContactDaoImpl implements ContactDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<User> getAllUsers() {

		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	public User getUser(int id) {
		User user = (User) sessionFactory.getCurrentSession().get(User.class, new Integer(id));
		//System.out.println(user.toString());
		return user;
	}

	public User addUser(User user) {
		sessionFactory.getCurrentSession().persist(user);
		return user;
	}

	public void updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	public void deleteUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User u = (User) session.load(User.class, new Integer(id));
		if (null != u) {
			session.delete(u);
		}
	}

	public void deleteAllUsers() {
		sessionFactory.getCurrentSession().createQuery("Delete from User");
	}
}
