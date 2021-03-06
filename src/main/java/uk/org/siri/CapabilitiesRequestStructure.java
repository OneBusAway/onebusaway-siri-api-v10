//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.13 at 09:30:34 AM PST 
//


package uk.org.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Requests for capabilities of the current system.
 * 
 * <p>Java class for CapabilitiesRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/}RequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/}SiriServiceCapabilitiesRequestGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.siri.org.uk/}VersionString" fixed="1.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesRequestStructure", propOrder = {
    "productionTimetableCapabilitiesRequest",
    "estimatedTimetableCapabilitiesRequest",
    "stopTimetableCapabilitiesRequest",
    "stopMonitoringCapabilitiesRequest",
    "vehicleMonitoringCapabilitiesRequest",
    "connectionTimetableCapabilitiesRequest",
    "connectionMonitoringCapabilitiesRequest",
    "generalMessageCapabilitiesRequest"
})
public class CapabilitiesRequestStructure
    extends RequestStructure
{

    @XmlElement(name = "ProductionTimetableCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure productionTimetableCapabilitiesRequest;
    @XmlElement(name = "EstimatedTimetableCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure estimatedTimetableCapabilitiesRequest;
    @XmlElement(name = "StopTimetableCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure stopTimetableCapabilitiesRequest;
    @XmlElement(name = "StopMonitoringCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure stopMonitoringCapabilitiesRequest;
    @XmlElement(name = "VehicleMonitoringCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure vehicleMonitoringCapabilitiesRequest;
    @XmlElement(name = "ConnectionTimetableCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure connectionTimetableCapabilitiesRequest;
    @XmlElement(name = "ConnectionMonitoringCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure connectionMonitoringCapabilitiesRequest;
    @XmlElement(name = "GeneralMessageCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure generalMessageCapabilitiesRequest;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the productionTimetableCapabilitiesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getProductionTimetableCapabilitiesRequest() {
        return productionTimetableCapabilitiesRequest;
    }

    /**
     * Sets the value of the productionTimetableCapabilitiesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setProductionTimetableCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.productionTimetableCapabilitiesRequest = value;
    }

    /**
     * Gets the value of the estimatedTimetableCapabilitiesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getEstimatedTimetableCapabilitiesRequest() {
        return estimatedTimetableCapabilitiesRequest;
    }

    /**
     * Sets the value of the estimatedTimetableCapabilitiesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setEstimatedTimetableCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.estimatedTimetableCapabilitiesRequest = value;
    }

    /**
     * Gets the value of the stopTimetableCapabilitiesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getStopTimetableCapabilitiesRequest() {
        return stopTimetableCapabilitiesRequest;
    }

    /**
     * Sets the value of the stopTimetableCapabilitiesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setStopTimetableCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.stopTimetableCapabilitiesRequest = value;
    }

    /**
     * Gets the value of the stopMonitoringCapabilitiesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getStopMonitoringCapabilitiesRequest() {
        return stopMonitoringCapabilitiesRequest;
    }

    /**
     * Sets the value of the stopMonitoringCapabilitiesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setStopMonitoringCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.stopMonitoringCapabilitiesRequest = value;
    }

    /**
     * Gets the value of the vehicleMonitoringCapabilitiesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getVehicleMonitoringCapabilitiesRequest() {
        return vehicleMonitoringCapabilitiesRequest;
    }

    /**
     * Sets the value of the vehicleMonitoringCapabilitiesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setVehicleMonitoringCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.vehicleMonitoringCapabilitiesRequest = value;
    }

    /**
     * Gets the value of the connectionTimetableCapabilitiesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getConnectionTimetableCapabilitiesRequest() {
        return connectionTimetableCapabilitiesRequest;
    }

    /**
     * Sets the value of the connectionTimetableCapabilitiesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setConnectionTimetableCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.connectionTimetableCapabilitiesRequest = value;
    }

    /**
     * Gets the value of the connectionMonitoringCapabilitiesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getConnectionMonitoringCapabilitiesRequest() {
        return connectionMonitoringCapabilitiesRequest;
    }

    /**
     * Sets the value of the connectionMonitoringCapabilitiesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setConnectionMonitoringCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.connectionMonitoringCapabilitiesRequest = value;
    }

    /**
     * Gets the value of the generalMessageCapabilitiesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getGeneralMessageCapabilitiesRequest() {
        return generalMessageCapabilitiesRequest;
    }

    /**
     * Sets the value of the generalMessageCapabilitiesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setGeneralMessageCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.generalMessageCapabilitiesRequest = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
