/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import ma.projet.dao.IDao;
import ma.projet.entities.Femme;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Lachgar
 */
public class FemmeService implements IDao<Femme> {

    @Override
    public boolean create(Femme o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean delete(Femme o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean update(Femme o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    

    @Override
    public List<Femme> findAll(Femme o) {
        List<Femme> femmes = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            femmes = session.createQuery("from Femme").list();
            tx.commit();
            return femmes;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return femmes;
        } finally {
            if(session != null)
                session.close();
        }
    }
    /*public Femme FemmePlusAgee(Femme o) {
        Femme femmes = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            femmes = (Femme) session.createQuery("FROM Femme ORDER BY dateDeNaissance DESC");
            tx.commit();
            return femmes;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return femmes;
        } finally {
            if(session != null)
                session.close();
        }
    }*/
    /*public Femme getFemmeLaPlusAgee() {
        String hql = "FROM Femme ORDER BY dateDeNaissance DESC";
        Query<Femme> query = session.createQuery(hql, Femme.class);
        query.setMaxResults(1); // Limiter la requête à un résultat (la femme la plus âgée)
        return query.uniqueResult();
    }*/
  /*  public Femme FemmePlusAgee() {
        Femme f = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            String hql = "FROM Femme ORDER BY dateDeNaissance DESC";
            f = (Femme) session.createQuery(hql);
      // Limiter la requête à un résultat (la femme la plus âgée)
            Query q = f.uniqueResult();
            tx.commit();
            return f.uniqueResult();
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return f;
        } finally {
            if(session != null)
                session.close();
        }
    }
*/
    @Override
    public Femme findById(int id) {
        Femme client = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            client = (Femme) session.get(Femme.class, id);
            tx.commit();
            return client;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return client;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
