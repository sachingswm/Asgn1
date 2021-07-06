package com.example.registerapi.Service;

import com.example.registerapi.Dao.CurrentClassDao;
import com.example.registerapi.Dao.UserDao;
import com.example.registerapi.dto.CurrentClassDto;
import com.example.registerapi.dto.LoginDto;
import com.example.registerapi.dto.RegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FetchServiceImpl implements FetchService{

    @Autowired
    private UserDao userDao;

    @Autowired
    private CurrentClassDao currentClassDao;

    @Override
    public List<CurrentClassDto> getAllCurrentClassDto() {
        return currentClassDao.getAllCurrentClassDto();
    }

    @Override
    public List<RegisterDto> getAllRegisterDto() {
        return userDao.getAllRegisterDto();
    }

    @Override
    public List<LoginDto> getAllLoginDto() {
        return userDao.getAllLoginDto();
    }


}
