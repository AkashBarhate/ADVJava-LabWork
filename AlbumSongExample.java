package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.dao.AlbumSongDao;
import com.entity.Album;
import com.entity.Song;

public class AlbumSongExample {
	public static void main(String[] args) {

	AlbumSongDao dao= new AlbumSongDao();
	
	Album album = new Album();
	album.setName("Hits of 2021");
	album.setReleaseDate(LocalDate.of(2020, 12, 28));
	album.setCopyright("D-Music");
	

//  	Song song =new Song();
//	song.setTitle("Tadipar");
//	song.setArtist("MC Stan");
//	song.setDuration(5.30);
//	song.setAlbum(album);
	
	
	//we making list of songs for adding more than 1 song in one album i.e. many as to one
	List<Song> list= new ArrayList<Song>();
	
	Song song = new Song();
	song.setTitle("Khajauve Vichar");
	song.setArtist("MC Stan");
	song.setDuration(4.50);
	song.setAlbum(album);
	list.add(song);
	
	Song song1 = new Song();
	song1.setTitle("Vibe");
	song1.setArtist("Divine");
	song1.setDuration(5.50);
	song1.setAlbum(album);
	list.add(song1);
	
	Song song2 = new Song();
	song2.setTitle("Chal Bombay");
	song2.setArtist("Divine");
	song2.setDuration(5.50);
	song2.setAlbum(album);
	list.add(song2);
	
	album.setSongs(list);
	dao.save(album);
	
	
//	
//	List<Song> songs = dao.fetchSongsSungBy("Ed Sheeran");
//	for(Song song1 : songs)
//		System.out.println(song1.getTitle() + " " + song1.getDuration()); 
	
	}
}
