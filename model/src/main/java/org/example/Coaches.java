package org.example;

import java.util.*;

public class Coaches {

    private Integer coach_id;
    private String name;
    private String surname;
    private Integer experience;
    private String specialization;
    private String phone_number;

    public Coaches(){

    }

    public Coaches(Integer coach_id,String name, String surname, Integer experience, String specialization, String phone_number) {
        this.coach_id = coach_id;
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.specialization = specialization;
        this.phone_number = phone_number;
    }

    public Integer getCoach_id(){
        return coach_id;
    }

    public void setCoach_id(Integer coach_id){
        this.coach_id = coach_id;
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

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public static List<Coaches> generateCoaches(int countOfCoaches) {
        List<Coaches> coachesList = new ArrayList<>();
        Set<Integer> usedId = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < countOfCoaches; i++) {
            Integer coach_id = Helper.generateUniqueId(usedId);
            String name = "CoachName_" + i;
            String surname = "CoachSurname_" + i;
            Integer experience = random.nextInt(30) + 1; // Генерация опыта от 1 до 30 лет
            String specialization = generateSpecialization();
            String phone_number = Helper.generatePhoneNumber();

            Coaches coach = new Coaches(coach_id, name, surname, experience, specialization, phone_number);
            coachesList.add(coach);
        }

        return coachesList;
    }
    private static String generateSpecialization() {
        String[] specializations = {"Фитнесс", "Йога", "Плавание", "Бокс", "Фигурное катание", "Бодибилдинг", "Смешанные единоборства"};
        Random random = new Random();
        return specializations[random.nextInt(specializations.length)];
    }

    @Override
    public String toString() {
        return "Coaches{" +
                "coach_id=" + coach_id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience=" + experience +
                ", specialization='" + specialization + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}

