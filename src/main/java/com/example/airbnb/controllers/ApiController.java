package com.example.airbnb.controllers;

import com.example.airbnb.entities.AirBnBProperty;
import com.example.airbnb.entities.Item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiController {
  @GetMapping(value = "/", produces = "application/json")
  public AirBnBProperty showCategory(@RequestParam() String param) {
    AirBnBProperty property = new AirBnBProperty(param, 0, null);
    property.addItems(new Item(true, true, "Bright, Comfortable Room in Hospitable, Gay Household", 274, "RM", 5, 501));
    property.addItems(new Item(false, true, "Mayfair One · Mod minimalism near Oxford Street", 1839, "RM", 5, 888));
    property.setCategoryName("Air Bnb Plus");
    property.setRemainingItems(483);
    return property;
  }

}