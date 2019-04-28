# IbanSoapRest
Iban soap rest validation web service

XSD BASED WEB SERVICE:

*/services/iban

REQUEST EXAMPLE:

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:sch="http://www.homework.com/xml/iban">
   <soapenv:Header/>
   <soapenv:Body>
      <sch:IbanValidationRequest>
      	<sch:Iban>
    		<sch:iban>
    			<sch:iban>AA051245445454552117989</sch:iban>
    			<sch:valid>true</sch:valid>
    		</sch:iban>
    		<sch:iban>
    			<sch:iban>LT647044001231465456</sch:iban>
    			<sch:valid>true</sch:valid>
    		</sch:iban>
    		<sch:iban>
    			<sch:iban>LT517044077788877777</sch:iban>
    			<sch:valid>true</sch:valid>
    		</sch:iban>
    		<sch:iban>
    			<sch:iban>LT227044077788877777</sch:iban>
    			<sch:valid>true</sch:valid>
    		</sch:iban>
    		<sch:iban>
    			<sch:iban>CC051245445454552117989</sch:iban>
    			<sch:valid>true</sch:valid>
    		</sch:iban>
		</sch:Iban>
      </sch:IbanValidationRequest>
   </soapenv:Body>
</soapenv:Envelope>

RESPONSE EXAMPLE: 

<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:IbanValidationResponse xmlns:ns2="http://www.homework.com/xml/iban">
            <ns2:Iban>
                <ns2:iban>
                    <ns2:iban>AA051245445454552117989</ns2:iban>
                    <ns2:valid>false</ns2:valid>
                </ns2:iban>
                <ns2:iban>
                    <ns2:iban>LT647044001231465456</ns2:iban>
                    <ns2:valid>true</ns2:valid>
                </ns2:iban>
                <ns2:iban>
                    <ns2:iban>LT517044077788877777</ns2:iban>
                    <ns2:valid>true</ns2:valid>
                </ns2:iban>
                <ns2:iban>
                    <ns2:iban>LT227044077788877777</ns2:iban>
                    <ns2:valid>false</ns2:valid>
                </ns2:iban>
                <ns2:iban>
                    <ns2:iban>CC051245445454552117989</ns2:iban>
                    <ns2:valid>false</ns2:valid>
                </ns2:iban>
            </ns2:Iban>
        </ns2:IbanValidationResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>

REST WEB SERVICE:

*/api/validate

VALIDATION LIST OF IBANS

REQUEST EXAMPLE:

{
    "iban": {
        "iban": [
            {
                "iban": "AA051245445454552117989",
                "valid": false
            },
            {
                "iban": "LT647044001231465456",
                "valid": true
            },
            {
                "iban": "LT517044077788877777",
                "valid": false
            },
            {
                "iban": "LT227044077788877777"
                
            },
            {
                "iban": "CC051245445454552117989"
                
            }
        ]
    }
}

RESPONSE EXAMPLE:

{
    "iban": {
        "iban": [
            {
                "iban": "AA051245445454552117989",
                "valid": false
            },
            {
                "iban": "LT647044001231465456",
                "valid": true
            },
            {
                "iban": "LT517044077788877777",
                "valid": true
            },
            {
                "iban": "LT227044077788877777",
                "valid": false
            },
            {
                "iban": "CC051245445454552117989",
                "valid": false
            }
        ]
    }
}

SINGLE IBAN VALIDATING FROM ADRRESS BAR:

*/api/validate/

REQUEST EXAMPLE:

*/api/validate/AA051245445454552117989

RESPONSE EXAMPLE:

false

GENERATION JSON EXAMPLE FOR TESTING:

*/api/format

RESPONSE EXAMPLE:

<IbanValidationResponse xmlns="http://www.homework.com/xml/iban">
<Iban>
<iban>
<iban>AA051245445454552117989</iban>
<valid>false</valid>
</iban>
<iban>
<iban>LT647044001231465456</iban>
<valid>false</valid>
</iban>
<iban>
<iban>LT517044077788877777</iban>
<valid>false</valid>
</iban>
<iban>
<iban>LT227044077788877777</iban>
<valid>false</valid>
</iban>
</Iban>
</IbanValidationResponse>



