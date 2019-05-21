package at.nacs.thecashier.repositories;

import at.nacs.thecashier.persistence.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
