package com.example.demo.mappers;

import com.example.demo.model.Tag;
import dto.postDto.TagDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-06T19:49:31+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class TagMapperImpl implements TagMapper {

    @Override
    public TagDTO toDTO(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagDTO.TagDTOBuilder tagDTO = TagDTO.builder();

        tagDTO.id( tag.getId() );
        tagDTO.tag( tag.getTag() );

        return tagDTO.build();
    }

    @Override
    public Tag toTag(TagDTO tagDTO) {
        if ( tagDTO == null ) {
            return null;
        }

        Tag.TagBuilder tag = Tag.builder();

        tag.id( tagDTO.getId() );
        tag.tag( tagDTO.getTag() );

        return tag.build();
    }
}
