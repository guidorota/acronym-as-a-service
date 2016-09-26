package com.guidorota.aaas.service;

import com.guidorota.aaas.entity.Acronym;
import com.guidorota.aaas.persistence.AcronymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class AcronymService {

    private final AcronymRepository acronymRepository;

    @Autowired
    public AcronymService(AcronymRepository acronymRepository) {
        this.acronymRepository = acronymRepository;
    }

    public Acronym get(long id) {
        return acronymRepository.get(id);
    }

    public Acronym findByAcronym(String acronym) {
        return acronymRepository.findByAcronym(acronym);
    }

    public long create(Acronym acronym) {
        return acronymRepository.create(acronym);
    }

}
