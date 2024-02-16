package sk.upjs.library_demo.service;

import org.springframework.stereotype.Service;
import sk.upjs.library_demo.entity.AuthorEntity;
import sk.upjs.library_demo.repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<AuthorEntity> findAll() {
        return authorRepository.findAll();
    }
}
