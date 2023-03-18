package org.example;

import java.util.ArrayList;

class NetflixService {
    ArrayList<User> users= new ArrayList<>();
    ArrayList<TVShow> tvShows=new ArrayList<>();
    ArrayList<Movie> movies=new ArrayList<>();


    /*
     *The NetflixService should have an Arraylist of users, tv shows and movies.
     *The NetflixService should have a User object which represents current user.
     */
    public  boolean doesUserNameExists(String username){
        boolean doesExist=false;
        for(int i=0 ; i<users.size(); i++){
            if(username.equals(users.get(i).getUsername())){
                doesExist=true;
            }
        }
        return doesExist;

    }
    public boolean userAuthentication(String username , String password){
        boolean authentication=false;
        for(int i=0 ; i<users.size(); i++){
            if(username.equals(users.get(i).getUsername())&& password.equals(users.get(i).getPassword())){
                authentication=true;

            }
        }
        return authentication;
    }
    public boolean movieExistence(Movie movie){
        boolean doesExist=false;
        for(int i=0 ; i<movies.size(); i++){
            if(movie.getTitle().equals(movies.get(i).getTitle())){
                doesExist=true;
            }
        }
        return doesExist;

    }
    public boolean doesTvShowExist(TVShow tvShow)
    {
        boolean existence = false;
        for (int i=0; i<tvShows.size(); i++)
        {
            if (tvShow.getTitle().equals(tvShows.get(i).getTitle()))
            {
                existence = true;
            }
        }
        return existence;
    }


    public void addTvShow(TVShow tvshow) {
        if(doesTvShowExist(tvshow)){
            System.out.println("this show has already been added");
        }
        else{
            tvShows.add(tvshow);
            System.out.println("show is now added!");
        }
        // Implement add to favorites logic here
    }


    public void addMovie(Movie movie){
        // Implement add movie logic here
        if (movieExistence(movie))
        {
            System.out.println("this show has already been added");
        }
        else
        {
            movies.add(movie);
            System.out.println("movie is now added!");
        }
    }

    public void createAccount(String username , String password) {
        if (doesUserNameExists(username))
        {
            System.out.println("cannot choose this username it is already taken!");
        }
        else
        {
            User user = new User(username,password);
            users.add(user);
        }

    }

    public boolean login(String username, String password) {
        if (doesUserNameExists(username))
        {
            if (userAuthentication(username, password))
            {
                System.out.println("login successfully!");
                return true;
            }
            else
            {
                System.out.println("username or password is incorrect, please try again");
                return false;
            }
        }
        else
        {
            System.out.println("this username does not exist!");
            return false;
        }


        // Implement login logic here
    }



    public ArrayList<TVShow> searchByTitle(String title) {
        ArrayList<TVShow> saved = new ArrayList<>();
        for (int i=0; i<tvShows.size(); i++)
        {
            if (title.equals(tvShows.get(i).getTitle()))
            {
                saved.add(tvShows.get(i));
            }
        }
        return (saved);
        // Implement search by title logic here

    }

    public ArrayList<TVShow> searchByGenre(String genre) {
        // Implement search by genre logic here
        ArrayList<TVShow> saved = new ArrayList<>();
        for (int i=0; i<tvShows.size(); i++)
        {
            if (genre.equals(tvShows.get(i).getGenre()))
            {
                saved.add(tvShows.get(i));
            }
        }
        return (saved);

    }

    public ArrayList<TVShow> searchByReleaseYear(int year) {
        ArrayList<TVShow> saved = new ArrayList<>();
        for (int i=0; i<tvShows.size(); i++)
        {
            if (year == Integer.parseInt(tvShows.get(i).getReleaseYear()))
            {
                saved.add(tvShows.get(i));
            }
        }
        return (saved);
        // Implement search by release year logic here

    }
    public ArrayList<Movie> searchByLength(String length) {
        ArrayList<Movie> saved = new ArrayList<>();
        for (int i=0; i<movies.size(); i++)
        {
            if (length.equals(movies.get(i).getGenre()))
            {
                saved.add(movies.get(i));
            }
        }
        return (saved);
        // Implement search by release year logic here

    }
    public ArrayList<Movie> searchByReleaseYear1(int year) {
        ArrayList<Movie> saved = new ArrayList<>();
        for (int i=0; i<movies.size(); i++)
        {
            if (year == Integer.parseInt(movies.get(i).getReleaseYear()))
            {
                saved.add(movies.get(i));
            }
        }
        return (saved);
        // Implement search by release year logic here

    }
    public ArrayList<Movie> searchByGenre1(String genre) {
        // Implement search by genre logic here
        ArrayList<Movie> saved = new ArrayList<>();
        for (int i=0; i<movies.size(); i++)
        {
            if (genre.equals(movies.get(i).getGenre()))
            {
                saved.add(movies.get(i));
            }
        }
        return (saved);

    }
    public ArrayList<Movie> searchByTitle1(String title) {
        ArrayList<Movie> saved = new ArrayList<>();
        for (int i=0; i<movies.size(); i++)
        {
            if (title.equals(movies.get(i).getTitle()))
            {
                saved.add(movies.get(i));
            }
        }
        return (saved);
        // Implement search by title logic here

    }


}

