package uk.ukukukuk.beans;
import javax.faces.bean.ManagedBean;

import uk.ukukukuk.pojo.Song;

@ManagedBean
public class songBean {
	
	private Song song;
	
	public songBean(){
		
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
	
	public String persist(){
		//TODO persistance
		System.out.println(this.song);
		return "success";		
	}


}
