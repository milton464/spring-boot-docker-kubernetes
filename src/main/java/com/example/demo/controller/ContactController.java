package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
@CrossOrigin(origins = "*")
public class ContactController {

	@GetMapping
	public ResponseEntity<?> getContacts() {
		Contact contact = Contact.builder()
				.firstName("Gretna")
				.lastName("Chicken")
				.number("12345678")
				.email("Gretna@gmail.com").build();
		return ResponseEntity.status(HttpStatus.OK).body(contact);
	}
}
