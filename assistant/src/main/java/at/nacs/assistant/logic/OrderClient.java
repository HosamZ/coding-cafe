package at.nacs.assistant.logic;

import at.nacs.assistant.persistance.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("the-cashier")
public interface OrderClient {

  @GetMapping("/order/foodstuff")
  Order findOrder();
}
