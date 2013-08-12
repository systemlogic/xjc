//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 10:44:58 AM IST 
//


package com.bank.account;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bank.account package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bank.account
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Details }
     * 
     */
    public Details createDetails() {
        return new Details();
    }

    /**
     * Create an instance of {@link Details.Accounts }
     * 
     */
    public Details.Accounts createDetailsAccounts() {
        return new Details.Accounts();
    }

    /**
     * Create an instance of {@link Details.Person }
     * 
     */
    public Details.Person createDetailsPerson() {
        return new Details.Person();
    }

    /**
     * Create an instance of {@link Details.Person.Address }
     * 
     */
    public Details.Person.Address createDetailsPersonAddress() {
        return new Details.Person.Address();
    }

    /**
     * Create an instance of {@link Details.Person.Contact }
     * 
     */
    public Details.Person.Contact createDetailsPersonContact() {
        return new Details.Person.Contact();
    }

    /**
     * Create an instance of {@link Details.Person.Name }
     * 
     */
    public Details.Person.Name createDetailsPersonName() {
        return new Details.Person.Name();
    }

    /**
     * Create an instance of {@link Details.Accounts.Account }
     * 
     */
    public Details.Accounts.Account createDetailsAccountsAccount() {
        return new Details.Accounts.Account();
    }

    /**
     * Create an instance of {@link Details.Person.Address.Location }
     * 
     */
    public Details.Person.Address.Location createDetailsPersonAddressLocation() {
        return new Details.Person.Address.Location();
    }

    /**
     * Create an instance of {@link Details.Person.Address.State }
     * 
     */
    public Details.Person.Address.State createDetailsPersonAddressState() {
        return new Details.Person.Address.State();
    }

    /**
     * Create an instance of {@link Details.Person.Address.Country }
     * 
     */
    public Details.Person.Address.Country createDetailsPersonAddressCountry() {
        return new Details.Person.Address.Country();
    }

    /**
     * Create an instance of {@link Details.Person.Contact.Phone }
     * 
     */
    public Details.Person.Contact.Phone createDetailsPersonContactPhone() {
        return new Details.Person.Contact.Phone();
    }

    /**
     * Create an instance of {@link Details.Person.Name.FirstName }
     * 
     */
    public Details.Person.Name.FirstName createDetailsPersonNameFirstName() {
        return new Details.Person.Name.FirstName();
    }

}