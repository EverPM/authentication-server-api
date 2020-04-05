package com.everpm.authentication.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

@Data
public class User implements Serializable {

    @Id
    private Long id;
    private String username;
    private String password;
    private List<Role> roles;
}
