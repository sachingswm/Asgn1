package com.example.registerapi.Controller;

import com.example.registerapi.Service.FetchService;
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

    @GetMapping("/getAllCurrentClassDto")
    public List<CurrentClassDto> getAllCurrentClassDto()
    {
        return fetchService.getAllCurrentClassDto();
    }

    @GetMapping("/getAllRegisterDto")
    public List<RegisterDto> getAllRegisterDto()
    {
        return fetchService.getAllRegisterDto();
    }

    @GetMapping("/getAllLoginDto")
    public List<LoginDto> getAllLoginDto()
    {
        return fetchService.getAllLoginDto();
    }

}
