package com.company;

import com.company.model.DadosContato;
import com.company.model.DadosEndereco;
import com.company.model.DadosPaciente;
import com.company.model.DadosSintomas;
import com.company.validSymptoms.PercentageCovid;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DadosPaciente paciente = new DadosPaciente();
        DadosContato contato = new DadosContato();
        DadosEndereco endereco = new DadosEndereco();
        DadosSintomas sintomas = new DadosSintomas();

        paciente.setContato(contato);
        paciente.setEndereco(endereco);
        paciente.setSintomas(sintomas);

        paciente.setNome("Gabriel nogueira");
        paciente.setCpf("0000000000");
        paciente.setIdade(24);
        paciente.setDataEntrada("15.04.2020");
        contato.setNumeroTelefone("40028922");
        contato.setEmail("gabriel@hotmail.com");
        endereco.setCep("04823260");
        endereco.setNumeroResidencia(33);
        sintomas.setCansaco(false);
        sintomas.setDificuldadeRespiracao(false);
        sintomas.setFebre(false);
        sintomas.setTosseSeca(false);

        PercentageCovid percentageCovid = new PercentageCovid();

        percentageCovid.percentage(sintomas);

        System.out.println(percentageCovid.percentage(sintomas) + " " + "%");


    }
}
