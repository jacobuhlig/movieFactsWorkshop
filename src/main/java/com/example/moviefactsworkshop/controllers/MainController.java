package com.example.moviefactsworkshop.controllers;

import com.example.moviefactsworkshop.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    MovieService mv = new MovieService();

    //3.1
    @GetMapping("/")
    public String hello() {
        return mv.hello();
    }

    //3.2
    @GetMapping("/getFirst")
    public String firstMovie() {
        return mv.firstMovie();
    }

    //3.3
    @GetMapping("/getRandom")
    public String randomMovie() {
        return mv.randomMovie();
    }

    //3.4
    @GetMapping("/getTenSortByPopularity")
    public String getAndSortTenRandomMovies() {
        return mv.getAndSortTenRandomMovies().toString();
    }

    //3.5
    @GetMapping("/howManyWonAnAward")
    public String howManyWonAnAward() {
        //return mv.randomMovie();
        return "incomplete";
    }
}
