package com.guilherme.diary.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@AllArgsConstructor
public class Note {

    @Id
    private long id;

    private Date postDate;
    private String title;
    private String message;


}
