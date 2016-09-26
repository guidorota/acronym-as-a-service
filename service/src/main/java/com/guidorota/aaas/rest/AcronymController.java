package com.guidorota.aaas.rest;

import com.guidorota.aaas.entity.Acronym;
import com.guidorota.aaas.persistence.AcronymRepository;
import com.guidorota.aaas.rest.entity.AcronymRequest;
import com.guidorota.aaas.service.AcronymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(path = "/rest/acronym")
public final class AcronymController {

    private final AcronymService acronymService;

    @Autowired
    public AcronymController(AcronymService acronymService) {
        this.acronymService = acronymService;
    }

    @RequestMapping(path = "/{id}", method = GET)
    @ResponseStatus(HttpStatus.OK)
    public Acronym get(@PathVariable(name = "id", required = true) Long id) {
        return acronymService.get(id);
    }

    @RequestMapping(path = "/", method = POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody AcronymRequest acronym) {
        System.out.println(acronym.acronym);

        return 0L;
    }

}
