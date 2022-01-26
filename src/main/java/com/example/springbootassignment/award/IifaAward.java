package com.example.springbootassignment.award;

import org.springframework.stereotype.Component;

@Component("iifa")
public class IifaAward implements AwardInterface{

    @Override
    public void bestFilmAward(String film) {
        System.out.println("Best IIFA film award goes to : "+film);
    }

    @Override
    public void bestActorAward(String actor) {
        System.out.println("Best IIFA actor award goes to: "+ actor);
    }

    @Override
    public void bestWriterAward(String writer) {
        System.out.println("Best IIFA writer award goes to : "+ writer);
    }
}
