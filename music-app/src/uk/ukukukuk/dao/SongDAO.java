package uk.ukukukuk.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import uk.ukukukuk.pojo.Song;
import uk.ukukukuk.util.HibernateUtil;

public class SongDAO {

	public static boolean commit(Song song) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(song);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public static List<Song> getAllSongs() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.createCriteria(Song.class).list();
	}
	
	public static List<Song> getSong(long id){
		EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();
		CriteriaBuilder cb = HibernateUtil.getSessionFactory().getCriteriaBuilder();
		CriteriaQuery<Song> q = cb.createQuery(Song.class);
		Root<Song> song = q.from(Song.class);
		ParameterExpression<Long> parameter = cb.parameter(Long.class);
		q.select(song).where(cb.equal(song.get("id"), parameter));
		
		TypedQuery<Song> query = em.createQuery(q);
		query.setParameter(parameter, id);
		List<Song> results = query.getResultList();
		
		
		return results;
		
		
	}

}
