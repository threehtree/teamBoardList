package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    private Integer adNo;
    private String adID;
    private String adName;
    private String adPhone;
    private String adEmail;
    private String adProfile;
    private String adBirth;
    private String adAddress;
    private Integer authority;

    private LocalDate regDate;
    private LocalDate updateDate;
    private int delFlag;
}
