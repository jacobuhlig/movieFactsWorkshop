package com.example.moviefactsworkshop.services;

import com.example.moviefactsworkshop.fileHandler.FileHandler;
import com.example.moviefactsworkshop.models.Movie;

import java.util.ArrayList;

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
        ArrayList<String> a = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            a.add(fh.getMovies().get(fh.randomizer()).toString());
        }

        //Implement sorting according to popularity code here

        return a;
    }
}
