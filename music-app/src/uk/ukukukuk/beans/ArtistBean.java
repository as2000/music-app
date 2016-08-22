package uk.ukukukuk.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import uk.ukukukuk.dao.ArtistDAO;
import uk.ukukukuk.pojo.Artist;

@ManagedBean
public class ArtistBean {
	
	List<Artist> artists;
	Artist artist;
	
	
	public Artist getArtist() {
		if (artist == null) {
			artist = new Artist();
		}
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public List<Artist> getArtists() {
		if (artists == null || artists.isEmpty()){
			artists = ArtistDAO.getAllArtists();
		}
		return artists;
	}
	
	public void commit(){
		System.out.println(this.artist);		
		ArtistDAO.commit(artist);	
	}

}
