package com.example.contact.service;

import com.example.contact.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> contactList = List.of(new Contact(12343, "abc@gmail.com", 1),
            new Contact(23435, "efg@gmail.com", 1),
            new Contact(97886, "hij@gmail.com", 2),
            new Contact(65433, "klm@gmail.com", 3),
            new Contact(67890, "nop@gmail.com", 4),
            new Contact(45678, "qrs@gmail.com", 4));

    @Override
    public List<Contact> getContactsPerUser(int userId) {
        return contactList.stream().filter(contacts -> contacts.getUserId() == userId).collect(Collectors.toList());
    }

    public List<Contact> getAllContacts() {
        return contactList;
    }
}
