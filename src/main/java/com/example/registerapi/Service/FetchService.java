package com.example.registerapi.Service;

import com.example.registerapi.Dao.UserDao;
import com.example.registerapi.dto.CurrentClassDto;
import com.example.registerapi.dto.LoginDto;
import com.example.registerapi.dto.RegisterDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface FetchService {
    public List<CurrentClassDto> getAllCurrentClassDto();
    public List<RegisterDto> getAllRegisterDto();
    public List<LoginDto> getAllLoginDto();
}
