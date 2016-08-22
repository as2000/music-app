package uk.ukukukuk.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import uk.ukukukuk.pojo.Artist;
import uk.ukukukuk.util.HibernateUtil;

public class ArtistDAO {

	public static boolean commit(Artist artist) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(artist);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public static List<Artist> getAllArtists() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.createCriteria(Artist.class).list();
	}

}
