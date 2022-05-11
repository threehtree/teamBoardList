package org.zerock.teamwebboard.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ContractorDTO {
    private int ctno;
    private String ctID;
    private Integer categoryNum;
    private String ctName;
    private String businessNum;
    private String ctCall;
    private String ctEmail;
    private String ctAddress;
    private String ctFileNum;

    private LocalDate regDate;
    private LocalDate updateDate;
}
