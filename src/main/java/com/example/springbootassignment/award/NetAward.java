package com.example.springbootassignment.award;

import org.springframework.stereotype.Component;

@Component("net")
public class NetAward implements AwardInterface{

    @Override
    public void bestFilmAward(String film) {
        System.out.println("Best film NetAward goes to :"+film);
    }

    @Override
    public void bestActorAward(String actor) {
        System.out.println("Best actor NetAward goes to :"+ actor);
    }

    @Override
    public void bestWriterAward(String writer) {
        System.out.println("Best Writer NetAward goes to: "+ writer);
    }
}
