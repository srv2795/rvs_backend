package com.example.contact.model;

public class Contact {
    private long phone;
    private String email;
    private int userId;

    public Contact(long phone, String email, int userId) {
        this.phone = phone;
        this.email = email;
        this.userId = userId;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
