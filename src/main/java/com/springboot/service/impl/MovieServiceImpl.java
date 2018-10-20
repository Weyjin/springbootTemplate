package com.springboot.service.impl;

import com.springboot.dao.IMovieDao;
import com.springboot.entity.Movie;
import com.springboot.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    private IMovieDao movieDao;
    @Override
    public boolean insert(Movie movie) {
        int count=movieDao.insert(movie);
        if(count>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        int count=movieDao.delete(id);
        if(count>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Movie movie) {
        int count=movieDao.update(movie);
        if(count>0){
            return true;
        }
        return false;
    }

    @Override
    public List<Movie> toList(Map<String, Object> map) {
        List<Movie> movies=movieDao.toList(map);
        return movies;
    }

    @Override
    public Movie selectByPrimaryKey(String id) {
        return movieDao.selectByPrimaryKey(id);
    }
}
