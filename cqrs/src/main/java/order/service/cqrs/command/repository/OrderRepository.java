package order.service.cqrs.command.repository;

import order.service.cqrs.command.entity.CommandOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CommandOrder, Long> {
}