package uk.ukukukuk.dao;

import java.util.List;

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

}
