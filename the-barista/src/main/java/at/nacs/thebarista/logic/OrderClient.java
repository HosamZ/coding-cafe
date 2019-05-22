package at.nacs.thebarista.logic;

import at.nacs.thebarista.persistance.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("the-cashier")
public interface OrderClient {

  @GetMapping("/order/beverage")
  Order findOrder();
}