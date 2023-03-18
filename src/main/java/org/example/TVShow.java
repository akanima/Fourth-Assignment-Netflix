package org.example;

import java.util.ArrayList;

class TVShow {
    private String title;
    private String releaseYear;
    private String genre;
    private String duration;
    private double rating;
    public TVShow(String title, String releaseYear , String genre , String duration , double rating){
        this.title=title;
        this.releaseYear=releaseYear;
        this.genre=genre;
        this.duration=duration;
        this.rating=rating;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }
    public String getGenre(){
        return this.genre;
    }
    public void setRating(double rating){
        this.rating=rating;
    }
    public double getRating(){
        return this.rating;
    }
    public void setReleaseYear(String releaseYear){
        this.releaseYear=releaseYear;
    }
    public String getReleaseYear(){
        return this.releaseYear;
    }
    public void setDuration(String duration){
        this.duration=duration;
    }
    public String getDuration(){
        return this.duration;
    }

    @Override
    public String toString(){
        return "tvshow introduction:" +"title:" +this.title+'\n'+"genre: "+this.genre+'\n'+
                "release year: "+this.releaseYear+'\n'+"duration: "+this.duration+'\n'+
                "and at the end we have rating which is: "+this.rating;

    }

    /*
    *The TVShow should have a title , genre, release year, duration and a rating.
     *The TVShow should have an ArrayList of the cast.
     */

}
