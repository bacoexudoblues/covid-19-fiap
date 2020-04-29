package com.company.symptoms;

public enum SymptomEnum {

    DRY_COUGH("Tosse seca"),
    FEVER("Febre"),
    TIREDNESS("Cansaço"),
    BREATHING_DIFFICULTY("Dificuldade respiratória");


    private String symptom;

    SymptomEnum(String symptom) {
        this.symptom = symptom;
    }

    public String getSymptom() {
        return symptom;
    }

}
