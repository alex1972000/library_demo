package sk.upjs.library_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.upjs.library_demo.entity.LibraryEntity;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryEntity, Long> {
}
