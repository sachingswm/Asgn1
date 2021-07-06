package com.example.registerapi.Dao;

import com.example.registerapi.dto.LoginDto;
import com.example.registerapi.dto.RegisterDto;
import com.example.registerapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {

    //DTO Projection
    @Query("select new com.example.registerapi.dto.LoginDto(u.email,u.password) from User u")
    public List<LoginDto> getAllLoginDto();

    //DTO Projection
    @Query("select new com.example.registerapi.dto.RegisterDto(u.name,u.email,u.password) from User u")
    public List<RegisterDto> getAllRegisterDto();


}
