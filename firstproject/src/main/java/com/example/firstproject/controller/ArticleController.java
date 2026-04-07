package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; // GET 요청 처리
import org.springframework.web.bind.annotation.PostMapping; // POST 요청 처리

@Controller //컨트롤러로 관리
public class ArticleController {
    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString()); //다시 작성 페이지로 이동
        return "/articles/new"; // 다시 작성 페이지로 이동
    }

}
