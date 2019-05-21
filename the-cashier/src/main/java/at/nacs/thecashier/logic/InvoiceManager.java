package at.nacs.thecashier.logic;

import at.nacs.thecashier.persistence.Purchase;
import at.nacs.thecashier.persistence.Invoice;
import at.nacs.thecashier.repositories.PurchaseRepository;
import at.nacs.thecashier.repositories.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceManager {

  private final InvoiceRepository invoiceRepository;
  private final PurchaseRepository purchaseRepository;

  public List<Invoice> findAll() {
    return invoiceRepository.findAll();
  }

  public Invoice createTicket(Long id) {
    Purchase purchase = purchaseRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    Invoice invoice = Invoice.builder()
                             .purchase(purchase)
                             .build();
    invoiceRepository.save(invoice);
    return invoice;
  }
}
