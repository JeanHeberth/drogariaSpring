package br.com.drogaria.drogariaspring.repository;

import br.com.drogaria.drogariaspring.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Short> {
}
