import java.util.ArrayList;
import java.util.List;

class Song {
    private String title;
    private String artist;
    private String album;
    // Additional song properties (e.g., duration, genre, etc.)

    public Song(String title, String artist, String album) {
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    // Getters and setters for song properties

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}

class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Add a song to the playlist
    public void addSong(Song song) {
        songs.add(song);
    }

    // Remove a song from the playlist
    public void removeSong(Song song) {
        songs.remove(song);
    }

    // Get all songs in the playlist
    public List<Song> getSongs() {
        return songs;
    }

    // Get the number of songs in the playlist
    public int getNumberOfSongs() {
        return songs.size();
    }
}

class MusicStreamingApp {
    private List<Playlist> playlists;

    public MusicStreamingApp() {
        this.playlists = new ArrayList<>();
    }

    // Create a new playlist
    public void createPlaylist(String name) {
        Playlist playlist = new Playlist(name);
        playlists.add(playlist);
    }

    // Add a song to a playlist
    public void addSongToPlaylist(Song song, Playlist playlist) {
        playlist.addSong(song);
    }

    // Remove a song from a playlist
    public void removeSongFromPlaylist(Song song, Playlist playlist) {
        playlist.removeSong(song);
    }

    // Get all playlists in the app
    public List<Playlist> getPlaylists() {
        return playlists;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a music streaming app
        MusicStreamingApp app = new MusicStreamingApp();

        // Create a playlist
        app.createPlaylist("My Playlist");

        // Create some songs
        Song song1 = new Song("Song 1", "Artist 1", "Album 1");
        Song song2 = new Song("Song 2", "Artist 2", "Album 2");

        // Add songs to the playlist
        Playlist playlist = app.getPlaylists().get(0);
        app.addSongToPlaylist(song1, playlist);
        app.addSongToPlaylist(song2, playlist);

        // Print the songs in the playlist
        List<Song> songs = playlist.getSongs();
        for (Song song : songs) {
            System.out.println("Title: " + song.getTitle());
            System.out.println("Artist: " + song.getArtist());
            System.out.println("Album: " + song.getAlbum());
            System.out.println();
        }
    }
}
