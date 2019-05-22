package at.nacs.thecashier.communication;

import at.nacs.thecashier.logic.PurchaseManager;
import at.nacs.thecashier.persistence.Purchase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
@RequiredArgsConstructor
public class PurchaseEndpoint {

  private final PurchaseManager purchaseManager;

  @PostMapping
  Purchase save(@RequestBody Purchase purchase) {
    return purchaseManager.save(purchase);
  }

  @GetMapping
  List<Purchase> findAll() {
    return purchaseManager.findAll();
  }
}