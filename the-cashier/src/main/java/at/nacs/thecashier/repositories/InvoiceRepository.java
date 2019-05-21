package at.nacs.thecashier.repositories;

import at.nacs.thecashier.persistence.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
