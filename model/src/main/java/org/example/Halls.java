package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

class Halls {
    private String name;
    private Integer hall_id;
    private Integer square;

    public Halls(){

    }

    public Halls(String name, Integer hall_id, Integer square) {
        this.name = name;
        this.hall_id = hall_id;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHall_id() {
        return hall_id;
    }

    public void setHall_id(Integer hall_id) {
        this.hall_id = hall_id;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Halls{" +
                "name='" + name + '\'' +
                ", hall_id=" + hall_id +
                ", square=" + square +
                '}';
    }

    public static List<Halls> generateHalls(int countOfHalls) {
        List<Halls> hallsList = new ArrayList<>();
        Set<Integer> usedIds = new HashSet<>();


        Random random = new Random();

        for (int i = 0; i < countOfHalls; i++) {
            String name = "HallName_" + i;
            Integer hall_id = Helper.generateUniqueId(usedIds);
            Integer square = random.nextInt(1000) + 100;

            Halls hall = new Halls(name, hall_id, square);
            hallsList.add(hall);
        }

        return hallsList;
    }

}
