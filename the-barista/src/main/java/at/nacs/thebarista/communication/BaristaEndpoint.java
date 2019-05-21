package at.nacs.thebarista.communication;

import at.nacs.thebarista.logic.OrderManager;
import at.nacs.thebarista.persistance.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/barista")
@RequiredArgsConstructor
public class BaristaEndpoint {
  private final OrderManager manager;

  @GetMapping
  Order get() throws InterruptedException {
    Order sendOrder = manager.send();
    return sendOrder;
  }

}