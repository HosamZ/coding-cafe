package at.nacs.thecashier.logic;

import at.nacs.thecashier.persistence.Purchase;
import at.nacs.thecashier.repositories.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PurchaseManager {

  private final PurchaseRepository purchaseRepository;

  public Purchase save(Purchase purchase) {
    String uuid = UUID.randomUUID()
                      .toString();
    purchase.setUuid(uuid);
    purchase.getOrderList().stream()
            .forEach(order -> order.setUuid(uuid));
    purchaseRepository.save(purchase);
    return purchase;
  }

  public List<Purchase> findAll() {
    return purchaseRepository.findAll();
  }
}
