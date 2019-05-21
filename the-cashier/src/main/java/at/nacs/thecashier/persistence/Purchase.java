package at.nacs.thecashier.persistence;

import lombok.Data;
import org.hibernate.annotations.LazyCollection;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static org.hibernate.annotations.LazyCollectionOption.FALSE;

@Data
@Entity
public class Purchase {

  @Id
  @GeneratedValue
  private Long id;

  @Column(unique = true)
  private String uuid;

  private int number;

  @OneToMany(cascade = ALL)
  @LazyCollection(FALSE)
  private List<Order> orderList = new ArrayList<>();
}