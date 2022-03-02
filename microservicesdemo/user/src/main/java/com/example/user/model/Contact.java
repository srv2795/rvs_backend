package com.example.user.model;

public class Contact {
    private long phone;
    private String email;
    private String contactName;

    public Contact(long phone, String email, String contactName) {
        this.phone = phone;
        this.email = email;
        this.contactName = contactName;
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

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
