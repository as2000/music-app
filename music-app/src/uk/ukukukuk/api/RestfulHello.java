package uk.ukukukuk.api;


import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.omnifaces.util.Json;

import com.google.gson.Gson;

import uk.ukukukuk.dao.SongDAO;
import uk.ukukukuk.pojo.Song;


@Path("song")
public class RestfulHello {
	Gson gson = new Gson();
	
	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String songID) {

		//ultra basic protection against sql injection
		long songIDl = Long.parseLong(songID);		
		List<Song> song = SongDAO.getSong(songIDl);

		return Response.status(200).entity(Json.encode(song)).build();

	}
	
	@GET
	@Path("/")
	public Response printMessage() {		
		List<Song> songs = SongDAO.getAllSongs();
		return Response.status(200).entity(Json.encode(songs)).build();
	}
	
	@DELETE
	@Path("/{param}")
	public Response deleteSong(@PathParam("param") String songID){
		long songIDl = Long.parseLong(songID);		
		SongDAO.deleteSong(songIDl);
		
		//return song list minus the deleted song
		return printMessage();
		

	}
	
	
}
