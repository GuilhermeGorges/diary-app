package com.guilherme.diary.mapper;

import com.guilherme.diary.dto.request.NoteDTO;
import com.guilherme.diary.entity.NoteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NoteMapper {

    NoteMapper INSTANCE = Mappers.getMapper(NoteMapper.class);

    NoteEntity toModel(NoteDTO noteDTO);

    NoteDTO toDTO(NoteEntity noteEntity);

}
