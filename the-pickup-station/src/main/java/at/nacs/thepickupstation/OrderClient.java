package at.nacs.thepickupstation;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("the-barista")
public interface OrderClient {

  @GetMapping("/barista")
  Order findOrder();
}