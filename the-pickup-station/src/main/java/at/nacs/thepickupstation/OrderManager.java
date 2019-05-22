package at.nacs.thepickupstation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderManager {

  private final OrderRepository orderRepository;
  private final AssistantClient assistantClient;
  private final BaristaClient baristaClient;

  public Map<String, List<Order>> findOrdersByUuid() {
    List<Order> orders = findAll();
    return orders.stream()
                 .collect(Collectors.groupingBy(Order::getUuid));
  }

  public Order saveBeverages() {
    Order beverage = baristaClient.findOrder();
    orderRepository.save(beverage);
    return beverage;
  }

  public Order saveFoodstuff() {
    Order foodstuff = assistantClient.findOrder();
    orderRepository.save(foodstuff);
    return foodstuff;
  }

  public List<Order> findAll() {
    saveBeverages();
    saveFoodstuff();
    return orderRepository.findAll();
  }
}
