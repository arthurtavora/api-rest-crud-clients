package com.devsuperior.apirestcrudclients.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.apirestcrudclients.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> clientList = new ArrayList<>();
		clientList.add(new Client(1L, "Maria", "16473895744", 5000.0, Instant.now(), 3));
		clientList.add(new Client(2L, "Ronaldo", "2643897744", 4000.0, Instant.now(), 1));
		return ResponseEntity.ok().body(clientList);
	}
}
