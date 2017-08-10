package com.mock.mockServices.services;

/**
 * Created by bhati502 on 9-8-2017.
 */
public class GetCustomerDetailsService {

    public static String returnResponse(String request) {
        String response = "";
        return response;
    }

    public static String returnResponse() {
        String response = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:urn='urn:fiber.kpn.com:crm:frontdesk:data:v0'><soapenv:Header><header xmlns='http://schemas.cordys.com/General/1.0/'><msg-id>0050568c-6f41-11e7-ef9c-860945b85d7a</msg-id><license>License has expired since 1175 day(s)</license></header></soapenv:Header><soapenv:Body><GetCustomerDetailsResponse xmlns='urn:fiber.kpn.com:crm:frontdesk:data:v0'><CustomerNumber>9013063677</CustomerNumber><AccountId>2-10BYXF0</AccountId><NameInfo><FirstName>A.B.</FirstName><MiddleName/><LastName>STZ_1038_PackageChange</LastName><Initials>A.B.</Initials><Gender>Male</Gender><BirthDate>1993-03-02</BirthDate></NameInfo><Address><Street>Irenestraat</Street><HouseNumber>29</HouseNumber><HouseNumberExtension/><ZipCode>5981XJ</ZipCode><City>PANNINGEN</City><Country>Netherlands</Country></Address><ContactInfo><TelephoneNumber>0634567899</TelephoneNumber><EmailAddress>packagechange@gmail.com</EmailAddress><MailRelevantOffers>false</MailRelevantOffers></ContactInfo><PaymentInfo><BankAccountNumber>LU280019400644750000</BankAccountNumber><BankAccountName/><DirectDebitAgreed>true</DirectDebitAgreed></PaymentInfo><ProductLine>GLAS</ProductLine><Brand>KPN</Brand><ContractInfo><ContractStartDate>2017-03-07</ContractStartDate><ContractEndDate>2018-09-06</ContractEndDate><ContractTerm>P18M</ContractTerm></ContractInfo><AccountStatus>Active</AccountStatus><AccountType>Residential</AccountType><AccountName>A.B. STZ_1038_PACKAGECHANGE</AccountName><FiberFlag>Y</FiberFlag><LineType>FTTH</LineType><ProvisionedBy/></GetCustomerDetailsResponse></soapenv:Body></soapenv:Envelope>";
        return response;
    }
}
