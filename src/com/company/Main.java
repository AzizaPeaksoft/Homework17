package com.company;

public class Main {

    public static void main(String[] args) {

        Sheep sheep1 = new Sheep(25, 5 , "W", "Esen");
        Sheep sheep2 = new Sheep(30, 7, "M", "Esen");
        Sheep sheep3 = new Sheep(20, 4, "W", "Esen");


        Cow cow1 = new Cow(100,10,"W","Esen");
        Cow cow2 = new Cow(80,7,"M","Esen");
        Cow cow3 = new Cow(50, 5, "M", "Esen");
        Cow cow4 = new Cow(40, 4, "W", "Esen");
        Cow cow5 = new Cow(20, 2, "M", "Esen");

        Horse horse1 = new Horse(200, 10, "W", "Esen", "White");
        Horse horse2 = new Horse(150, 8, "M", "Esen", "Black");

        Farm farm1 = new Farm();
        farm1.setAddress("New York");
        farm1.setOwnerName("Esen");
        farm1.setCows(new Cow[] {cow1, cow2, cow3, cow4, cow5});
        farm1.setSheep(new Sheep[] {sheep1, sheep2, sheep3});
        farm1.setHorses(new Horse[] {horse1, horse2});

        Farm farm2 = new Farm();
        farm2.setAddress("Chicago");
        farm2.setOwnerName("Esen");
        farm2.setCows(new Cow[] {cow1});
        farm2.setSheep(new Sheep[] {sheep1});
        farm2.setHorses(new Horse[] {horse1});
        
        System.out.println(farm1);
        System.out.println(farm2);

    }
}
