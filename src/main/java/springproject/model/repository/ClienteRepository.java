package springproject.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springproject.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {



}
