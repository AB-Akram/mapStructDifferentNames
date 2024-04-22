package org.example.mapstructbasic.mapper;

import org.example.mapstructbasic.dto.ContactDTO;
import org.example.mapstructbasic.entity.Contact;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring") //it tells MapStruct to generate Spring Framework-compatible code for the mapper interface. This means that the generated mapper implementation will be managed as a Spring bean
public interface ContactMapper {
    Contact toEntity(ContactDTO contactDTO); // Contact is the target and Contact DTO is the source
    ContactDTO toDTO(Contact contact);
    List<ContactDTO> toDTO(List<Contact> contacts);
}
