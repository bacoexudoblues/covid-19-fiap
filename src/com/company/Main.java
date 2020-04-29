package com.company;

import com.company.model.Address;
import com.company.model.Contact;
import com.company.model.Patient;
import com.company.symptoms.AgeRisk;
import com.company.symptoms.PercentageCovid;
import com.company.symptoms.SymptomEnum;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        /**
         * Inicialização do banner
         *
         */
        File banner = new File("src/resources/banner.txt");
        Scanner bannerInput = new Scanner(banner);

        while (bannerInput.hasNextLine())
        {
            System.out.println(bannerInput.nextLine());
        }
        bannerInput.close();

        PercentageCovid percentageCovid = new PercentageCovid();
        Scanner patientInput = new Scanner(System.in);
        List<SymptomEnum> symptoms = new ArrayList<>();
        AgeRisk ageRisk = new AgeRisk();
        Patient patient = new Patient();
        Contact contact = new Contact();
        Address address = new Address();
        patient.setContact(contact);
        patient.setAddress(address);

        /**
         * Entrada de dados do paciente
         */

        System.out.println("Ficha cadastral para efetuar o Teste");
        System.out.println("Preencha com suas informações como solicitado");

        System.out.println("Nome:");
        patient.setName(patientInput.nextLine());

        System.out.println("Idade:");
        patient.setAge(patientInput.nextInt());
        patientInput.nextLine();

        System.out.println("CPF:");
        patient.setCpf(patientInput.nextLine());

        System.out.println("Logradouro:");
        patient.getAddress().setCep(patientInput.nextLine());

        System.out.println("Numero da residencia:");
        patient.getAddress().setHomeNumber(patientInput.nextInt());
        patientInput.nextLine();

        System.out.println("Telefone para contato:");
        patient.getContact().setPhone(patientInput.nextLine());

        System.out.println("Email para o contato:");
        patient.getContact().setEmail(patientInput.nextLine());

        System.out.println("Data atual:");
        patient.setDateInput(patientInput.nextLine());

        /**
         * Entrada de dados e validação de teste do coronga
         *
         *
         */
        System.out.println("Responda as próximas perguntas com sim ou não");

        System.out.println("Você se sente cansado ?");
        String isTiredness = patientInput.nextLine();
        if (isTiredness.equals("sim")){
            symptoms.add(SymptomEnum.TIREDNESS);
        }

        System.out.println("Você esta se sentindo febril ?");
        String isFever = patientInput.nextLine();
        if (isFever.equals("sim")){
            symptoms.add(SymptomEnum.FEVER);
        }

        System.out.println("Você esta apresentando tosse seca ?");
        String isDryCough = patientInput.nextLine();
        if (isDryCough.equals("sim")){
            symptoms.add(SymptomEnum.DRY_COUGH);
        }

        System.out.println("Você esta com dificuldade respiratória ?");
        String isBreathinDifficulty = patientInput.nextLine();
        if (isBreathinDifficulty.equals("sim")){
            symptoms.add(SymptomEnum.BREATHING_DIFFICULTY);
        }

        /**
         * Saida de dados do paciente
         */
        System.out.println("Nome: " + patient.getName());
        System.out.println("CPF: " + patient.getCpf());
        System.out.println("Logradouro: " + patient.getAddress().getCep());
        System.out.println("Numero da residencia " + patient.getAddress().getHomeNumber());
        System.out.println("Telefone de contato: " + patient.getContact().getPhone());
        System.out.println("Email de contato: " + patient.getContact().getEmail());

        DecimalFormat format = new DecimalFormat("0.#");

        System.out.println("Sua porcentagem de risco de ter contraído o coronga vairus é de " + format.format(percentageCovid.percentage(symptoms)) + "%");
        System.out.println("Porcentagem de mortalidade referente a sua idade é de " + ageRisk.risk(patient.getAge()) + "%");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Resultado meramente ilustrativo");

    }
}
