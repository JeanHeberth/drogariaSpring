package br.com.drogaria.drogariaspring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {

    private Long codigo;
    private String nome;
    private Byte quantidade;
    private BigDecimal preco;
    private LocalDateTime dataDeValidade;




}
