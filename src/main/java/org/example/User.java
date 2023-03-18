package org.example;

import java.util.ArrayList;

class User {
    /*
    * The user should contain username password.
    * The user should contain an ArrayList of favorite shows and watch history.
    * FUNCTION: the user should have a function to watch a show and add it to watch history.
    *  *** NOTE: All search functions in user are for searching in favorite shows ***
    */
    private String username;
    private String password;
    public ArrayList<String> UserNames;
    public ArrayList<String> Passwords;
    public User(String username , String password){
        this.username=username;
        this.password=password;
    }

    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return this.username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }
    ArrayList<TVShow> favorites= new ArrayList<>();
    ArrayList<TVShow> Spectated= new ArrayList<>();


    public ArrayList<TVShow> searchByTitle(String title) {
        ArrayList <TVShow> saved=new ArrayList<>();
        for(int i=0 ; i<favorites.size() ; i++){
            if(title.equals(favorites.get(i).getTitle())){
                saved.add(favorites.get(i));
            }
        }
        // Implement search by title in favorite shows  logic here
        return (saved);
    }
    public ArrayList<TVShow> searchByGenre(String genre) {
        ArrayList<TVShow> saved=new ArrayList<>();
        for(int i=0 ; i<favorites.size() ; i++){
            if(genre.equals(favorites.get(i).getGenre())){
                saved.add(favorites.get(i));
            }
        }
        // Implement search by genre in favorite shows  logic here
        return (saved);
    }
    public ArrayList<TVShow> searchByReleaseYear(int year) {
        // Implement search by release year in favorite shows logic here
        ArrayList<TVShow> saved = new ArrayList<>();
        for (int i=0; i<favorites.size(); i++)
        {
            if (year == Integer.parseInt(favorites.get(i).getReleaseYear()))
            {
                saved.add(favorites.get(i));
            }
        }
        return (saved);
    }
    public boolean doesTvShowExist(TVShow tvShow)
    {
        boolean doesExist = false;
        for (int i=0; i<favorites.size(); i++)
        {
            if (tvShow.getTitle().equals(favorites.get(i).getTitle()))
            {
                doesExist = true;
            }
        }
        return doesExist;
    }




    public void addToFavorites(TVShow show) {
        if(doesTvShowExist(show)){
            System.out.println("this show has already been added");
        }
        else{
            favorites.add(show);
            System.out.println("show saved successfully!");
        }
        // Implement add to favorites logic here
    }
    public void viewFavorites() {
        System.out.println(favorites);
        // Implement view favorites logic here
    }
}
