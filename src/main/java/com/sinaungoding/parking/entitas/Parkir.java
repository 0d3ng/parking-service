package com.sinaungoding.parking.entitas;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@Document(indexName = "parkir_db", type = "parkir")
public class Parkir {
    @Id
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
