/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class AnimatedMovie extends Movie {
    private String animationStudio;
    private String ageRecommendation;

    public AnimatedMovie(int movieId, String title, int releaseYear, String genre, String director, int duration, double rating, String animationStudio, String ageRecommendation) {
        super(movieId, title, releaseYear, genre, director, duration, rating);
        this.animationStudio = animationStudio;
        this.ageRecommendation = ageRecommendation;
    }

    public String getAnimationStudio() {
        return animationStudio;
    }

    public void setAnimationStudio(String animationStudio) {
        this.animationStudio = animationStudio;
    }

    public String getAgeRecommendation() {
        return ageRecommendation;
    }

    public void setAgeRecommendation(String ageRecommendation) {
        this.ageRecommendation = ageRecommendation;
    }
}
