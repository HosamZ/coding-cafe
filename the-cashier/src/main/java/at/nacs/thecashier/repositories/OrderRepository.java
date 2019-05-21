package at.nacs.thecashier.repositories;

import at.nacs.thecashier.persistence.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
  List<Order> findAllByBeverage(String beverage);
  List<Order> findAllByFoodstuff(String foodstuff);

}
