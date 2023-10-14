package org.example;

import java.util.*;

public class Services {

    private String name;
    private Integer service_id;
    private Integer price;

    public Services(){

    }

    public Services(String name, Integer service_id, Integer price) {
        this.name = name;
        this.service_id = service_id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public static List<Services> generateServices(int countOfServices) {
        Random random = new Random();

        List<Services> servicesList = new ArrayList<>();
        Set<Integer> usedIds = new HashSet<>();

        for (int i = 0; i < countOfServices; i++) {
            String name = generateName();
            Integer service_id = Helper.generateUniqueId(usedIds);
            Integer price = random.nextInt(5000) + 300;

            Services service = new Services(name, service_id, price);
            servicesList.add(service);
        }

        return servicesList;
    }

    private static String generateName(){
        String[] names = {"Тренажерный зал", "Бассейн", "Массаж", "Групповые занятия", "Каток", "Релакс"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }


    @Override
    public String toString() {
        return "Services{" +
                "name='" + name + '\'' +
                ", service_id=" + service_id +
                ", price=" + price +
                '}';
    }
}
