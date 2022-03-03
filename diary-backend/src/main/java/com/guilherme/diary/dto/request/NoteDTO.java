package com.guilherme.diary.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NoteDTO {

    private long id;
    private Date postDate;
    private String title;
    private String message;
}
