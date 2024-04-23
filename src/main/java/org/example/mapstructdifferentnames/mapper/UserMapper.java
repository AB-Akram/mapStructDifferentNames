package org.example.mapstructdifferentnames.mapper;

import org.example.mapstructdifferentnames.dto.UserDTO;
import org.example.mapstructdifferentnames.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "emailId", target = "email") // when there are differing attributes between 'User' and 'UserDTO
    @Mapping(source = "contactNo", target = "phoneNo")
    User toEntity(UserDTO userDTO);

    @Mapping(target = "emailId", source = "email") // when there are differing attributes between 'User' and 'UserDTO
    @Mapping(target = "contactNo", source = "phoneNo")
    UserDTO toDTO(User user);
    List<UserDTO> toDTOList(List<User> userList);


}
