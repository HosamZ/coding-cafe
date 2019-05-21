package at.nacs.thecashier.communication;

import at.nacs.thecashier.logic.OrderManager;
import at.nacs.thecashier.persistence.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderEndpoint {

  private final OrderManager orderManager;

  @PostMapping
  Order save(@RequestBody Order order) {
    return orderManager.save(order);
  }

  @GetMapping("/beverage/{beverage}")
  List<Order> findBevarages(@PathVariable String beverage) {
    return orderManager.findBeverage(beverage);
  }

  @GetMapping("/foodstuff/{foodstuff}")
  List<Order> findFoodstuff(@PathVariable String foodstuff) {
    return orderManager.findFoodstuff(foodstuff);
  }
}
