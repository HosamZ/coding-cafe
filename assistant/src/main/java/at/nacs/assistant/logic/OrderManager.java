package at.nacs.assistant.logic;

import at.nacs.assistant.persistance.Order;
import at.nacs.assistant.persistance.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

@Service
@RequiredArgsConstructor
public class OrderManager {

  private final OrderClient client;
  private final OrderRepository repository;

  public Order send() throws InterruptedException {
    ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    executor.awaitTermination(10, SECONDS);
    Order order = client.findOrder();
    order.setReady(true);
    repository.save(order);
    return order;
  }
}