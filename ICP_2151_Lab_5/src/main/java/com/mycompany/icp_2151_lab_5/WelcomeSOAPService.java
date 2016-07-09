/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.icp_2151_lab_5;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 * @author Huw
 * @author Michael
 */
@WebService(serviceName = "WelcomeSOAPService")
public class WelcomeSOAPService {

    /**
     * Prints a welcome message and the value entered into the field
     * @param name the value added into the field
     * @return the welcome message and the value 
     */
    @WebMethod(operationName = "welcome")
    public String welcome(@WebParam(name = "name") String name) {
        return "Welcome to JAX-WS web services with SOAP, " + name + "!";
    }
}
