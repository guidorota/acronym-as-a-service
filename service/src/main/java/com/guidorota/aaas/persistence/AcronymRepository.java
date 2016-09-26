package com.guidorota.aaas.persistence;

import com.guidorota.aaas.entity.Acronym;

public interface AcronymRepository {

    Acronym get(long id);

    Acronym findByAcronym(String acroynym);

    long create(Acronym acronym);

}
