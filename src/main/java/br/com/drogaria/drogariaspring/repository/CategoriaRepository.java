package br.com.drogaria.drogariaspring.repository;

import br.com.drogaria.drogariaspring.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Byte> {
}
