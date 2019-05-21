package at.nacs.thecashier.communication;

import at.nacs.thecashier.logic.PurchaseManager;
import at.nacs.thecashier.persistence.Purchase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class PurchaseEndpoint {

  private final PurchaseManager purchaseManager;

  @PostMapping
  Purchase save(@RequestBody Purchase purchase) {
    return purchaseManager.save(purchase);
  }
}