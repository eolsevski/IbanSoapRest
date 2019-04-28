package com.homework.soeprest.controller;

import com.homework.soeprest.services.IbanValidationService;
import com.homework.xml.iban.IbanList;
import com.homework.xml.iban.IbanValidationRequest;
import com.homework.xml.iban.IbanValidationResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class IBANRestController {

    private IbanValidationService ibanValidationService = new IbanValidationService();

    /**
     *
     * @param request
     * @return
     */
    @PostMapping("/validate")
    public IbanValidationResponse validate(@RequestBody IbanValidationRequest request) {
        IbanValidationResponse response = new IbanValidationResponse();
        response.setIban(request.getIban());
        request .getIban()
                .getIban()
                .stream()
                .forEach(x->{
                    x.setValid(ibanValidationService.validate(x.getIban()));
                });
        response.setIban(request.getIban());

        return response;
    }

    /**
     * controller for validating single iban from browser address bar
     * @param iban
     * @return
     */
    @PostMapping("/validate/{iban}")
    public boolean ibanValidatorOne(@PathVariable("iban") String iban) {

        return ibanValidationService.validate(iban);
    }

    /**
     * if lazy type it, just run this and copy for yourself
     * @return
     */
    @GetMapping("/format")
    public IbanValidationResponse faker() {
        IbanList.Iban iban = new IbanList.Iban();
        iban.setIban("AA051245445454552117989");
        IbanList.Iban iban1 = new IbanList.Iban();
        iban1.setIban("LT647044001231465456");
        IbanList.Iban iban2 = new IbanList.Iban();
        iban2.setIban("LT517044077788877777");
        IbanList.Iban iban3 = new IbanList.Iban();
        iban3.setIban("LT227044077788877777");
        IbanList.Iban iban4 = new IbanList.Iban();
        iban4.setIban("CC051245445454552117989");
        IbanValidationResponse ibanWrapper = new IbanValidationResponse();
        IbanList ibanList = new IbanList();
        ibanList.getIban().add(iban);
        ibanList.getIban().add(iban1);
        ibanList.getIban().add(iban2);
        ibanList.getIban().add(iban3);
        ibanWrapper.setIban(ibanList);

        return ibanWrapper;
    }
}
