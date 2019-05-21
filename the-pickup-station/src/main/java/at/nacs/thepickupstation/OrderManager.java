package at.nacs.thepickupstation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderManager {

  private final OrderRepository orderRepository;

  public void save(Order order) {
    orderRepository.save(order);
  }

  public List<Order> findAll() {
    return orderRepository.findAll();
  }
}