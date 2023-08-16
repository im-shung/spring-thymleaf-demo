package com.example.demo;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class HelloController {

    private final BrowserService browserService;
    private final BrowserRepository browserRepository;

    @GetMapping("/search-browser")
    public String Search_browser(Model model) {
        Browser browser = browserService.Search_browser("chrome");
        model.addAttribute("browser", browser);
        System.out.println("browser = " + browser);
        return "test";
    }

    @GetMapping("view/dashboard-analytics")
    public String hello(Model model) {
        List<Browser> browsers = (List<Browser>) browserRepository.findAll();
        model.addAttribute("browsers", browsers);
        return "view/dashboard-analytics";
    }
}
