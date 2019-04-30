package com.homework.soeprest.console;

import com.homework.soeprest.services.IbanValidationService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCheck {

    IbanValidationService ibanValidationService = new IbanValidationService();

    public void fileCheck (String url) {

            File file = new File(url);

            if (file.isFile())
                try {
                    String urlOut = "" + url.substring(0, (url.length() - 3)) + "out";
                    Scanner input = new Scanner(file);
                    PrintWriter writer = new PrintWriter(urlOut, "UTF-8");
                    while (input.hasNext()) {
                        String iban = input.next();
                        writer.write(iban + ibanValidationService.validate(iban));
                        writer.write(System.getProperty("line.separator"));
                    }
                    input.close();
                    writer.close();
                    System.out.println();
                    System.out.println("irasyta i faila: " + urlOut);
                } catch (Exception e) {
                    System.out.println("nerastas failas");
                }
            else
                System.out.println("nerastas failas");
            System.out.println();
    }
}
