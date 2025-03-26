package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;  // 추가된 import

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";  // index.jsp 파일을 반환 dddd
    }
}
