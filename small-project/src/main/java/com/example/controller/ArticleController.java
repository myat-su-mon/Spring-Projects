package com.example.controller;

import com.example.dao.ArticleDao;
import com.example.ds.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.websocket.server.PathParam;

@Controller
public class ArticleController {

    private final ArticleDao articleDao;

    public ArticleController(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("articles", articleDao.findAll());
        model.addAttribute("newArticle", new Article());
        return "index";
    }

    @PostMapping("save-article")
    public String saveArticle(@ModelAttribute Article article){
        articleDao.save(article);
        return "redirect:/";
    }

    @PostMapping("delete-article")
    public String deleteArticle(@PathParam("id") int id){
        articleDao.deleteById(id);
        return "redirect:/";
    }
}
