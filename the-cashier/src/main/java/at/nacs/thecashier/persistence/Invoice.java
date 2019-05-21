package at.nacs.thecashier.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {

  @Id
  @GeneratedValue
  private Long id;

  @Column(unique = true)
  private String uuid;

  @OneToOne
  private Purchase purchase;
}