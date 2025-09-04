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
    private long customer_id;
    private String product_name;
    private long amount;


}
