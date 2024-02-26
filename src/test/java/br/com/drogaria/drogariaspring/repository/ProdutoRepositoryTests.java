package br.com.drogaria.drogariaspring.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProdutoRepositoryTests {

    @Autowired
    private ProdutoRepository produtoRepository;

//    @Test
//    void inserirProduto() {
//        Produto p1 = new Produto(
//                null,
//                "Coca-cola",
//                Byte.valueOf("15"),
//                BigDecimal.valueOf(10.50),
//                LocalDate.of(2024, 11, 23),
//                null
//        );
//
//        Produto p2 = new Produto(
//                null,
//                "Heineken",
//                Byte.valueOf("08"),
//                BigDecimal.valueOf(6.50),
//                LocalDate.of(2024, 03, 27),
//                null
//        );
//        produtoRepository.save(p1);
//        produtoRepository.save(p2);
//
//
//    }

}
