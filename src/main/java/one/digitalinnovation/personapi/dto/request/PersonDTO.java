package one.digitalinnovation.personapi.dto.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private long id;

    @NotNull
    private String firstName;

    private String lastName;

    private String cpf;

    private String birthDate;

    private List<PhoneDTO> phones;
}
