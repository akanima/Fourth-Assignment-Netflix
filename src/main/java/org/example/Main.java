package org.example;


import java.util.Scanner;

public class Main {
    //don't limit yourself to our template ***
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        runMenu();
    }
    public static void runMenu(){

        printHeader();
        PrintEntry();
        int choice=getInput();
        gettingEntryChoice(choice);
        while(3>1){
            if (choice==1) {
                if(login1()){
                    printSecondMenu();
                    int choice1=getInput();
                    if (choice1 == 5 || choice1 == 6 || choice1 == 7){
                        userMenu(choice1);
                    }
                    else{
                        tvShowOptions(choice1);
                    }

                }
                else{
                    System.out.println("try again!");
                }
            }
            if(choice==2){
                creatAc();
                if(creatAc()){
                    printSecondMenu();
                    int choice1=getInput();
                    if (choice1 == 5 || choice1 == 6 || choice1 == 7){
                        userMenu(choice1);
                    }
                    else{
                        tvShowOptions(choice1);
                    }
                }
                else{
                    System.out.println("try again!");
                }
            }
            if(logOut){
                System.out.println("goodbye!");
                break;
            }
        }




    }
    private static void printHeader(){
        System.out.println("Welcome!");
    }
    private static void  PrintEntry(){
        System.out.println("if you have an account choose 1 to login");
        System.out.println("if you want to create an account choose 2");
    }
     public static boolean logOut=false;
    public static boolean login1(){
        System.out.println("enter your username and password!");
        String username=sc.nextLine();
        String password=sc.nextLine();
        boolean login1=new NetflixService().login(username,password);
        return login1;

    }





    public static boolean creatAc(){
        System.out.println("enter a username and password");
        String username=sc.nextLine();
        String password=sc.nextLine();
        NetflixService netflixService=new NetflixService();
        netflixService.createAccount(username,password);
        System.out.println("your account is now created, now you can login to use the platform!");
        boolean Login=netflixService.login(username,password);
        return Login;
    }
    private static   int getInput(){
        int choice=-1;
        while(choice<0 || choice>7){
            try{
                System.out.println("enter your choice: ");
                choice=Integer.parseInt(sc.nextLine());

            }
            catch(NumberFormatException e){
                System.out.println("invalid selection, try again");
            }

        }
        return choice;

    }
    private static void gettingEntryChoice(int choice){
        switch (choice){
            case 1:
                NetflixService netflixService=new NetflixService();
                break;

            case 2:
                creatAc();
                break;

        }
    }
    private static void printSecondMenu(){
        System.out.println("tv show options are from 1 to 4");
        System.out.println("1)search tv show");
        System.out.println("2)search movie");
        System.out.println("3)add tv show");
        System.out.println("4)add movie");
        System.out.println("user menu is 5 & 6 & 7");
        System.out.println("5)view favorites");
        System.out.println("6)add to favorites");
        System.out.println("7)searching in favorites");
        System.out.println("0)shutdown netflix!");
    }
    private static void userMenu(int choice1){
        System.out.println("please enter your username!");
        String username=sc.nextLine();
        String password=sc.nextLine();
        User user1=new User(username,password);
        switch (choice1){
            case 5:

                System.out.println("Enter your tv show` title");
                String title=sc.nextLine();
                System.out.println("Enter your tv show` genre");
                String genre=sc.nextLine();
                System.out.println("Enter your tv show` duration");
                String duration=sc.nextLine();
                System.out.println("Enter your tv show` release year");
                String releaseYear=sc.nextLine();
                System.out.println("Enter your tv show` rating");
                double rating=sc.nextDouble();
                user1.addToFavorites(new TVShow(title,releaseYear,genre,duration,rating));
                break;
            case 6:
                System.out.println("here is the list of your favorites");
                user1.viewFavorites();
                break;
            case 7:
                System.out.println("please enter your type of search in your favorites");
                System.out.println("1)search by title");
                System.out.println("2)search by genre");
                System.out.println("3)search by release year");
                int choice4=sc.nextInt();
                switch (choice4){
                    case 1:
                        System.out.println("please enter the title you are looking for!");
                        String title1=sc.nextLine();
                        user1.searchByTitle(title1);
                        break;
                    case 2:
                        System.out.println("please enter the genre you are looking for!");
                        String genre1=sc.nextLine();
                        user1.searchByGenre(genre1);
                        break;
                    case 3:
                        System.out.println("please enter the release year you are looking for!");
                        int releaseYear1=sc.nextInt();
                        user1.searchByReleaseYear(releaseYear1);
                        break;



                }
                break;
            case 0:
                logOut();


        }
    }
    public static void logOut(){
        logOut=true;

    }
    private static void tvShowOptions(int choice1){
        NetflixService netflixService=new NetflixService();
        switch (choice1){
            case 1:
                System.out.println("please enter your type of search");
                System.out.println("1)search by title");
                System.out.println("2)search by genre");
                System.out.println("3)search by release year");

                int choice2=getInput();
                switch (choice2){
                    case 1:
                        System.out.println("please enter the title you are looking for!");
                        String title=sc.nextLine();
                        netflixService.searchByTitle(title);
                        break;
                    case 2:
                        System.out.println("please enter the genre you are looking for!");
                        String genre=sc.nextLine();
                        netflixService.searchByGenre(genre);
                        break;
                    case 3:
                        System.out.println("please enter the release year you are looking for!");
                        int releaseYear=sc.nextInt();
                        netflixService.searchByReleaseYear(releaseYear);
                        break;



                }
                break;
            case 2:
                System.out.println("please enter your type of search");
                System.out.println("1)search by title");
                System.out.println("2)search by genre");
                System.out.println("3)search by length");
                int choice3=getInput();
                switch (choice3){
                    case 1:
                        System.out.println("please enter the title you are looking for!");
                        String title=sc.nextLine();
                        netflixService.searchByTitle1(title);
                        break;
                    case 2:
                        System.out.println("please enter the genre you are looking for!");
                        String genre=sc.nextLine();
                        netflixService.searchByGenre1(genre);
                        break;
                    case 3:
                        System.out.println("please enter the release year you are looking for!");
                        int releaseYear=sc.nextInt();
                        netflixService.searchByReleaseYear1(releaseYear);
                        break;
                    case 4:
                        System.out.println("please enter the length you are looking for!");
                        String length=sc.nextLine();
                        netflixService.searchByLength(length);
                        break;
                }
                break;
            case 3:

                System.out.println("Enter your tv show` title");
                String title=sc.nextLine();
                System.out.println("Enter your tv show` genre");
                String genre=sc.nextLine();
                System.out.println("Enter your tv show` duration");
                String duration=sc.nextLine();
                System.out.println("Enter your tv show` release year");
                String releaseYear=sc.nextLine();
                System.out.println("Enter your tv show` rating");
                double rating=sc.nextDouble();
                netflixService.addTvShow(new TVShow(title,releaseYear,genre,duration,rating));
                break;
            case 4:
                System.out.println("Enter your movie` title");
                String title1=sc.nextLine();
                System.out.println("Enter your movie` genre");
                String genre1=sc.nextLine();
                System.out.println("Enter your movie` duration");
                String duration1=sc.nextLine();
                System.out.println("Enter your movie` release year");
                String releaseYear1=sc.nextLine();
                System.out.println("Enter your movie` rating");
                double rating1=sc.nextDouble();
                System.out.println("Enter your movie` length");
                String length=sc.nextLine();
                netflixService.addMovie(new Movie(title1,genre1,releaseYear1,duration1,rating1,length));
                break;
            case 0:
                logOut();
        }




    }
}
