package com.study.bookstore.infrastructure.category.repository;

import com.study.bookstore.infrastructure.book.entity.BookJpaEntity;
import com.study.bookstore.infrastructure.category.entity.CategoryJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryJpaRepository extends JpaRepository<CategoryJpaEntity, Long> {

    Optional<CategoryJpaEntity> findByName(String name);
    Optional<BookJpaEntity> findByIsbn(String isbn);

    boolean existsByName(String name);

    long countByQuantity(int quantity);

    List<CategoryJpaEntity> findByNameContainsIgnoreCase(String name);

    // contains와 Containing 차이?

}
