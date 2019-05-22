package at.nacs.thepickupstation;

import lombok.Data;

@Data
public class Order {

  private String id;
  private String uuid;
  private String name;
  private Double price;
  private boolean isReady;
}