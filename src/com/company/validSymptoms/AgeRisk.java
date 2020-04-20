package com.company.validSymptoms;


public class AgeRisk {

    public double risk(int age){

        double riskPacient;

        if (age <= 19){
            riskPacient = 0.2;
        }
        else if (age >= 20 && age <= 59){
            riskPacient = 0.85;
        }
        else if (age >= 60 && age <=79){
            riskPacient = 5.8;
        } else {
            riskPacient = 14.8;
        }
        return riskPacient;
    }
}
