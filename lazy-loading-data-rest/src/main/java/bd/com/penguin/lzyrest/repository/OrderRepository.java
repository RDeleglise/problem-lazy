package bd.com.penguin.lzyrest.repository;

import bd.com.penguin.lzyrest.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author bashir
 * @since 7/17/19
 */
public interface OrderRepository extends JpaRepository<Order, String> {

}