/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.soap.server.ws;

import com.wury.soap.server.domain.Person;
import com.wury.soap.server.service.PersonService;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author WURI
 */
@WebService
public class PersonWS {
    
    private PersonService personService;

    @WebMethod(exclude = true)
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
    
    @WebMethod(operationName = "getPersons")
   public List<Person> getPersons(){
       return personService.getPersons();
   }

}
