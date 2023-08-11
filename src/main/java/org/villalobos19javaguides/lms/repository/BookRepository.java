package org.villalobos19javaguides.lms.repository;

import org.villalobos19javaguides.lms.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
