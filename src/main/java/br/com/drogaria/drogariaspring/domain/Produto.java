package br.com.drogaria.drogariaspring.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short codigo;

    @Column(length = 50, nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private Byte quantidade;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal preco;

    @Column
    private LocalDate dataDeValidade;

    @ManyToOne
    @JoinColumn(nullable = true)
    private Categoria categoria;


}
