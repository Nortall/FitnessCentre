package org.example;

import java.util.*;

public class Customers {

    private Integer customer_id;
    private String name;
    private String surname;
    private String phone_number;

    public Customers() {
    }

    public Customers(Integer customer_id, String name, String surname, String phone_number) {
        this.customer_id = customer_id;
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
    }

    public Integer getCustomer_id(){
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id){
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public static List<Customers> generateCustomers(int countOfCustomers) {
        List<Customers> customersList = new ArrayList<>();
        Set<Integer> usedId = new HashSet<>();

        for (int i = 0; i < countOfCustomers; i++) {
            Integer customer_id = Helper.generateUniqueId(usedId);
            String name = "CustomerName_" + i;
            String surname = "CustomerSurname_" + i;
            String phone_number = Helper.generatePhoneNumber();

            Customers customer = new Customers(customer_id,name, surname, phone_number);
            customersList.add(customer);
        }

        return customersList;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}

