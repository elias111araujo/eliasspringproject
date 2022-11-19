package springproject.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    @NotEmpty(message = "{campo.nome.obrigatorio}")
    private String nome;

    @Column(nullable = false, length = 11)
    @NotNull(message = "{campo.cpf.obrigatorio}")
    @CPF(message = "{campo.cpf.invalido}")
    private String cpf;

    @Column(name = "data_cadastro", updatable = false)
    @JsonFormat(pattern = ("dd/MM/yyyy"))
    private LocalDate dataCadastro;

    @PrePersist
    public void prepersist(){
        setDataCadastro(LocalDate.now());
    }

    @JsonIgnore
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "cliente")
    List<ServicoPrestado> servicos;

}

