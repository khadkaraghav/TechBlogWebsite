package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/indexhome")
    public String indexhome() {
        return "indexhome";
    }

    @RequestMapping("/java")
    public String java() {
        return "java";
    }

    @RequestMapping("/javafeature")
    public String javafeature() {
        return "javafeature";
    }

    @RequestMapping("/javadata")
    public String javadata() {
        return "javadata";
    }

    @RequestMapping("/git")
    public String git() {
        return "git";
    }

    @RequestMapping("/gitdef")
    public String gitdef() {
        return "gitdef";
    }

    @RequestMapping("/gitfeature")
    public String gitfeature() {
        return "gitfeature";
    }

    @RequestMapping("/programdesign")
    public String programdesign() {
        return "programdesign";
    }

    @RequestMapping("/programdessteps")
    public String programdessteps() {
        return "programdessteps";
    }

    @RequestMapping("/algorithm")
    public String algorithm() {
        return "algorithm";
    }

    @RequestMapping("/oopsjava")
    public String oopsjava() {
        return "oopsjava";
    }

    @RequestMapping("/constructor")
    public String constructor() {
        return "constructor";
    }

    @RequestMapping("/classjava")
    public String classjava() {
        return "classjava";
    }

    @RequestMapping("/htmlcssboot")
    public String htmlcssboot() {
        return "htmlcssboot";
    }

    @RequestMapping("/html")
    public String html() {
        return "html";
    }

    @RequestMapping("/css")
    public String css() {
        return "css";
    }

    @RequestMapping("/bootstrap")
    public String bootstrap() {
        return "bootstrap";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/author")
    public String author() {
        return "author";
    }
}
