package br.com.ac1.ac1;

import br.com.ac1.ac1.entities.Categoria;
import br.com.ac1.ac1.entities.Produto;
import br.com.ac1.ac1.repositories.CategoriaRepository;
import br.com.ac1.ac1.repositories.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Ac1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ac1Application.class, args);
	}

}
