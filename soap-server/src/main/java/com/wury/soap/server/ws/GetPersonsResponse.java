
package com.wury.soap.server.ws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPersonsResponse", namespace = "http://ws.server.soap.wury.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonsResponse", namespace = "http://ws.server.soap.wury.com/")
public class GetPersonsResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.wury.soap.server.domain.Person> _return;

    /**
     * 
     * @return
     *     returns List<Person>
     */
    public List<com.wury.soap.server.domain.Person> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.wury.soap.server.domain.Person> _return) {
        this._return = _return;
    }

}
