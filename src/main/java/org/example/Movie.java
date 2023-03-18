package org.example;

import java.util.ArrayList;

class Movie extends TVShow {
    private String length;
    public void setLength(String length){
        this.length=length;
    }
    public String getLength(){
        return length;
    }
    /*
     *Movie is extended from TVShow and has extra attribute length.
     */
    public Movie(String title , String genre , String releaseYear , String duration , double rating , String lenght)
    {
        super(title,genre,releaseYear,duration,rating);
        this.length=length;
    }

    @Override
    public String toString(){
        return "tvshow introduction:" +"title:" +getTitle()+'\n'+"genre: "+getGenre()+'\n'+
                "release year: "+getReleaseYear()+'\n'+"duration: "+getDuration()+'\n'+
                "length: "+this.length+'\n'+"and at the end we have rating which is: "+getRating();
    }

}
