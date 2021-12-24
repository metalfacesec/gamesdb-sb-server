package com.gamesdb.gamesdbsbserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.gamesdb.gamesdbsbserver.PlatformRepository;

@Controller
@RequestMapping(path="/platform")
public class PlatformController {
    @Autowired
    private PlatformRepository platformRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Platform> getAllPlatforms() {
        return platformRepository.findAll();
    }
    
}
