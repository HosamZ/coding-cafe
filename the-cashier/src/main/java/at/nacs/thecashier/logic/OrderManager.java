package at.nacs.thecashier.logic;

import at.nacs.thecashier.persistence.Order;
import at.nacs.thecashier.repositories.OrderRepository;
import at.nacs.thecashier.repositories.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderManager {
  private final PurchaseRepository purchaseRepository;


  public List<Order> findBeverage() {
    return findAllOrders().stream()
                          .filter(order -> Objects.nonNull(order.getBeverage()))
                          .collect(Collectors.toList());
  }

  public List<Order> findFoodstuff() {
    return findAllOrders().stream()
                          .filter(order -> Objects.nonNull(order.getFoodstuff()))
                          .collect(Collectors.toList());
  }

  private List<Order> findAllOrders() {
    List<Order> orders = new ArrayList<>();
    purchaseRepository.findAll().stream()
                      .map(purchase -> purchase.getOrderList())
                      .forEach(listOfOrder -> listOfOrder.stream()
                                                         .forEach(order -> orders.add(order)));
    return orders;

  }
}

