package at.nacs.thecashier.logic;

import at.nacs.thecashier.persistence.Purchase;
import at.nacs.thecashier.repositories.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseManager {

  private final PurchaseRepository purchaseRepository;


  public Purchase save(Purchase purchase) {
    return purchaseRepository.save(purchase);
  }
}
