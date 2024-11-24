package com.jb.flyway_demo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_tbl")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
}
