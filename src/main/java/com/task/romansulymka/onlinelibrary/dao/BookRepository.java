package com.task.romansulymka.onlinelibrary.dao;


import com.task.romansulymka.onlinelibrary.dao.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository  extends CrudRepository<Book, Long>  {

    List<Book> findAll();

    List<Book> findBooksByAuthorIsLike(String author);

    List<Book> findBooksByTitleIsContaining(String title);

    List<Book> findBooksByPublisherIsLike(String publisher);

    Optional<Book> findBookByIdAndQuantityIsGreaterThan(long bookId, int quantity);


}
