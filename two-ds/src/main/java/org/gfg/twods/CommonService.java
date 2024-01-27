package org.gfg.twods;

import org.gfg.twods.authorDB.Author;
import org.gfg.twods.authorDB.AuthorRepository;
import org.gfg.twods.personDB.Person;
import org.gfg.twods.personDB.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private PersonRepository personRepository;


    public void addAuthor(Author author) {
        authorRepository.save(author);
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }
}
