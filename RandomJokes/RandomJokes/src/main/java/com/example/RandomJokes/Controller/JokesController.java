package com.example.RandomJokes.Controller;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class JokesController {
    ArrayList<String> jokelist = new ArrayList<>();


    @PostMapping(value = "save")
    public String saveJokes(@RequestBody String joke){
        jokelist.add(joke);
        return "joke saved";
    }
    @GetMapping(value = "/getjokes")
    public String getjokes(){

        jokelist.add("Why do we tell actors to “break a leg?\n"  +
                "\n" +
        "Because every play has a cast. Here are some dark jokes to check out if you have a morbid sense of humor.");

        jokelist.add("Helvetica and Times New Roman walk into a bar.\n"  +
                "\n" +
                "Get out of here!” shouts the bartender. “We don’t serve your type.");

        jokelist.add("What did the snail who was riding on the turtle's back say?\n"  +
                "\n" +
                "Wheeeee!");

        jokelist.add("What do you call a lazy kangaroo? \n"  +
                "\n" +
                "A pouch potato.");

        jokelist.add("Why do we tell actors to \"break a leg? \n"  +
                "\n" +
                "Because every play has a cast");




        int randomnumber = 0 +(int)(Math.random() * ((jokelist.size()-1 -0)+1));
        return jokelist.get(randomnumber);
    }
}
