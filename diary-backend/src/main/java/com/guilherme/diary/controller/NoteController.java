package com.guilherme.diary.controller;

import com.guilherme.diary.dto.request.NoteDTO;
import com.guilherme.diary.dto.response.MessageResponseDTO;
import com.guilherme.diary.service.NoteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notes")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class NoteController {

    private NoteService noteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createNote(NoteDTO noteDTO){
        return noteService.createNote(noteDTO);

    }

}
