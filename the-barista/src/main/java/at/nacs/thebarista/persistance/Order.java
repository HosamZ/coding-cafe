package at.nacs.thebarista.persistance;

import lombok.Data;

@Data
public class Order {

  private String id;
  private String name;
  private Double price;
  private boolean isReady;
  private String foodstuff;
  private String beverage;
}