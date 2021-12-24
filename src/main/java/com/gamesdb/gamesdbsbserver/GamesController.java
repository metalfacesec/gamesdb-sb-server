package com.gamesdb.gamesdbsbserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/games")
public class GamesController {
    @Autowired
    private GamesRepository gamesRepository;

    @GetMapping(path="/all")
    public @ResponseBody Page<Games> getAllGames(@RequestParam(defaultValue = "0") String page, Pageable pageable) {
        return gamesRepository.findAll(PageRequest.of(Integer.parseInt(page), 20, Sort.by("id")));
    }
}