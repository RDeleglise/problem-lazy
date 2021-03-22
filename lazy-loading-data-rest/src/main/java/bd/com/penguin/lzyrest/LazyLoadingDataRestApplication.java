package bd.com.penguin.lzyrest;

import bd.com.penguin.lzyrest.domain.Order;
import bd.com.penguin.lzyrest.repository.OrderRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootApplication
public class LazyLoadingDataRestApplication implements CommandLineRunner{

    @Autowired
    private OrderRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(LazyLoadingDataRestApplication.class, args);
        System.out.println(org.hibernate.Version.getVersionString());
    }

    @Override
    public void run(String... strings) throws Exception {

        //Order order = repository.findById("orderId").orElse(null);
        //System.out.println(order.getOrderItems().size());
    }
}