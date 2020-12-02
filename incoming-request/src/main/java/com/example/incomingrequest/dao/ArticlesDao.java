package com.example.incomingrequest.dao;

import com.example.incomingrequest.ds.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticlesDao extends CrudRepository<Article, Integer> {

    List<Article> findByBodyLikeIgnoreCase(String content);
}
