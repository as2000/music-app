package uk.ukukukuk.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Song {

    @Id
    @GeneratedValue
    private Long id;
    

	private String name;
	
	@ManyToOne
	private Artist artist;
	private String musicBrainzID;
	
	public Song(){
		this.name = "The Moebius";
		//this.artist = "Orbital";
		this.musicBrainzID = "6bf00ce5-58a9-4283-9842-f0460bf64048";
	}

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public String getMusicBrainzID() {
		return musicBrainzID;
	}
	public void setMusicBrainzID(String musicBrainzID) {
		this.musicBrainzID = musicBrainzID;
	}
	
	@Override
	public String toString(){
		return this.name + ", " + this.artist + ", " + this.musicBrainzID;
	}
}
