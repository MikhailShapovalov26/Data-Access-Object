package ru.netology.dataaccessobject.model;

import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.Id;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ORDERS")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(name= "product_name")
    private String productName;
    private long amount;
}
