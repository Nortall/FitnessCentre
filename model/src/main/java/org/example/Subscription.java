package org.example;

import java.util.*;

public class Subscription {

    private Integer subscription_id;

    private String type;

    private Integer price;

    public Subscription(){

    }

    public Subscription(Integer subscription_id, String type, Integer price) {
        this.subscription_id = subscription_id;
        this.type = type;
        this.price = price;
    }

    public Integer getSubscription_id() {
        return subscription_id;
    }

    public void setSubscription_id(Integer subscription_id) {
        this.subscription_id = subscription_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    private static String generateType(){
        Random random = new Random();
        String[] types = {"Стандартный", "Утренний", "Вечерний", "Расширенный",};
        return types[random.nextInt(types.length)];
    }

    public static List<Subscription> generateSubscription(int countOfSubscription){
        Random random = new Random();
        List<Subscription> subscriptions = new ArrayList<>();
        Set<Integer> usedId = new HashSet<>();
        for(int i = 0; i < countOfSubscription; i++){
            Integer subscription_id = Helper.generateUniqueId(usedId);
            String type = generateType();
            Integer price = random.nextInt(5000) + 800;

            Subscription subscription = new Subscription(subscription_id, type, price);
            subscriptions.add(subscription);
        }
        return subscriptions;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

