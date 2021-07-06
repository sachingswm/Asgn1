package com.example.registerapi.entities;

import com.example.registerapi.dto.RegisterDto;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String email;

    private String password;

    //Unidirectional Many To One Mapping
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="current_class_id",referencedColumnName = "current_class_id")
    private CurrentClass currentClass;

    //Constructor To Create User From RegisterDto
    public User(RegisterDto registerDto) {
        this.name = registerDto.getName();
        this.email = registerDto.getEmail();
        this.password = registerDto.getPassword();
        this.currentClass=new CurrentClass(registerDto.getCurrentClassDto());
    }
}

