package org.example;


import java.util.List;

public class FitnessCentre {
    private String name;
    private Integer gym_id;
    private List<Halls> halls;
    private List<Coaches> coaches;
    private List<Services> services;
    private List<Customers> customers;
    private List<Subscription> subscriptions;

    public FitnessCentre(){

    }
    public FitnessCentre(String name, Integer gym_id, List<Halls> halls, List<Coaches> coaches, List<Services> services, List<Customers> customers, List<Subscription> subscriptions) {
        this.name = name;
        this.gym_id = gym_id;
        this.halls = halls;
        this.coaches = coaches;
        this.services = services;
        this.customers = customers;
        this.subscriptions =subscriptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGym_id() {
        return gym_id;
    }

    public void setGym_id(Integer gym_id) {
        this.gym_id = gym_id;
    }

    public List<Halls> getHalls() {
        return halls;
    }

    public void setHalls(List<Halls> halls) {
        this.halls = halls;
    }

    public List<Coaches> getCoaches() {
        return coaches;
    }

    public void setCoaches(List<Coaches> coaches) {
        this.coaches = coaches;
    }

    public List<Services> getServices() {
        return services;
    }

    public void setServices(List<Services> services) {
        this.services = services;
    }

    public List<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customers> customers) {
        this.customers = customers;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public String toString() {
        return "FitnessCentre{" +
                "name='" + name + '\'' +
                ", gym_id=" + gym_id +
                ", halls=" + halls +
                ", coaches=" + coaches +
                ", services=" + services +
                ", customers=" + customers +
                ", subscriptions=" + subscriptions +
                '}';
    }
}

