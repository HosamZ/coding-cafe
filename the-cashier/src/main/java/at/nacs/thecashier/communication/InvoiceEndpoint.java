package at.nacs.thecashier.communication;

import at.nacs.thecashier.logic.InvoiceManager;
import at.nacs.thecashier.persistence.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
@RequiredArgsConstructor
public class InvoiceEndpoint {

  private final InvoiceManager invoiceManager;

  @GetMapping
  List<Invoice> get() {
    return invoiceManager.findAll();
  }

  @PostMapping("purchase/id/{id}")
  Invoice send(@PathVariable Long id) {
    return invoiceManager.createTicket(id);
  }
}
