package one.digitalinnovation.personapi.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity //Transformar a classe em entidade
@Data //Getters e Setters
@Builder //Padrão de projeto
@AllArgsConstructor //Inserir os construtores
@NoArgsConstructor //Inserir os construtores
public class Phone {

    @Id //Chave primaria da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gerar ID Automatico
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;
    private String number;
}
