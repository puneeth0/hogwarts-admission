package com.example.hogwarts_admission.model;

public class HarryPotterCharacter {

    // Getters and Setters
    private Long id; // Primary key

    private String name; // Character name

    private int age; // Character's age

    private String house; // Hogwarts house

    private String role; // Role in Hogwarts (e.g., Student, Professor)

    private String bloodStatus; // Blood status (e.g., Half-Blood, Pure-Blood)

    private String team; // Team (Potter or Voldemort)

    private String snitchMatchPlayer; // Whether the character plays Snitch Match

    private String gender; // Gender of the character

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBloodStatus() {
        return bloodStatus;
    }

    public void setBloodStatus(String bloodStatus) {
        this.bloodStatus = bloodStatus;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getSnitchMatchPlayer() {
        return snitchMatchPlayer;
    }

    public void setSnitchMatchPlayer(String snitchMatchPlayer) {
        this.snitchMatchPlayer = snitchMatchPlayer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "HarryPotterCharacter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", house='" + house + '\'' +
                ", role='" + role + '\'' +
                ", bloodStatus='" + bloodStatus + '\'' +
                ", team='" + team + '\'' +
                ", snitchMatchPlayer='" + snitchMatchPlayer + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}