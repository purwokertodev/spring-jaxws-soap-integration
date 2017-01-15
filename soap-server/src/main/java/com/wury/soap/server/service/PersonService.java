/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.soap.server.service;

import com.wury.soap.server.domain.Person;
import java.util.List;

/**
 *
 * @author WURI
 */
public interface PersonService {

    public List<Person> getPersons();
}
