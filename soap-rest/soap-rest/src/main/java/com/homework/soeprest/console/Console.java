package com.homework.soeprest.console;

import com.homework.soeprest.services.IbanValidationService;

import java.util.Scanner;

public class Console {


    public static void startConsole() {

        IbanValidationService ibanValidationService = new IbanValidationService();
        FileCheck fc = new FileCheck();
        Scanner in = new Scanner(System.in);

        for(int i = 1; i>0; i++) {
            System.out.println("Pasirinkite uzduoti:");
            System.out.println("1 - Interaktyvus IBAN numerių tikrinimas");
            System.out.println("2 - IBAN numerių iš tekstinio failo tikrinimas");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Iveskite saskaitos numeri: ");
                    System.out.println(ibanValidationService.validate(in.next()));
                    break;
                case 2:
                    System.out.println("iveskite kelia iki vailo bei jo pavadinima ");
                    String url = in.next();
                    fc.fileCheck(url);
                    break;
                default:
                    System.out.println("neteisingas pasirinkimas");
            }

        }
    }

    
}
