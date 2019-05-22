package at.nacs.thebarista.logic;

import at.nacs.thebarista.persistance.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

@Service
@RequiredArgsConstructor
public class OrderManager {

  private final OrderClient client;

  public Order send() throws InterruptedException {
    ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    executor.awaitTermination(15, SECONDS);
    Order order = client.findOrder();
    order.setReady(true);
    return order;
  }
}
