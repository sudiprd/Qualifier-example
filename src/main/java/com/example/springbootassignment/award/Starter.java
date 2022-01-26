package com.example.springbootassignment.award;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    //constructor DI
//    private AwardInterface iifa;
//    private AwardInterface net;
//    private AwardInterface oscar;
//
//    @Autowired
//    public Starter(@Qualifier("iifa") IifaAward iifa, @Qualifier("net") NetAward net, @Qualifier("oscar") OscarAward oscar){
//        this.iifa = iifa;
//        this.net = net;
//        this.oscar = oscar;
//    }
//
    //field base DI
//    @Autowired
//    @Qualifier("iifa")
//    private AwardInterface iifa;
//
//    @Autowired
//    @Qualifier("net")
//    private AwardInterface net;
//
//    @Autowired
//    @Qualifier("oscar")
//    private AwardInterface oscar;

    //setter based DI
    private AwardInterface iifa;
    private  AwardInterface oscar;
    private AwardInterface net;

    public void setStarter(@Qualifier("iifa") IifaAward iifa, @Qualifier("net") NetAward net, @Qualifier("oscar") OscarAward oscar ){
        this.iifa = iifa;
        this.net = net;
        this.oscar = oscar;
    }

    @Override
    public void run(String... args) throws Exception {
            iifa.bestActorAward("Sudip");
            iifa.bestFilmAward("Dune");
            iifa.bestWriterAward("Subash");

            net.bestWriterAward("Pradhan");
            net.bestFilmAward("TeenPaano");
            net.bestWriterAward("Sid");

            oscar.bestFilmAward("Anup");
            oscar.bestFilmAward("Mahimata");
            oscar.bestWriterAward("Shrestha");
    }
}
