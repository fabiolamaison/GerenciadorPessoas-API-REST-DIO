package one.digitalinnovation.personapi.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.entity.Person.PersonBuilder;
import one.digitalinnovation.personapi.entity.Phone;
import one.digitalinnovation.personapi.entity.Phone.PhoneBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-18T19:51:15-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toModel(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        PersonBuilder person = Person.builder();

        if ( personDTO.getBirthDate() != null ) {
            person.birthDate( LocalDate.parse( personDTO.getBirthDate(), DateTimeFormatter.ofPattern( "dd-MM-yyyy" ) ) );
        }
        person.id( personDTO.getId() );
        person.firstName( personDTO.getFirstName() );
        person.lastName( personDTO.getLastName() );
        person.cpf( personDTO.getCpf() );
        person.phones( phoneDTOListToPhoneList( personDTO.getPhones() ) );

        return person.build();
    }

    @Override
    public Person toDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonBuilder person1 = Person.builder();

        person1.id( person.getId() );
        person1.firstName( person.getFirstName() );
        person1.lastName( person.getLastName() );
        person1.cpf( person.getCpf() );
        person1.birthDate( person.getBirthDate() );
        List<Phone> list = person.getPhones();
        if ( list != null ) {
            person1.phones( new ArrayList<Phone>( list ) );
        }

        return person1.build();
    }

    protected Phone phoneDTOToPhone(PhoneDTO phoneDTO) {
        if ( phoneDTO == null ) {
            return null;
        }

        PhoneBuilder phone = Phone.builder();

        phone.id( (int) phoneDTO.getId() );
        phone.type( phoneDTO.getType() );
        phone.number( phoneDTO.getNumber() );

        return phone.build();
    }

    protected List<Phone> phoneDTOListToPhoneList(List<PhoneDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Phone> list1 = new ArrayList<Phone>( list.size() );
        for ( PhoneDTO phoneDTO : list ) {
            list1.add( phoneDTOToPhone( phoneDTO ) );
        }

        return list1;
    }
}
