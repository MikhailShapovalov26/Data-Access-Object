package ru.netology.dataaccessobject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "ORDERS")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @Column(name="customer_id")
    private long customerId;
    @Column(name= "product_name")
    private String productName;
    private long amount;


}
