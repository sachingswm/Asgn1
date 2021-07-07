package com.example.registerapi.Controller;

import com.example.registerapi.Service.FetchService;
import com.example.registerapi.constant.EndPoints;
import com.example.registerapi.dto.CurrentClassDto;
import com.example.registerapi.dto.LoginDto;
import com.example.registerapi.dto.RegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FetchController {

    @Autowired
    private FetchService fetchService;

    @GetMapping(EndPoints.GET_ALL_CURRENT_CLASS_DTO)
    public List<CurrentClassDto> getAllCurrentClassDto()
    {
        return fetchService.getAllCurrentClassDto();
    }

    @GetMapping(EndPoints.GET_ALL_REGISTER_DTO)
    public List<RegisterDto> getAllRegisterDto()
    {
        return fetchService.getAllRegisterDto();
    }

    @GetMapping(EndPoints.GET_ALL_LOGIN_DTO)
    public List<LoginDto> getAllLoginDto()
    {
        return fetchService.getAllLoginDto();
    }

}
