package com.mock.mockServices.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mock.mockServices.services.RequestService;

/**
 * Created by bhati502 on 9-5-2017.
 */
@RestController
public class RequestController {

    @Autowired
    RequestService requestService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testMethod() {
        return "HELLO......";
    }

    @RequestMapping(value = "/GetCustomerInformation", method = RequestMethod.POST)
    public String GetCustomerInformation() {
        return requestService.getCustomerDetailsResponse();
    }

    @RequestMapping(value = "/GetInstalledBase", method = RequestMethod.POST)
    public String GetInstalledBase() {
        return requestService.getInstalledBaseResponse();
    }

    @RequestMapping(value = "/GetTechnicalInstalledBase", method = RequestMethod.POST)
    public String GetTechnicalInstalledBase() {
        return requestService.getTechnicalInstalledBaseResponse();
    }

    @RequestMapping(value = "/PrequalOrderIntakeNew", method = RequestMethod.POST)
    public String PrequalOrderIntakeNew() {
        return requestService.getPrequalOrderIntakeNewResponse();
    }

    @RequestMapping(value = "/VASAvailability", method = RequestMethod.POST)
    public String VASAvailability() {
        return requestService.getVASAvailabilityResponse();
    }

    @RequestMapping(value = "/PackageAvailability", method = RequestMethod.POST)
    public String PackageAvailability() {
        return requestService.getPackageAvailabilityResponse();
    }

    @RequestMapping(value = "/AccessOrderSecenario", method = RequestMethod.POST)
    public String AccessOrderSecenario() {
        return requestService.getAccessOrderSecenarioResponse();
    }

    @RequestMapping(value = "/HardWareStatus", method = RequestMethod.POST)
    public String HardWareStatus() {
        return requestService.getHardWareStatusResponse();
    }

    @RequestMapping(value = "/UpdatePrivacy", method = RequestMethod.POST)
    public String UpdatePrivacy() {
        return requestService.getUpdatePrivacyResponse();
    }

    @RequestMapping(value = "/GetFirstPossibleWishdate", method = RequestMethod.POST)
    public String GetFirstPossibleWishdate() {
        return requestService.getFirstPossibleWishdateResponse();
    }

    @RequestMapping(value = "/SimplePrequalify", method = RequestMethod.POST)
    public String SimplePrequalify() {
        return requestService.getSimplePrequalifyResponse();
    }

    @RequestMapping(value = "/ValidateTelephoneNumber", method = RequestMethod.POST)
    public String ValidateTelephoneNumber() { return requestService.getValidateTelephoneNumberResponse(); }

    @RequestMapping(value = "/GetInitialOrderDuplicateVoip", method = RequestMethod.POST)
    public String GetInitialOrderDuplicateVoip() {
        return requestService.getInitialOrderDuplicateVoipResponse();
    }

    @RequestMapping(value = "/SearchCustomer", method = RequestMethod.POST)
    public String SearchCustomer() {
        return requestService.getSearchCustomerResponse();
    }

    @RequestMapping(value = "/GetInitialOrderCustomerDetails", method = RequestMethod.POST)
    public String GetInitialOrderCustomerDetails() {
        return requestService.getCustomerDetailsResponse();
    }

    @RequestMapping(value = "/GetInitialOrderEmailValidation", method = RequestMethod.POST)
    public String GetInitialOrderEmailValidation() {
        return requestService.getValidateEmailResponse();
    }

    @RequestMapping(value = "/GetInitialOrderTelephoneValidation", method = RequestMethod.POST)
    public String GetInitialOrderTelephoneValidation() {
        return requestService.getValidateTelephoneNumberResponse();
    }

    @RequestMapping(value = "/GetInitialOrderSaveOrderDetails", method = RequestMethod.POST)
    public String GetInitialOrderSaveOrderDetails() {
        return requestService.saveOrderResponse();
    }

    @RequestMapping(value = "/GetAvailablePlanDates", method = RequestMethod.POST)
    public String GetAvailablePlanDates() {
        return requestService.getAvailablePlanDatesResponse();
    }

    @RequestMapping(value = "/CheckPendingOrders", method = RequestMethod.POST)
    public String CheckPendingOrders() {
        return requestService.getCheckPendingOrdersResponse();
    }

    @RequestMapping(value = "/SaveOrder", method = RequestMethod.POST)
    public String SaveOrder() {
        return requestService.saveOrderResponse();
    }
}
