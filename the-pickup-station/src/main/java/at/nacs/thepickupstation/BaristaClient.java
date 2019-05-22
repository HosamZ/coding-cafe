package at.nacs.thepickupstation;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("the-barista")
public interface BaristaClient {

  @GetMapping("/barista")
  Order findOrder();
}