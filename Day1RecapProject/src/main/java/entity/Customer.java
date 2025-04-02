package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity(name="customer")
public class Customer {
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy= GenerationType.UUID)
    private String customerId;

    @Column(name="c_name")
    private String name;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String mobile;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Cart> cartItems;
}
