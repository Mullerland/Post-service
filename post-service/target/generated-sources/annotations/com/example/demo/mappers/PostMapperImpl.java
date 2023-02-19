package com.example.demo.mappers;

import com.example.demo.model.Post;
import dto.postDto.PostDTO;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-06T19:49:31+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public PostDTO toDTO(Post post) {
        if ( post == null ) {
            return null;
        }

        PostDTO.PostDTOBuilder postDTO = PostDTO.builder();

        postDTO.id( post.getId() );
        if ( post.getTime() != null ) {
            postDTO.time( Date.from( post.getTime().toInstant( ZoneOffset.UTC ) ) );
        }
        postDTO.authorId( post.getAuthorId() );
        postDTO.title( post.getTitle() );
        postDTO.postText( post.getPostText() );
        postDTO.isBlocked( post.getIsBlocked() );

        return postDTO.build();
    }

    @Override
    public Post toPost(PostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        Post.PostBuilder post = Post.builder();

        post.id( postDTO.getId() );
        if ( postDTO.getTime() != null ) {
            post.time( LocalDateTime.ofInstant( postDTO.getTime().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        post.authorId( postDTO.getAuthorId() );
        post.title( postDTO.getTitle() );
        post.postText( postDTO.getPostText() );
        post.isBlocked( postDTO.getIsBlocked() );

        return post.build();
    }
}
