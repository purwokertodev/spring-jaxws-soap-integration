/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.soap.server.service;

import com.wury.soap.server.domain.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WURI
 */
public class PersonServiceImpl implements PersonService {

    @Override
    public List<Person> getPersons() {
        List<Person> list = new ArrayList<>();
        
        Person a = new Person("001", "Andi");
        Person b = new Person("002", "Budi");
        Person c = new Person("003", "Citra");
        list.add(a);
        list.add(b);
        list.add(c);
        return list;
    }

}
