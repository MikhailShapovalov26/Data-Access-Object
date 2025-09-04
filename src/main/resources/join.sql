SELECT product_name FROM CUSTOMERS c
    JOIN ORDERS o ON c.id = o.customer_id
    WHERE c.name = ?