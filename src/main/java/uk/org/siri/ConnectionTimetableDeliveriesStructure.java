//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.13 at 09:30:34 AM PST 
//


package uk.org.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Deliveries for Connection Timetable Service. Used in WSDL
 * 
 * <p>Java class for ConnectionTimetableDeliveriesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionTimetableDeliveriesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/}ConnectionTimetableDelivery"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionTimetableDeliveriesStructure", propOrder = {
    "connectionTimetableDelivery"
})
public class ConnectionTimetableDeliveriesStructure {

    @XmlElement(name = "ConnectionTimetableDelivery", required = true)
    protected ConnectionTimetableDeliveryStructure connectionTimetableDelivery;

    /**
     * Gets the value of the connectionTimetableDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionTimetableDeliveryStructure }
     *     
     */
    public ConnectionTimetableDeliveryStructure getConnectionTimetableDelivery() {
        return connectionTimetableDelivery;
    }

    /**
     * Sets the value of the connectionTimetableDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionTimetableDeliveryStructure }
     *     
     */
    public void setConnectionTimetableDelivery(ConnectionTimetableDeliveryStructure value) {
        this.connectionTimetableDelivery = value;
    }

}
