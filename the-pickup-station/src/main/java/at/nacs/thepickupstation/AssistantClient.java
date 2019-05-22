package at.nacs.thepickupstation;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("assistant")
public interface AssistantClient {

  @GetMapping("/assistant")
  Order findOrder();
}