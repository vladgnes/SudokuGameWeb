package dao;

import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

@Repository
public class ManageUser {

    private Session session;

    public ManageUser() {this.session = HibernateUtil.getSessionFactory().openSession();}

    public User login(String username, String password) {
        try {
            String loginRequest = "FROM User AS User WHERE User.username =:username " +
                    "AND User.password =:password";
            Query query = session.createQuery(loginRequest);
            query.setParameter("username", username);
            query.setParameter("password", password);
            return (User) query.getSingleResult();
        }catch(NoResultException e){
            return null;
        }
    }

    private boolean ifUserExists(String username, String email) {
        String selectUserRequest = "FROM User AS User WHERE User.username =:username" +
                " OR User.email =:email";
        Query query = session.createQuery(selectUserRequest);
        query.setParameter("username", username);
        query.setParameter("email", email);
        try {
            User user = (User) query.getSingleResult();
        } catch (NoResultException e) {
            //logger.info(e);
            return false;
        } catch ( NonUniqueResultException e) {
            //logger.info(e);
            return false;
        }
        return true;
    }

    public boolean registry(String username, String password, String email) {
        if(!ifUserExists(username, email))
        {
            Transaction txn = session.beginTransaction();
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setEmail(email);
            session.save(user);
            txn.commit();
            session.close();
            return true;
        }else {
            return false;
        }

    }
}
