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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;group ref="{http://www.siri.org.uk/}RequestGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/}ResponseGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/}Extensions" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceRequest",
    "subscriptionRequest",
    "terminateSubscriptionRequest",
    "dataReadyNotification",
    "dataSupplyRequest",
    "checkStatusRequest",
    "heartbeatNotification",
    "capabilitiesRequest",
    "stopPointsRequest",
    "linesRequest",
    "serviceFeaturesRequest",
    "productCategoriesRequest",
    "vehicleFeaturesRequest",
    "infoChannelRequest",
    "subscriptionResponse",
    "terminateSubscriptionResponse",
    "dataReadyAcknowledgement",
    "serviceDelivery",
    "dataReceivedAcknowledgement",
    "checkStatusResponse",
    "capabilitiesResponse",
    "stopPointsDelivery",
    "linesDelivery",
    "productCategoriesDelivery",
    "serviceFeaturesDelivery",
    "vehicleFeaturesDelivery",
    "infoChannelDelivery",
    "extensions"
})
@XmlRootElement(name = "Siri")
public class Siri {

    @XmlElement(name = "ServiceRequest")
    protected ServiceRequest serviceRequest;
    @XmlElement(name = "SubscriptionRequest")
    protected SubscriptionRequest subscriptionRequest;
    @XmlElement(name = "TerminateSubscriptionRequest")
    protected TerminateSubscriptionRequestStructure terminateSubscriptionRequest;
    @XmlElement(name = "DataReadyNotification")
    protected DataReadyRequestStructure dataReadyNotification;
    @XmlElement(name = "DataSupplyRequest")
    protected DataSupplyRequestStructure dataSupplyRequest;
    @XmlElement(name = "CheckStatusRequest")
    protected CheckStatusRequestStructure checkStatusRequest;
    @XmlElement(name = "HeartbeatNotification")
    protected HeartbeatNotificationStructure heartbeatNotification;
    @XmlElement(name = "CapabilitiesRequest")
    protected CapabilitiesRequestStructure capabilitiesRequest;
    @XmlElement(name = "StopPointsRequest")
    protected StopPointsRequest stopPointsRequest;
    @XmlElement(name = "LinesRequest")
    protected LinesDiscoveryRequestStructure linesRequest;
    @XmlElement(name = "ServiceFeaturesRequest")
    protected ServiceFeaturesDiscoveryRequestStructure serviceFeaturesRequest;
    @XmlElement(name = "ProductCategoriesRequest")
    protected ProductCategoriesDiscoveryRequestStructure productCategoriesRequest;
    @XmlElement(name = "VehicleFeaturesRequest")
    protected VehicleFeaturesDiscoveryRequestStructure vehicleFeaturesRequest;
    @XmlElement(name = "InfoChannelRequest")
    protected InfoChannelDiscoveryRequestStructure infoChannelRequest;
    @XmlElement(name = "SubscriptionResponse")
    protected SubscriptionResponseStructure subscriptionResponse;
    @XmlElement(name = "TerminateSubscriptionResponse")
    protected TerminateSubscriptionResponseStructure terminateSubscriptionResponse;
    @XmlElement(name = "DataReadyAcknowledgement")
    protected DataReadyResponseStructure dataReadyAcknowledgement;
    @XmlElement(name = "ServiceDelivery")
    protected ServiceDelivery serviceDelivery;
    @XmlElement(name = "DataReceivedAcknowledgement")
    protected DataReceivedResponseStructure dataReceivedAcknowledgement;
    @XmlElement(name = "CheckStatusResponse")
    protected CheckStatusResponseStructure checkStatusResponse;
    @XmlElement(name = "CapabilitiesResponse")
    protected CapabilitiesResponseStructure capabilitiesResponse;
    @XmlElement(name = "StopPointsDelivery")
    protected StopPointsDeliveryStructure stopPointsDelivery;
    @XmlElement(name = "LinesDelivery")
    protected LinesDeliveryStructure linesDelivery;
    @XmlElement(name = "ProductCategoriesDelivery")
    protected ProductCategoriesDeliveryStructure productCategoriesDelivery;
    @XmlElement(name = "ServiceFeaturesDelivery")
    protected ServiceFeaturesDeliveryStructure serviceFeaturesDelivery;
    @XmlElement(name = "VehicleFeaturesDelivery")
    protected VehicleFeaturesDeliveryStructure vehicleFeaturesDelivery;
    @XmlElement(name = "InfoChannelDelivery")
    protected InfoChannelDeliveryStructure infoChannelDelivery;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String version;

    /**
     * Gets the value of the serviceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequest }
     *     
     */
    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    /**
     * Sets the value of the serviceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequest }
     *     
     */
    public void setServiceRequest(ServiceRequest value) {
        this.serviceRequest = value;
    }

    /**
     * Gets the value of the subscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionRequest }
     *     
     */
    public SubscriptionRequest getSubscriptionRequest() {
        return subscriptionRequest;
    }

    /**
     * Sets the value of the subscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionRequest }
     *     
     */
    public void setSubscriptionRequest(SubscriptionRequest value) {
        this.subscriptionRequest = value;
    }

    /**
     * Gets the value of the terminateSubscriptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionRequestStructure }
     *     
     */
    public TerminateSubscriptionRequestStructure getTerminateSubscriptionRequest() {
        return terminateSubscriptionRequest;
    }

    /**
     * Sets the value of the terminateSubscriptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionRequestStructure }
     *     
     */
    public void setTerminateSubscriptionRequest(TerminateSubscriptionRequestStructure value) {
        this.terminateSubscriptionRequest = value;
    }

    /**
     * Gets the value of the dataReadyNotification property.
     * 
     * @return
     *     possible object is
     *     {@link DataReadyRequestStructure }
     *     
     */
    public DataReadyRequestStructure getDataReadyNotification() {
        return dataReadyNotification;
    }

    /**
     * Sets the value of the dataReadyNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReadyRequestStructure }
     *     
     */
    public void setDataReadyNotification(DataReadyRequestStructure value) {
        this.dataReadyNotification = value;
    }

    /**
     * Gets the value of the dataSupplyRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DataSupplyRequestStructure }
     *     
     */
    public DataSupplyRequestStructure getDataSupplyRequest() {
        return dataSupplyRequest;
    }

    /**
     * Sets the value of the dataSupplyRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSupplyRequestStructure }
     *     
     */
    public void setDataSupplyRequest(DataSupplyRequestStructure value) {
        this.dataSupplyRequest = value;
    }

    /**
     * Gets the value of the checkStatusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusRequestStructure }
     *     
     */
    public CheckStatusRequestStructure getCheckStatusRequest() {
        return checkStatusRequest;
    }

    /**
     * Sets the value of the checkStatusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusRequestStructure }
     *     
     */
    public void setCheckStatusRequest(CheckStatusRequestStructure value) {
        this.checkStatusRequest = value;
    }

    /**
     * Gets the value of the heartbeatNotification property.
     * 
     * @return
     *     possible object is
     *     {@link HeartbeatNotificationStructure }
     *     
     */
    public HeartbeatNotificationStructure getHeartbeatNotification() {
        return heartbeatNotification;
    }

    /**
     * Sets the value of the heartbeatNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartbeatNotificationStructure }
     *     
     */
    public void setHeartbeatNotification(HeartbeatNotificationStructure value) {
        this.heartbeatNotification = value;
    }

    /**
     * Gets the value of the capabilitiesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesRequestStructure }
     *     
     */
    public CapabilitiesRequestStructure getCapabilitiesRequest() {
        return capabilitiesRequest;
    }

    /**
     * Sets the value of the capabilitiesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesRequestStructure }
     *     
     */
    public void setCapabilitiesRequest(CapabilitiesRequestStructure value) {
        this.capabilitiesRequest = value;
    }

    /**
     * Gets the value of the stopPointsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointsRequest }
     *     
     */
    public StopPointsRequest getStopPointsRequest() {
        return stopPointsRequest;
    }

    /**
     * Sets the value of the stopPointsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointsRequest }
     *     
     */
    public void setStopPointsRequest(StopPointsRequest value) {
        this.stopPointsRequest = value;
    }

    /**
     * Gets the value of the linesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LinesDiscoveryRequestStructure }
     *     
     */
    public LinesDiscoveryRequestStructure getLinesRequest() {
        return linesRequest;
    }

    /**
     * Sets the value of the linesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesDiscoveryRequestStructure }
     *     
     */
    public void setLinesRequest(LinesDiscoveryRequestStructure value) {
        this.linesRequest = value;
    }

    /**
     * Gets the value of the serviceFeaturesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeaturesDiscoveryRequestStructure }
     *     
     */
    public ServiceFeaturesDiscoveryRequestStructure getServiceFeaturesRequest() {
        return serviceFeaturesRequest;
    }

    /**
     * Sets the value of the serviceFeaturesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeaturesDiscoveryRequestStructure }
     *     
     */
    public void setServiceFeaturesRequest(ServiceFeaturesDiscoveryRequestStructure value) {
        this.serviceFeaturesRequest = value;
    }

    /**
     * Gets the value of the productCategoriesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoriesDiscoveryRequestStructure }
     *     
     */
    public ProductCategoriesDiscoveryRequestStructure getProductCategoriesRequest() {
        return productCategoriesRequest;
    }

    /**
     * Sets the value of the productCategoriesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoriesDiscoveryRequestStructure }
     *     
     */
    public void setProductCategoriesRequest(ProductCategoriesDiscoveryRequestStructure value) {
        this.productCategoriesRequest = value;
    }

    /**
     * Gets the value of the vehicleFeaturesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFeaturesDiscoveryRequestStructure }
     *     
     */
    public VehicleFeaturesDiscoveryRequestStructure getVehicleFeaturesRequest() {
        return vehicleFeaturesRequest;
    }

    /**
     * Sets the value of the vehicleFeaturesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFeaturesDiscoveryRequestStructure }
     *     
     */
    public void setVehicleFeaturesRequest(VehicleFeaturesDiscoveryRequestStructure value) {
        this.vehicleFeaturesRequest = value;
    }

    /**
     * Gets the value of the infoChannelRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InfoChannelDiscoveryRequestStructure }
     *     
     */
    public InfoChannelDiscoveryRequestStructure getInfoChannelRequest() {
        return infoChannelRequest;
    }

    /**
     * Sets the value of the infoChannelRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoChannelDiscoveryRequestStructure }
     *     
     */
    public void setInfoChannelRequest(InfoChannelDiscoveryRequestStructure value) {
        this.infoChannelRequest = value;
    }

    /**
     * Gets the value of the subscriptionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionResponseStructure }
     *     
     */
    public SubscriptionResponseStructure getSubscriptionResponse() {
        return subscriptionResponse;
    }

    /**
     * Sets the value of the subscriptionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionResponseStructure }
     *     
     */
    public void setSubscriptionResponse(SubscriptionResponseStructure value) {
        this.subscriptionResponse = value;
    }

    /**
     * Gets the value of the terminateSubscriptionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public TerminateSubscriptionResponseStructure getTerminateSubscriptionResponse() {
        return terminateSubscriptionResponse;
    }

    /**
     * Sets the value of the terminateSubscriptionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public void setTerminateSubscriptionResponse(TerminateSubscriptionResponseStructure value) {
        this.terminateSubscriptionResponse = value;
    }

    /**
     * Gets the value of the dataReadyAcknowledgement property.
     * 
     * @return
     *     possible object is
     *     {@link DataReadyResponseStructure }
     *     
     */
    public DataReadyResponseStructure getDataReadyAcknowledgement() {
        return dataReadyAcknowledgement;
    }

    /**
     * Sets the value of the dataReadyAcknowledgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReadyResponseStructure }
     *     
     */
    public void setDataReadyAcknowledgement(DataReadyResponseStructure value) {
        this.dataReadyAcknowledgement = value;
    }

    /**
     * Gets the value of the serviceDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDelivery }
     *     
     */
    public ServiceDelivery getServiceDelivery() {
        return serviceDelivery;
    }

    /**
     * Sets the value of the serviceDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDelivery }
     *     
     */
    public void setServiceDelivery(ServiceDelivery value) {
        this.serviceDelivery = value;
    }

    /**
     * Gets the value of the dataReceivedAcknowledgement property.
     * 
     * @return
     *     possible object is
     *     {@link DataReceivedResponseStructure }
     *     
     */
    public DataReceivedResponseStructure getDataReceivedAcknowledgement() {
        return dataReceivedAcknowledgement;
    }

    /**
     * Sets the value of the dataReceivedAcknowledgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReceivedResponseStructure }
     *     
     */
    public void setDataReceivedAcknowledgement(DataReceivedResponseStructure value) {
        this.dataReceivedAcknowledgement = value;
    }

    /**
     * Gets the value of the checkStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusResponseStructure }
     *     
     */
    public CheckStatusResponseStructure getCheckStatusResponse() {
        return checkStatusResponse;
    }

    /**
     * Sets the value of the checkStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusResponseStructure }
     *     
     */
    public void setCheckStatusResponse(CheckStatusResponseStructure value) {
        this.checkStatusResponse = value;
    }

    /**
     * Responses with  the capabilities of an implementation. Answers a CapabilityRequest 
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesResponseStructure }
     *     
     */
    public CapabilitiesResponseStructure getCapabilitiesResponse() {
        return capabilitiesResponse;
    }

    /**
     * Sets the value of the capabilitiesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesResponseStructure }
     *     
     */
    public void setCapabilitiesResponse(CapabilitiesResponseStructure value) {
        this.capabilitiesResponse = value;
    }

    /**
     * Gets the value of the stopPointsDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointsDeliveryStructure }
     *     
     */
    public StopPointsDeliveryStructure getStopPointsDelivery() {
        return stopPointsDelivery;
    }

    /**
     * Sets the value of the stopPointsDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointsDeliveryStructure }
     *     
     */
    public void setStopPointsDelivery(StopPointsDeliveryStructure value) {
        this.stopPointsDelivery = value;
    }

    /**
     * Gets the value of the linesDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link LinesDeliveryStructure }
     *     
     */
    public LinesDeliveryStructure getLinesDelivery() {
        return linesDelivery;
    }

    /**
     * Sets the value of the linesDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesDeliveryStructure }
     *     
     */
    public void setLinesDelivery(LinesDeliveryStructure value) {
        this.linesDelivery = value;
    }

    /**
     * Gets the value of the productCategoriesDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoriesDeliveryStructure }
     *     
     */
    public ProductCategoriesDeliveryStructure getProductCategoriesDelivery() {
        return productCategoriesDelivery;
    }

    /**
     * Sets the value of the productCategoriesDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoriesDeliveryStructure }
     *     
     */
    public void setProductCategoriesDelivery(ProductCategoriesDeliveryStructure value) {
        this.productCategoriesDelivery = value;
    }

    /**
     * Gets the value of the serviceFeaturesDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeaturesDeliveryStructure }
     *     
     */
    public ServiceFeaturesDeliveryStructure getServiceFeaturesDelivery() {
        return serviceFeaturesDelivery;
    }

    /**
     * Sets the value of the serviceFeaturesDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeaturesDeliveryStructure }
     *     
     */
    public void setServiceFeaturesDelivery(ServiceFeaturesDeliveryStructure value) {
        this.serviceFeaturesDelivery = value;
    }

    /**
     * Gets the value of the vehicleFeaturesDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFeaturesDeliveryStructure }
     *     
     */
    public VehicleFeaturesDeliveryStructure getVehicleFeaturesDelivery() {
        return vehicleFeaturesDelivery;
    }

    /**
     * Sets the value of the vehicleFeaturesDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFeaturesDeliveryStructure }
     *     
     */
    public void setVehicleFeaturesDelivery(VehicleFeaturesDeliveryStructure value) {
        this.vehicleFeaturesDelivery = value;
    }

    /**
     * Gets the value of the infoChannelDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link InfoChannelDeliveryStructure }
     *     
     */
    public InfoChannelDeliveryStructure getInfoChannelDelivery() {
        return infoChannelDelivery;
    }

    /**
     * Sets the value of the infoChannelDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoChannelDeliveryStructure }
     *     
     */
    public void setInfoChannelDelivery(InfoChannelDeliveryStructure value) {
        this.infoChannelDelivery = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
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
