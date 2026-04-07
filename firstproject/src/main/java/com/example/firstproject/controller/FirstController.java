package com.example.firstproject.controller; // 컨트롤러다

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller//컨트롤러로 인식
public class FirstController {

    @GetMapping("/hi") // "/hi로" get들어오면 실행되는
    public String niceToMeetYou(Model model){

        model.addAttribute("username","염도윤"); // 염도윤 값을 username 연결 후 웹으로 보냄
        return "greetings"; //greetings.mustache 파일 변환
    }

    // bye도 비슷한 맥락이다~
    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname","홍길동");
        return "goodbye";
    }
}
