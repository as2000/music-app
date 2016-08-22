package uk.ukukukuk.beans;
import java.util.List;

import javax.faces.bean.ManagedBean;

import uk.ukukukuk.dao.SongDAO;
import uk.ukukukuk.pojo.Song;

@ManagedBean
public class SongBean {
	
	private Song song;
	private List<Song> songs;
	
	public SongBean(){
		
	}

	public Song getSong() {
		if (this.song == null){
			this.song = new Song();
		}
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	} 
	
	public List<Song> getSongs() {
		if (songs == null){
			songs = SongDAO.getAllSongs();
		}		
		return songs;
	}

	public String commit(){
		System.out.println(this.song);		
		SongDAO.commit(song);
		return "index";
	}


}
