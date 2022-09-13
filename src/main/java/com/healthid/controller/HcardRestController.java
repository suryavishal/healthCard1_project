package com.healthid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthid.Services.HcardsService;
import com.healthid.entities.Hcards;

@RestController
@RequestMapping("/api/cards")
public class HcardRestController {
	
	@Autowired
	private HcardsService hcardservice;
	
  @GetMapping
  public List<Hcards> getAllCards(){
  List<Hcards> hcard = hcardservice.listall();
  return hcard;
  }

  @PostMapping
  public void saveHcards(@RequestBody Hcards hcard) {
	  hcardservice.saveOneData(hcard);
  }
  @DeleteMapping("/delete/{id}")
  public void deleteByid(@PathVariable("id") long id) {
  hcardservice.deleteById(id);
  
  }
  @PutMapping
  public void updateHcard(@RequestBody Hcards  hcard) {
  hcardservice.saveOneData(hcard);
  }
  @GetMapping("/cards/{id}")
  public Hcards getOneCard(@PathVariable("id") long id) {
  Hcards hcard = hcardservice.updatebyId(id);
  return hcard;
}
}