package sk.upjs.library_demo.service;

import org.springframework.stereotype.Service;
import sk.upjs.library_demo.entity.LibraryEntity;
import sk.upjs.library_demo.repository.LibraryRepository;

import java.util.List;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    private List<LibraryEntity> findAll() {
        return libraryRepository.findAll();
    }
}
