package com.java.demo;

public class Visitor {
    private int id;
    private String name;
    private String address;
    private long contact;

    private Appointment appointment;

    public Visitor(int id, String name, String address, long contact, Appointment appointment) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.appointment = appointment;
    }

    public Visitor(){


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                ", appointment=" + appointment +
                '}';
    }


}
