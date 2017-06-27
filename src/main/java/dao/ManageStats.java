package dao;

import model.Stats;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.persistence.Query;

@Repository
public class ManageStats {

    private Session session;
    public ManageStats() {this.session = HibernateUtil.getSessionFactory().openSession();}

    public void setWins(int wins) {
        Transaction txn = session.beginTransaction();
        Stats stats = new Stats();
        stats.setWins(wins);
        session.save(stats);
        txn.commit();
        session.close();
    }

    public void setCount(int count) {
        Transaction txn = session.beginTransaction();
        Stats stats = new Stats();
        stats.setWins(count);
        session.save(stats);
        txn.commit();
        session.close();
    }

    public void setAvgTime(int avgTime) {
        Transaction txn = session.beginTransaction();
        Stats stats = new Stats();
        stats.setAvgTime(avgTime);
        session.save(stats);
        txn.commit();
        session.close();
    }

    public void setAvgStepTime(int avgStepTime) {
        Transaction txn = session.beginTransaction();
        Stats stats = new Stats();
        stats.setAvgStepTime(avgStepTime);
        session.save(stats);
        txn.commit();
        session.close();
    }

    public void setUsername(String username) {
        Transaction txn = session.beginTransaction();
        Stats stats = new Stats();
        stats.setUsername(username);
        session.save(stats);
        txn.commit();
        session.close();
    }

    public int getWins(String username)
    {
        try {
            String statsRequest = "FROM Stats AS Stats WHERE Stats.username =:username ";
            Query query = session.createQuery(statsRequest);
            query.setParameter("username", username);
            Stats stats = (Stats) query.getSingleResult();
            return stats.getWins();
        }catch(NoResultException e){
            return -1;
        }
    }

    public int getCount(String username)
    {
        try {
            String statsRequest = "FROM Stats AS Stats WHERE Stats.username =:username ";
            Query query = session.createQuery(statsRequest);
            query.setParameter("username", username);
            Stats stats = (Stats) query.getSingleResult();
            return stats.getCount();
        }catch(NoResultException e){
            return -1;
        }
    }

    public int getAvgTime(String username)
    {
        try {
            String statsRequest = "FROM Stats AS Stats WHERE Stats.username =:username ";
            Query query = session.createQuery(statsRequest);
            query.setParameter("username", username);
            Stats stats = (Stats) query.getSingleResult();
            return stats.getAvgTime();
        }catch(NoResultException e){
            return -1;
        }
    }

    public int getAvgStepTime(String username)
    {
        try {
            String statsRequest = "FROM Stats AS Stats WHERE Stats.username =:username ";
            Query query = session.createQuery(statsRequest);
            query.setParameter("username", username);
            Stats stats = (Stats) query.getSingleResult();
            return stats.getAvgStepTime();
        }catch(NoResultException e){
            return -1;
        }
    }

}
