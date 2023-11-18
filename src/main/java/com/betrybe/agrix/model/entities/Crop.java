package com.betrybe.agrix.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crops")
public class Crop {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer farm_id;
  private String name;
  private Double planted_area;

  public Crop() {
  }

  public Crop(Integer id, Integer farm_id, String name, Double planted_area) {
    this.id = id;
    this.farm_id = farm_id;
    this.name = name;
    this.planted_area = planted_area;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getFarm_id() {
    return farm_id;
  }

  public void setFarm_id(Integer farm_id) {
    this.farm_id = farm_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPlanted_area() {
    return planted_area;
  }

  public void setPlanted_area(Double planted_area) {
    this.planted_area = planted_area;
  }
}
