package uk.ukukukuk.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Artist {

    @Id
    @GeneratedValue
    private Long id;
    
	private String name;
	private String musicBrainzID;
	
	@OneToMany(mappedBy="artist")
	private transient List<Song> songs;
	
	public Artist(){
		this.name = "Orbital";
		this.musicBrainzID = "f3e2a7d9-c6bb-4848-95e5-04c0a1e2f511";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMusicBrainzID() {
		return musicBrainzID;
	}
	public void setMusicBrainzID(String musicBrainzID) {
		this.musicBrainzID = musicBrainzID;
	}
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	public Long getId() {
		return id;
	}
	
	@Override
	public String toString(){
		return this.name;
	}
}
