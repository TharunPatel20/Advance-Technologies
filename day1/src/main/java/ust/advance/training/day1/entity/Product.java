package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name="product")
//@NamedQueries({
//        @NamedQuery(query = "", name = "Product.findByStockGreaterThan")
//})
public class Product {
    @Id
    @Column(name = "p_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ProductId;

    @Column(name="p_name")
    private String name;

    private double price;
    private int stock;
    private String description;
}
