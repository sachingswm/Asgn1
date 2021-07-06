package com.example.registerapi.Dao;

import com.example.registerapi.dto.CurrentClassDto;
import com.example.registerapi.entities.CurrentClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CurrentClassDao extends JpaRepository<CurrentClass, Integer> {

    //DTO Projection
    @Query("select new com.example.registerapi.dto.CurrentClassDto(c.current_class_name) from CurrentClass c")
    public List<CurrentClassDto> getAllCurrentClassDto();

}
