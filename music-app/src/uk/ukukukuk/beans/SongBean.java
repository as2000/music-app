package uk.ukukukuk.beans;
import javax.faces.bean.ManagedBean;

import uk.ukukukuk.dao.SongDAO;
import uk.ukukukuk.pojo.Song;

@ManagedBean
public class SongBean {
	
	private Song song;
	
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
	
	public void commit(){
		System.out.println(this.song);		
		SongDAO.commit(song);	
	}


}
