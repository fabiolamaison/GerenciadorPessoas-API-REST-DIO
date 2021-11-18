package one.digitalinnovation.personapi.dto.request;

import com.sun.istack.NotNull;
import lombok.*;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotNull
    @Size(min = 13, max = 14)
    private String number;
}
