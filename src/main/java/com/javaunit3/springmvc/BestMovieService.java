package com.javaunit3.springmvc;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class BestMovieService {
    @Autowired
    private Movie movie;
    public Movie getBestMovie() {
        return movie;
    }
}