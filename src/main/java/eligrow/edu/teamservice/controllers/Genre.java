package eligrow.edu.teamservice.controllers;

public class Genre {
    private String name;
    private int rating;

    public Genre(String n, int r){
        name = n;
        rating = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
