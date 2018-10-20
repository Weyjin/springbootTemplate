package com.springboot.controller;

import com.springboot.entity.Movie;
import com.springboot.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("home")
public class HomeController {

    @Autowired
    private IMovieService movieService;

    @RequestMapping("index")
    public ModelAndView index(){

        ModelAndView view=new ModelAndView();
        view.setViewName("home/index");
        view.addObject("message","hello world");
        return view;
    }


    @RequestMapping("getMovies")
    @ResponseBody
    public List<Movie> getMovies(){
        List<Movie> movies=movieService.toList(new HashMap<>());
        return movies;
    }


}
