package com.task.romansulymka.onlinelibrary.dao;


import com.task.romansulymka.onlinelibrary.dao.entity.Authority;
import com.task.romansulymka.onlinelibrary.dao.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUsername(String username);

    List<User> findAllByAuthorityEquals(Authority authority);

    List<User> findAll();


}
