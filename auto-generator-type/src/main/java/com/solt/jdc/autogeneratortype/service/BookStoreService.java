package com.solt.jdc.autogeneratortype.service;

import com.solt.jdc.autogeneratortype.entity.AuthorBad;
import com.solt.jdc.autogeneratortype.entity.AuthorGood;
import com.solt.jdc.autogeneratortype.repository.AuthorBadRepository;
import com.solt.jdc.autogeneratortype.repository.AuthorGoodRepository;
import org.springframework.stereotype.Service;

@Service
public class BookStoreService {

    private final AuthorGoodRepository authorGoodRepository;
    private final AuthorBadRepository authorBadRepository;

    public BookStoreService(AuthorGoodRepository authorGoodRepository, AuthorBadRepository authorBadRepository) {
        this.authorGoodRepository = authorGoodRepository;
        this.authorBadRepository = authorBadRepository;
    }

    public void persistGoodAuthor(){
        AuthorGood good = new AuthorGood();
        good.setName("Thaw Thaw");
        good.setAge(22);
        good.setGenre("History");
        authorGoodRepository.save(good);
    }

    public void persistBadAuthor(){
        AuthorBad bad = new AuthorBad();
        bad.setName("Alice");
        bad.setAge(40);
        bad.setGenre("Horror");
        authorBadRepository.save(bad);
    }
}
