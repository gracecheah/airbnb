package com.example.airbnb.entities;

import java.util.ArrayList;
import com.example.airbnb.entities.Item;

/**
 * AirBnBProperty
 */
public class AirBnBProperty {
  String categoryName;
  ArrayList<Item> items;
  int remainingItems;

  public AirBnBProperty(String categoryName, int remainingItems, ArrayList<Item> items) {
    super();
    this.categoryName = categoryName;
    this.remainingItems = remainingItems;
    this.items = new ArrayList<Item>();
  }

  public String getCategoryName() {
    return this.categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public ArrayList<Item> getItems() {
    return this.items;
  }

  public void setItems(ArrayList<Item> items) {
    this.items = items;
  }

  public int getRemainingItems() {
    return this.remainingItems;
  }

  public void setRemainingItems(int remainingItems) {
    this.remainingItems = remainingItems;
  }

  public void addItems(Item items) {
    this.items.add(items);
  }

}