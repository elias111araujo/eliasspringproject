package springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springproject.model.entity.Cliente;
import springproject.model.repository.ClienteRepository;

@SpringBootApplication

public class ClientesApplication {


    public static void main(String[] args) {

        SpringApplication.run(ClientesApplication.class, args);

    }

}
