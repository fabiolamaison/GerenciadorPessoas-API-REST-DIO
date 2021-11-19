package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data
// AUTOMATIZA GETTERS E SETTERS
@Builder
@AllArgsConstructor
@NoArgsConstructor
// INSEREM CONSTRUTORES
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    // ESTA ANOTAÇÃO DEFINE QUE O PHONETYPE NÃO PODE SER NULL
    private PhoneType type;

    @Column(nullable = false)
    private String number;

}
