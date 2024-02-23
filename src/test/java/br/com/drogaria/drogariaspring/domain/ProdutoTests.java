package br.com.drogaria.drogariaspring.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest
class ProdutoTests {

    @Test
    void criarProduto() {
        Produto p = new Produto(
                Short.valueOf("1"),
                "Coca-cola",
                Byte.valueOf("15"),
                BigDecimal.valueOf(10.50),
                LocalDate.of(2024, 11, 23)
        );
        System.out.println(p);

    }
}

