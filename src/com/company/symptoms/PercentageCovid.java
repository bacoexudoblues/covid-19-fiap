package com.company.symptoms;

import java.util.List;

public class PercentageCovid {

    public double percentage(List<SymptomEnum> symptoms){

        return ((double) symptoms.size() / SymptomEnum.values().length) * 100;


    }
}
