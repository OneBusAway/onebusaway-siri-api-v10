//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.13 at 09:30:34 AM PST 
//


package uk.org.siri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SanitaryFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SanitaryFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti23_22"/>
 *     &lt;enumeration value="toilet"/>
 *     &lt;enumeration value="pti23_23"/>
 *     &lt;enumeration value="noToilet"/>
 *     &lt;enumeration value="fsan_3"/>
 *     &lt;enumeration value="shower"/>
 *     &lt;enumeration value="fsan_4"/>
 *     &lt;enumeration value="wheelchairAcccessToilet"/>
 *     &lt;enumeration value="fsan_5"/>
 *     &lt;enumeration value="babyChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SanitaryFacilityEnumeration")
@XmlEnum
public enum SanitaryFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_22")
    PTI_23_22("pti23_22"),
    @XmlEnumValue("toilet")
    TOILET("toilet"),
    @XmlEnumValue("pti23_23")
    PTI_23_23("pti23_23"),
    @XmlEnumValue("noToilet")
    NO_TOILET("noToilet"),
    @XmlEnumValue("fsan_3")
    FSAN_3("fsan_3"),
    @XmlEnumValue("shower")
    SHOWER("shower"),
    @XmlEnumValue("fsan_4")
    FSAN_4("fsan_4"),
    @XmlEnumValue("wheelchairAcccessToilet")
    WHEELCHAIR_ACCCESS_TOILET("wheelchairAcccessToilet"),
    @XmlEnumValue("fsan_5")
    FSAN_5("fsan_5"),
    @XmlEnumValue("babyChange")
    BABY_CHANGE("babyChange");
    private final String value;

    SanitaryFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SanitaryFacilityEnumeration fromValue(String v) {
        for (SanitaryFacilityEnumeration c: SanitaryFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
