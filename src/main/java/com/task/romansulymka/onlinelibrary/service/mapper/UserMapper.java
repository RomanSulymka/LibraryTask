package com.task.romansulymka.onlinelibrary.service.mapper;


import com.task.romansulymka.onlinelibrary.dao.entity.User;
import com.task.romansulymka.onlinelibrary.dto.UserDto;
import lombok.RequiredArgsConstructor;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(UserDto.class, User.class)
                .byDefault()
                .register();
    }
}
