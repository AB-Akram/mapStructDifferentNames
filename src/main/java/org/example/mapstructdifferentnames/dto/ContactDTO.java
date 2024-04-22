package org.example.mapstructbasic.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContactDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
}
