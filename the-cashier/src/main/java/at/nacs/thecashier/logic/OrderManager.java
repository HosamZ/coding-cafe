package at.nacs.thecashier.logic;

import at.nacs.thecashier.persistence.Order;
import at.nacs.thecashier.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderManager {
  private final OrderRepository orderRepository;

  public Order save(Order order) {
    return orderRepository.save(order);
  }

  public List<Order> findBeverage(String beverage) {
    return orderRepository.findAllByBeverage(beverage);
  }
  public List<Order> findFoodstuff(String foodstuff) {
    return orderRepository.findAllByFoodstuff(foodstuff);
  }


}

