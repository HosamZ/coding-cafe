package at.nacs.thepickupstation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pickup")
@RequiredArgsConstructor
public class OrderEndpoint {

  private final OrderManager orderManager;

  @GetMapping
  List<Order> get(Order order) {
    orderManager.save(order);
    return orderManager.findAll();
  }
}