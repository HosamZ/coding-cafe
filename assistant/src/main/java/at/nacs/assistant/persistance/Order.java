package at.nacs.assistant.persistance;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Order {
  @Id
  @GeneratedValue
  private Long id;

  @Column(unique = true)
  private String uuid;

  private String name;

  private Double price;

  private boolean isReady;

  private String foodstuff;

  private String beverage;
}
//
//  private String id;
//  private String name;
//  private Double price;
//  private boolean isReady;
//  private String foodstuff;
//  private String beverage;
