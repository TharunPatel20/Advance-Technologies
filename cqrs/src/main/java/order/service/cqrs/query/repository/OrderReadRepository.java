package order.service.cqrs.query.repository;

import order.service.cqrs.query.entity.OrderReadModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderReadRepository extends JpaRepository<OrderReadModel, Long> {
}
