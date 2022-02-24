package com.example.moviefactsworkshop.services;

import com.example.moviefactsworkshop.fileHandler.FileHandler;
import com.example.moviefactsworkshop.models.Movie;

import java.util.ArrayList;
import java.util.Collections;

public class MovieService {

    FileHandler fh = new FileHandler();

    public String hello() {
        return "Hello and welcome!" +
                "\nThis Application handles a list of movie objects";
    }

    public String firstMovie() {
        fh.handler();
        return fh.getMovies().get(1).toString();
    }

    public String randomMovie() {
        fh.handler();
        return fh.getMovies().get(fh.randomizer()).toString();
    }

    public ArrayList<String> getAndSortTenRandomMovies() {
        fh.handler();
        ArrayList<Movie> movieList = new ArrayList<>();
        ArrayList<String> topTenList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            movieList.add(fh.getMovies().get(fh.randomizer()));
        }

        Collections.sort(movieList);

        for (int i = 0; i < 10; i++) {
            topTenList.add(movieList.get(i).toString());
        }

        return topTenList;
    }

    public String howManyWonAnAward() {
        fh.handler();
        int count = 0;

        for (Movie movie : fh.getMovies()) {
            if(movie.hasWonAward()) {
                count++;
            }
        }

        /*for (int i = 0; i < fh.getMovies().size(); i++) {
            if(fh.getMovies().get(i).hasWonAward()) {
                count ++;
            }
        }*/

        return String.valueOf(count);
    }
}