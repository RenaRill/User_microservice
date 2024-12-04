package com.apartmentreservation.User_microservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Getter
@Setter
@Document(value = "user")
@NoArgsConstructor
@AllArgsConstructor
public class AuthUser {
    @Id
    private String id;
    private String username;
    private String password;
    private boolean active = false;
}