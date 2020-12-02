package com.example.incomingrequest.controller;

import com.example.incomingrequest.dao.ArticlesDao;
import com.example.incomingrequest.ds.Article;
import com.example.incomingrequest.ds.ArticleCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/articles", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiController {

    @Autowired
    private ArticlesDao articlesDao;

    @GetMapping // curl localhost:8080/api/articles
    public ResponseEntity<Iterable<Article>> listArticles(){
        return ResponseEntity.ok().body(articlesDao.findAll());
    }

    @RequestMapping(method = RequestMethod.HEAD) // curl -I localhost:8080/api/articles
    public ResponseEntity<Iterable<Article>> getArticlesCount(){
        return ResponseEntity.ok().header("Articles-Count", String.valueOf(articlesDao.count()))
                .body(articlesDao.findAll());
    }

    @GetMapping("{id}") // curl -I localhost:8080/api/articles/2
    public ResponseEntity<Article> getArticlesById(@PathVariable int id){
        return articlesDao.findById(id)
                .map(ResponseEntity.ok()::body)
                .orElse(ResponseEntity.notFound().build());
    }

    // curl -X POST localhost:8080/api/articles/search -H 'Content-Type: application/json' -d '{"bodyLike":"some%"}'
    @PostMapping(value = "search", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Article>> searchByCriteria(@RequestBody ArticleCriteria articleCriteria){
        return ResponseEntity.ok()
                .body(articlesDao.findByBodyLikeIgnoreCase(articleCriteria.getBodyLike()));
    }

    // curl -v -X PUT localhost:8080/api/articles -H 'Content-Type: application/json' -d '{"title":"New Article", "body":"New Body"}'
    @PutMapping
    public ResponseEntity addArticle(@RequestBody Article article){
        articlesDao.save(article);
        return ResponseEntity.ok().build();
    }

    // curl -v -X PATCH localhost:8080/api/articles/1 -H 'Content-Type: application/json' -d '{"title": "Updated Article", "body": "Updated article content"}'
    @PatchMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateArticle(@PathVariable int id, @RequestBody Article article){
        if (articlesDao.existsById(id)){
            article.setId(id);
            articlesDao.save(article);
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    // curl -v -X DELETE localhost:8080/api/articles/3
    @DeleteMapping("{id}")
    public ResponseEntity deleteArticleById(@PathVariable int id){
        if (articlesDao.existsById(id)){
            articlesDao.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
