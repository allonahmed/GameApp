package com.example.gameapp;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;


class Game {
    public static String AhmedPoem(String name)
    {
        return "My student " + name + ", standing proud,  \nis a fine example for the crowd.";
    }
    //continue your class here, add one function per game
    public static String AhmedFortune(String name)
    {
        ArrayList<String> fortune = new ArrayList<String>();
        fortune.add("You will die if you do Dr.Zavalas quiz next wednesday!");
        fortune.add("You will blink at least one more time in your life");
        fortune.add("You will take a shower because you smell bad");
        fortune.add("you suck");
        fortune.add("you will win the lottery! just kidding");
        int rand = (int) (Math.random() * 4);
        String fort = fortune.get(rand);
        return fort;
    }

    public static String AhmedLottery(int a, int b, int c)
    {

        String result = "";
         int x = (int)(Math.random()*9 +1);
         int y = (int)(Math.random()*9 +1);
         int z = (int)(Math.random()*9 +1);

        if ((a==x && b==y && c==z))
        {
            result = "Congratulations, you won the lottery!";
        }
        else
        {
            result = "Wrong, idiot";
        }
        return result;
    }

    public static String AhmedMadLibs(String adj1, String noun1, String place1, String adj2, String pnoun1, String noun2, String person1, int num, String pnoun2, String person2, String noun3, String pnoun3, String adj3, String pnoun4, String verb, String pnoun5, String celeb, String female, String adj4, String place2)
    {
        String story = "Good morning! Here are the " + adj1 + " stories we're following today: A thirty-foot-high " + noun1 + " struck the coast of (the) " + place1 + " earlier today, causing " + adj2 + " flooding and forcing residents tot flee to higher " + pnoun1 + ". A rare watercolor " + noun2 + " by renowned fifteenth-century artist " + person1 + " Van Gogh sold at auction today for the record sum of " + num + " " + pnoun2 + ". " + person2 + " turns 113 today and is declared the oldest living " + noun3 + " by the Book of World " + pnoun3 + ". New, " + adj3 + " research out of the University of " + pnoun4 + "concluded that thirty minutes of vigorous " + verb + " can help you lose up to ten " + pnoun5 + " in a month. Hollywood hearthrob " + celeb + " has married longtime love " + female + " in a lavish, " + adj4 + " ceremony in (the) " + place2 + ".";

        return story;

    }

}
