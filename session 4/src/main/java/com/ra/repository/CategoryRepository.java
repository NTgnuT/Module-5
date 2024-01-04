<<<<<<< HEAD
package com.ra.repository;

import com.ra.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Page<Category> findAllByCategoryNameContainingIgnoreCase(Pageable pageable ,String name);
}
=======
package com.ra.repository;

import com.ra.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
>>>>>>> 1c065e15f1a3b41e68f9fa4d7be2ce15a25a2b7e
