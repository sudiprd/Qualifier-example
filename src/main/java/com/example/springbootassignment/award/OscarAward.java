package com.example.springbootassignment.award;


import org.springframework.stereotype.Component;

@Component("oscar")
public class OscarAward implements AwardInterface {


    @Override
    public void bestFilmAward(String film) {
        System.out.println("Best 2021 film Oscar award Goes to :"+film);

    }

    @Override
    public void bestActorAward(String actor) {
        System.out.println("Best Actor Oscar award goes to : "+ actor);
    }

    @Override
    public void bestWriterAward(String writer) {
        System.out.println("Best Writer Oscar award to goes to :" + writer);
    }
}
