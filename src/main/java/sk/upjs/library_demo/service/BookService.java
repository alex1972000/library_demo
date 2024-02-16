package sk.upjs.library_demo.service;

import org.springframework.stereotype.Service;
import sk.upjs.library_demo.entity.BookEntity;
import sk.upjs.library_demo.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    private List<BookEntity> findAll() {
        return bookRepository.findAll();
    }
}
