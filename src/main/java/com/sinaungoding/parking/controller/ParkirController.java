package com.sinaungoding.parking.controller;

import com.sinaungoding.parking.dto.ParkirDto;
import com.sinaungoding.parking.entitas.Parkir;
import com.sinaungoding.parking.service.ParkirService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class ParkirController {

    @Autowired
    private ParkirService parkirService;
    private ModelMapper modelMapper;

    @Autowired
    public ParkirController(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.modelMapper.addMappings(skipModifiedFieldsMap);
    }

    private PropertyMap<Parkir, ParkirDto> skipModifiedFieldsMap = new PropertyMap<Parkir, ParkirDto>() {
        protected void configure() {
            skip().setTanggalCreated(null);
        }
    };

    @PostMapping("/parkirs")
    @ResponseStatus(HttpStatus.CREATED)
    public ParkirDto simpan(@RequestBody ParkirDto dto) {
        Parkir parkir = modelMapper.map(dto, Parkir.class);
        parkir.setTanggalCreated(new Date());
        Parkir simpan = parkirService.simpan(parkir);
        return modelMapper.map(simpan, ParkirDto.class);
    }
}
