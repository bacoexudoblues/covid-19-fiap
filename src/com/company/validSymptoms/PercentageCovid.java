package com.company.validSymptoms;

import com.company.model.DadosSintomas;

public class PercentageCovid {

    public int percentage(DadosSintomas sintomas){

        int percentage = 0;

        if (sintomas.getFebre()){ percentage = percentage + 25; }
        if (sintomas.getTosseSeca()){ percentage = percentage + 25;}
        if (sintomas.getCansaco()){ percentage = percentage + 25;}
        if (sintomas.getDificuldadeRespiracao()){ percentage = percentage + 25;}

        return percentage;


    }
}
