package com.example.moviefactsworkshop.models;

public class Movie {
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

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public boolean isHasWonAward() {
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
}
