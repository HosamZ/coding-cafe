package at.nacs.thecashier.repositories;

import at.nacs.thecashier.persistence.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
