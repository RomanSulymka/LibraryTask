package com.task.romansulymka.onlinelibrary.service.mapper;

import com.task.romansulymka.onlinelibrary.dao.entity.Book;
import com.task.romansulymka.onlinelibrary.dto.BookDto;
import lombok.RequiredArgsConstructor;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookMapper extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(BookDto.class, Book.class)
                .byDefault()
                .register();
    }
}
