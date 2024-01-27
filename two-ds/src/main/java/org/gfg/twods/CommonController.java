package org.gfg.twods;

import org.gfg.twods.authorDB.Author;
import org.gfg.twods.personDB.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @Autowired
    private CommonService commonService;

    @PostMapping("/createAuthor")
    public void addAuthor(@RequestBody Author author){
        commonService.addAuthor(author);

    }

    @PostMapping("/createPerson")
    public void addPerson(@RequestBody Person person){
        commonService.addPerson(person);
    }
}
