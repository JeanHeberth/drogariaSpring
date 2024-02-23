package br.com.drogaria.drogariaspring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Produto {

    @Id
    private Long codigo;
    private String nome;
    private Byte quantidade;
    private BigDecimal preco;
    private LocalDateTime dataDeValidade;




}
