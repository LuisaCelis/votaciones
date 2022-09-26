package co.edu.eam.domain;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name="Usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min=1, max=40)
    private String nombre;

    @NotEmpty
    @Size(min=1, max=40)
    private String apellido;

    @Email(regexp = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$")
    @NotEmpty
    private String email;

    @NotEmpty
    private String password;

    @OneToMany
    @JoinColumn(name = "usuario_id")
    private List<Rol> roles;
}
