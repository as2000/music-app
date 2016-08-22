package uk.ukukukuk.beans;
import javax.faces.bean.ManagedBean;

import uk.ukukukuk.pojo.Song;

@ManagedBean
public class songBean {
	
	private Song song;
	
	public songBean(){
		
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	} 


}
