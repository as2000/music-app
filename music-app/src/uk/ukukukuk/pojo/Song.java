package uk.ukukukuk.pojo;

public class Song {

	private String name;
	private String artist;
	private String musicBrainzID;
	
	public Song(){
		this.name = "The Moebius";
		this.artist = "Orbital";
		this.musicBrainzID = "6bf00ce5-58a9-4283-9842-f0460bf64048";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getMusicBrainzID() {
		return musicBrainzID;
	}
	public void setMusicBrainzID(String musicBrainzID) {
		this.musicBrainzID = musicBrainzID;
	}
}
