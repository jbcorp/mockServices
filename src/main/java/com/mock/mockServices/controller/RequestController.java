package com.mock.mockServices.controller;


import com.mock.mockServices.services.GetCustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bhati502 on 9-5-2017.
 */
@RestController
public class RequestController {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testMethod() {
        return "HELLO......";
    }

    @RequestMapping(value = "/GetCustomerInformation", method = RequestMethod.POST)
    public String GetCustomerInformation() {
        return GetCustomerDetailsService.returnResponse();
    }

    @RequestMapping(value = "/GetInstalledBase", method = RequestMethod.POST)
    public String GetInstalledBase() {
        return "HELLO......";
    }

    @RequestMapping(value = "/GetTechnicalInstalledBase", method = RequestMethod.POST)
    public String GetTechnicalInstalledBase() {
        return "HELLO......";
    }

    @RequestMapping(value = "/PrequalOrderIntakeNew", method = RequestMethod.POST)
    public String PrequalOrderIntakeNew() {
        return "HELLO......";
    }

    @RequestMapping(value = "/VASAvailability", method = RequestMethod.POST)
    public String VASAvailability() {
        return "HELLO......";
    }

    @RequestMapping(value = "/PackageAvailability", method = RequestMethod.POST)
    public String PackageAvailability() {
        return "HELLO......";
    }

    @RequestMapping(value = "/AccessOrderSecenario", method = RequestMethod.POST)
    public String AccessOrderSecenario() {
        return "HELLO......";
    }

    @RequestMapping(value = "/HardWareStatus", method = RequestMethod.POST)
    public String HardWareStatus() {
        return "HELLO......";
    }

    @RequestMapping(value = "/UpdatePrivacy", method = RequestMethod.POST)
    public String UpdatePrivacy() {
        return "HELLO......";
    }

    @RequestMapping(value = "/GetFirstPossibleWishdate", method = RequestMethod.POST)
    public String GetFirstPossibleWishdate() {
        return "HELLO......";
    }

    @RequestMapping(value = "/SimplePrequalify", method = RequestMethod.POST)
    public String SimplePrequalify() {
        return "HELLO......";
    }

    @RequestMapping(value = "/ValidateTelephoneNumber", method = RequestMethod.POST)
    public String ValidateTelephoneNumber() {
        return "HELLO......";
    }

    @RequestMapping(value = "/GetInitialOrderDuplicateVoip", method = RequestMethod.POST)
    public String GetInitialOrderDuplicateVoip() {
        return "HELLO......";
    }

    @RequestMapping(value = "/SearchCustomer", method = RequestMethod.POST)
    public String SearchCustomer() {
        return "HELLO......";
    }

    @RequestMapping(value = "/GetInitialOrderCustomerDetails", method = RequestMethod.POST)
    public String GetInitialOrderCustomerDetails() {
        return "HELLO......";
    }

    @RequestMapping(value = "/GetInitialOrderEmailValidation", method = RequestMethod.POST)
    public String GetInitialOrderEmailValidation() {
        return "HELLO......";
    }

    @RequestMapping(value = "/GetInitialOrderTelephoneValidation", method = RequestMethod.POST)
    public String GetInitialOrderTelephoneValidation() {
        return "HELLO......";
    }

    @RequestMapping(value = "/GetInitialOrderSaveOrderDetails", method = RequestMethod.POST)
    public String GetInitialOrderSaveOrderDetails() {
        return "HELLO......";
    }

    @RequestMapping(value = "/GetAvailablePlanDates", method = RequestMethod.POST)
    public String GetAvailablePlanDates() {
        return "HELLO......";
    }

    @RequestMapping(value = "/CheckPendingOrders", method = RequestMethod.POST)
    public String CheckPendingOrders() {
        return "HELLO......";
    }

    @RequestMapping(value = "/SaveOrder", method = RequestMethod.POST)
    public String SaveOrder() {
        return "HELLO- Hero ......";
    }
}
