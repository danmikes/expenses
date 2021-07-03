package io.mikes.expensetracker.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tbl_expenses")
@Setter
@Getter
public class Expense {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;

  private String expense;

  private String description;

  private BigDecimal amount;
}
