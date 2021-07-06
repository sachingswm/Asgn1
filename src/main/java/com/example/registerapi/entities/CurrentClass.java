package com.example.registerapi.entities;

import com.example.registerapi.dto.CurrentClassDto;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="currentclass")
public class CurrentClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int current_class_id;

    private String current_class_name;

    //Constructor to create CurrentClass From CurrentClassDto
    public CurrentClass(CurrentClassDto currentClassDto) {
        this.current_class_name=currentClassDto.getCurrent_class_dto_name();
    }
}
