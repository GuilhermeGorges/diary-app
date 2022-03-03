package com.guilherme.diary.service;

import com.guilherme.diary.dto.request.NoteDTO;
import com.guilherme.diary.dto.response.MessageResponseDTO;
import com.guilherme.diary.entity.NoteEntity;
import com.guilherme.diary.mapper.NoteMapper;
import com.guilherme.diary.repository.NoteRepository;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    private NoteRepository noteRepository;

    private final NoteMapper noteMapper = NoteMapper.INSTANCE;

    public MessageResponseDTO createNote(NoteDTO noteDTO) {
        NoteEntity noteToSave = noteMapper.toModel(noteDTO);

        NoteEntity savedNote = noteRepository.save(noteToSave);

        return createMessageResponse(savedNote.getId(), "Created note with ID ");
    }

    private MessageResponseDTO createMessageResponse(Long id, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }
}
