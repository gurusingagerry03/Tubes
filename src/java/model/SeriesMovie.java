/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */


public class SeriesMovie extends Movie {    
    private int season;
    private int episodeNumber;

    public SeriesMovie(int movieId, String title, int releaseYear, String genre, String director, int duration, double rating, int season, int episodeNumber) {
        super(movieId, title, releaseYear, genre, director, duration, rating);
        this.season = season;
        this.episodeNumber = episodeNumber;
    }
    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }
}

