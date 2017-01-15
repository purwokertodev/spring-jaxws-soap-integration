/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.soap.client.ws.app;

import com.wury.soap.server.ws.Person;
import com.wury.soap.server.ws.PersonWS;
import com.wury.soap.server.ws.PersonWSService;

/**
 *
 * @author WURI
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonWSService service = new PersonWSService();
        PersonWS personWS = service.getPersonWSPort();
        for(Person p:personWS.getPersons()){
            System.out.println("Code : " + p.getCode() + "\n" + "Name : " + p.getName());
        }
    }

}
