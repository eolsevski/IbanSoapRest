package com.homework.soeprest.endpoint;

import com.homework.soeprest.services.IbanValidationService;
import com.homework.xml.iban.IbanValidationResponse;
import com.homework.xml.iban.IbanValidationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class IbanValidationEndpoint {

    private static final String NAMESPACE_URI = "http://www.homework.com/xml/iban";

    @Autowired
    IbanValidationService ibanValidationService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "IbanValidationRequest")
    @ResponsePayload
    public IbanValidationResponse getCustomer(@RequestPayload IbanValidationRequest request){
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
}
