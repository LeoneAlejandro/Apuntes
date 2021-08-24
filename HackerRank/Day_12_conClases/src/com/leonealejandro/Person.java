package com.leonealejandro;

public class Person {
    private String firstName;
    private String lastname;
    private int idNumber;
    private int[] scores;

    public Person(String data) {
        dataSplitter(data);
    }

    private void dataSplitter(String data) {
        String[] dataInArray = data.split(" ");
        this.firstName = dataInArray[0];
        this.lastname = dataInArray[1];
        this.idNumber = Integer.parseInt(dataInArray[2]);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public int getIdNumber() {
        return idNumber;
    }
}
