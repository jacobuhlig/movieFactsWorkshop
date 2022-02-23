package com.example.moviefactsworkshop.models;

public class Movie implements Comparable<Movie> {
    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private boolean hasWonAward;

    public Movie(int year, int length, String title, String subject, int popularity, String hasWonAward) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        if(hasWonAward.equals("Yes")) {
            this.hasWonAward = true;
        } else {
            this.hasWonAward = false;
        }
    }

    public boolean hasWonAward() {
        return hasWonAward;
    }

    @Override
    public String toString() {
        return  "Year: " + year +
                " | " + "length: " + length +
                " | " + "title: " + title +
                " | " + "subject: " + subject +
                " | " + "popularity: " + popularity +
                " | " + "hasWonAward: " + hasWonAward + "<br>";
    }

    @Override
    public int compareTo(Movie o) {
        if(popularity == o.popularity)
            return 0;
        else if(popularity > o.popularity)
            return 1;
        else
            return -1;
    }
}
