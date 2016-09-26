package com.guidorota.aaas.persistence;

import com.guidorota.aaas.entity.Acronym;

public final class MongoAcronymRepository implements AcronymRepository {

    @Override
    public Acronym get(long id) {
        return null;
    }

    @Override
    public Acronym findByAcronym(String acroynym) {
        return null;
    }

    @Override
    public long create(Acronym acronym) {
        return 0;
    }

}
