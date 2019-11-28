package com.sinaungoding.parking.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
public class ParkirDto {
    private String id;
    private String serial;
    private String kodeGate;
    private String noKendaraan;
    private Date tanggalTransaksi;
    private Date tanggalCreated;
    private Date tanggalExpired;
    private String summary;
    private boolean status;
}
