package at.nacs.thebarista.persistance;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("the-cashier")
public interface OrderClient {

  @GetMapping("/order/beverage")
  Order findOrder();
}