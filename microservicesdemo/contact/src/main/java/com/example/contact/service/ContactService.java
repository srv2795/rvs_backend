package com.example.contact.service;

import com.example.contact.model.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsPerUser(int UserId);

    public List<Contact> getAllContacts();
}
