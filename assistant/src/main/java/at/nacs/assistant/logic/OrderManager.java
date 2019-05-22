package at.nacs.assistant.logic;

import at.nacs.assistant.persistance.Order;
import at.nacs.assistant.persistance.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

@Service
@RequiredArgsConstructor
public class OrderManager {

  private final OrderClient client;
  private final OrderRepository repository;

  public Order takeOrder() throws InterruptedException {
    List<Order> orders = repository.findAll();
    Order receivedOrder = client.findOrder();
    if (orders.contains(receivedOrder)) {
      ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
      executor.awaitTermination(5, SECONDS);
//      receivedOrder.setReady(true);
//      repository.save(receivedOrder);
      return receivedOrder;
    }
    ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    executor.awaitTermination(10, SECONDS);
    repository.save(receivedOrder);
    return receivedOrder;
  }

}