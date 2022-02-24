package com.example.moviefactsworkshop.fileHandler;

import com.example.moviefactsworkshop.models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FileHandler {

    ArrayList<Movie> movies = new ArrayList<>();

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public int randomizer() {
        Random random = new Random();
        return random.nextInt(movies.size());
    }

    public void handler() {
        movies.clear();
        File file = new File("src/main/resources/imdb-data.csv");
        try {
            Scanner scan = new Scanner(file);

            while(scan.hasNext()) {
                String line = scan.nextLine();
                String[] movieAttributes = line.split(";");
                movies.add(createMovie(movieAttributes));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Movie createMovie(String[] movieAttributes) {
        int year = Integer.parseInt(movieAttributes[0]);
        int length = Integer.parseInt(movieAttributes[1]);
        String title = movieAttributes[2];
        String subject = movieAttributes[3];
        int popularity = Integer.parseInt(movieAttributes[4]);
        String hasWonAward = movieAttributes[5];

        return new Movie(year, length, title, subject, popularity, hasWonAward);
    }


}
