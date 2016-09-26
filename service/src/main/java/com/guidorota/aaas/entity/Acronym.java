package com.guidorota.aaas.entity;

public final class Acronym {

    private String acronym;
    private String description;

    public Acronym(String acronym, String description) {
        this.acronym = acronym;
        this.description = description;
    }

    public String getAcronym() {
        return acronym;
    }

    public String getDescription() {
        return description;
    }

}
