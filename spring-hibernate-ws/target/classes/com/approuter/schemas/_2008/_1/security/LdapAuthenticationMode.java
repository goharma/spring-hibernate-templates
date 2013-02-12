//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.11 at 08:16:57 PM CST 
//


package com.approuter.schemas._2008._1.security;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldapAuthenticationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ldapAuthenticationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="compose"/>
 *     &lt;enumeration value="search"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ldapAuthenticationMode")
@XmlEnum
public enum LdapAuthenticationMode {

    @XmlEnumValue("compose")
    COMPOSE("compose"),
    @XmlEnumValue("search")
    SEARCH("search");
    private final String value;

    LdapAuthenticationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LdapAuthenticationMode fromValue(String v) {
        for (LdapAuthenticationMode c: LdapAuthenticationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}