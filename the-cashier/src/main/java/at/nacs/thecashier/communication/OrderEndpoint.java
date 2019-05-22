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

  @GetMapping("/beverage")
  List<Order> findBevarages() {
    return orderManager.findBeverage();
  }

  @GetMapping("/foodstuff")
  List<Order> findFoodstuff() {
    return orderManager.findFoodstuff();
  }
}
