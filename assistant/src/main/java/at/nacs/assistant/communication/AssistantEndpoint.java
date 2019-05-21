package at.nacs.assistant.communication;

import at.nacs.assistant.logic.OrderManager;
import at.nacs.assistant.persistance.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assistant")
@RequiredArgsConstructor
public class AssistantEndpoint {

  private final OrderManager manager;

  @GetMapping
  Order get() throws InterruptedException {
    return manager.send();
  }
}