package com.example.dao;

import com.example.ds.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDao extends CrudRepository<Article, Integer> {
}
