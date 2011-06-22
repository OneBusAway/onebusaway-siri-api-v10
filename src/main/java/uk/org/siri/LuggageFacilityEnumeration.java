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
 * <p>Java class for LuggageFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LuggageFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti23_17"/>
 *     &lt;enumeration value="bikeCarriage"/>
 *     &lt;enumeration value="faclug_1"/>
 *     &lt;enumeration value="baggageStorage"/>
 *     &lt;enumeration value="faclug_2"/>
 *     &lt;enumeration value="leftLuggage"/>
 *     &lt;enumeration value="faclug_4"/>
 *     &lt;enumeration value="porterage"/>
 *     &lt;enumeration value="faclug_5"/>
 *     &lt;enumeration value="baggageTrolleys"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuggageFacilityEnumeration")
@XmlEnum
public enum LuggageFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_17")
    PTI_23_17("pti23_17"),
    @XmlEnumValue("bikeCarriage")
    BIKE_CARRIAGE("bikeCarriage"),
    @XmlEnumValue("faclug_1")
    FACLUG_1("faclug_1"),
    @XmlEnumValue("baggageStorage")
    BAGGAGE_STORAGE("baggageStorage"),
    @XmlEnumValue("faclug_2")
    FACLUG_2("faclug_2"),
    @XmlEnumValue("leftLuggage")
    LEFT_LUGGAGE("leftLuggage"),
    @XmlEnumValue("faclug_4")
    FACLUG_4("faclug_4"),
    @XmlEnumValue("porterage")
    PORTERAGE("porterage"),
    @XmlEnumValue("faclug_5")
    FACLUG_5("faclug_5"),
    @XmlEnumValue("baggageTrolleys")
    BAGGAGE_TROLLEYS("baggageTrolleys");
    private final String value;

    LuggageFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuggageFacilityEnumeration fromValue(String v) {
        for (LuggageFacilityEnumeration c: LuggageFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
