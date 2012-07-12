package com.elektrifi.sanctions.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
 "publshInformation",
 "screeningEntry"
})
@XmlRootElement(name = "screeningList")
public class ScreeningListXml {

 @XmlElement(required = true)
 protected ScreeningListXml.PublshInformation publshInformation;
 @XmlElement(required = true)
 protected List<ScreeningListXml.ScreeningEntry> screeningEntry;

 /**
  * Gets the value of the publshInformation property.
  * 
  * @return
  *     possible object is
  *     {@link ScreeningListXml.PublshInformation }
  *     
  */
 public ScreeningListXml.PublshInformation getPublshInformation() {
     return publshInformation;
 }

 /**
  * Sets the value of the publshInformation property.
  * 
  * @param value
  *     allowed object is
  *     {@link ScreeningListXml.PublshInformation }
  *     
  */
 public void setPublshInformation(ScreeningListXml.PublshInformation value) {
     this.publshInformation = value;
 }

 /**
  * Gets the value of the sdnEntry property.
  * 
  * <p>
  * This accessor method returns a reference to the live list,
  * not a snapshot. Therefore any modification you make to the
  * returned list will be present inside the JAXB object.
  * This is why there is not a <CODE>set</CODE> method for the sdnEntry property.
  * 
  * <p>
  * For example, to add a new item, do as follows:
  * <pre>
  *    getScreeningEntry().add(newItem);
  * </pre>
  * 
  * 
  * <p>
  * Objects of the following type(s) are allowed in the list
  * {@link ScreeningListXml.ScreeningEntry }
  * 
  * 
  */
 public List<ScreeningListXml.ScreeningEntry> getScreeningEntry() {
     if (screeningEntry == null) {
    	 screeningEntry = new ArrayList<ScreeningListXml.ScreeningEntry>();
     }
     return this.screeningEntry;
 }


 /**
  * <p>Java class for anonymous complex type.
  * 
  * <p>The following schema fragment specifies the expected content contained within this class.
  * 
  * <pre>
  * &lt;complexType>
  *   &lt;complexContent>
  *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *       &lt;sequence>
  *         &lt;element name="Publish_Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *         &lt;element name="Record_Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
  *       &lt;/sequence>
  *     &lt;/restriction>
  *   &lt;/complexContent>
  * &lt;/complexType>
  * </pre>
  * 
  * 
  */
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "", propOrder = {
     "publishDate",
     "recordCount"
 })
 public static class PublshInformation {

     @XmlElement(name = "Publish_Date")
     protected String publishDate;
     @XmlElement(name = "Record_Count")
     protected Integer recordCount;

     /**
      * Gets the value of the publishDate property.
      * 
      * @return
      *     possible object is
      *     {@link String }
      *     
      */
     public String getPublishDate() {
         return publishDate;
     }

     /**
      * Sets the value of the publishDate property.
      * 
      * @param value
      *     allowed object is
      *     {@link String }
      *     
      */
     public void setPublishDate(String value) {
         this.publishDate = value;
     }

     /**
      * Gets the value of the recordCount property.
      * 
      * @return
      *     possible object is
      *     {@link Integer }
      *     
      */
     public Integer getRecordCount() {
         return recordCount;
     }

     /**
      * Sets the value of the recordCount property.
      * 
      * @param value
      *     allowed object is
      *     {@link Integer }
      *     
      */
     public void setRecordCount(Integer value) {
         this.recordCount = value;
     }

 }


 /**
  * <p>Java class for anonymous complex type.
  * 
  * <p>The following schema fragment specifies the expected content contained within this class.
  * 
  * <pre>
  * &lt;complexType>
  *   &lt;complexContent>
  *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *       &lt;sequence>
  *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
  *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
  *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *         &lt;element name="sdnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
  *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *         &lt;element name="programList">
  *           &lt;complexType>
  *             &lt;complexContent>
  *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                 &lt;sequence>
  *                   &lt;element name="program" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
  *                 &lt;/sequence>
  *               &lt;/restriction>
  *             &lt;/complexContent>
  *           &lt;/complexType>
  *         &lt;/element>
  *         &lt;element name="idList" minOccurs="0">
  *           &lt;complexType>
  *             &lt;complexContent>
  *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                 &lt;sequence>
  *                   &lt;element name="id" maxOccurs="unbounded" minOccurs="0">
  *                     &lt;complexType>
  *                       &lt;complexContent>
  *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                           &lt;sequence>
  *                             &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
  *                             &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                             &lt;element name="idNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                             &lt;element name="idCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                             &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                             &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                           &lt;/sequence>
  *                         &lt;/restriction>
  *                       &lt;/complexContent>
  *                     &lt;/complexType>
  *                   &lt;/element>
  *                 &lt;/sequence>
  *               &lt;/restriction>
  *             &lt;/complexContent>
  *           &lt;/complexType>
  *         &lt;/element>
  *         &lt;element name="akaList" minOccurs="0">
  *           &lt;complexType>
  *             &lt;complexContent>
  *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                 &lt;sequence>
  *                   &lt;element name="aka" maxOccurs="unbounded" minOccurs="0">
  *                     &lt;complexType>
  *                       &lt;complexContent>
  *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                           &lt;sequence>
  *                             &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
  *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
  *                             &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
  *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                           &lt;/sequence>
  *                         &lt;/restriction>
  *                       &lt;/complexContent>
  *                     &lt;/complexType>
  *                   &lt;/element>
  *                 &lt;/sequence>
  *               &lt;/restriction>
  *             &lt;/complexContent>
  *           &lt;/complexType>
  *         &lt;/element>
  *         &lt;element name="addressList" minOccurs="0">
  *           &lt;complexType>
  *             &lt;complexContent>
  *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                 &lt;sequence>
  *                   &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
  *                     &lt;complexType>
  *                       &lt;complexContent>
  *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                           &lt;sequence>
  *                             &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
  *                             &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                             &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                             &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                             &lt;element name="stateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                           &lt;/sequence>
  *                         &lt;/restriction>
  *                       &lt;/complexContent>
  *                     &lt;/complexType>
  *                   &lt;/element>
  *                 &lt;/sequence>
  *               &lt;/restriction>
  *             &lt;/complexContent>
  *           &lt;/complexType>
  *         &lt;/element>
  *         &lt;element name="nationalityList" minOccurs="0">
  *           &lt;complexType>
  *             &lt;complexContent>
  *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                 &lt;sequence>
  *                   &lt;element name="nationality" maxOccurs="unbounded" minOccurs="0">
  *                     &lt;complexType>
  *                       &lt;complexContent>
  *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                           &lt;sequence>
  *                             &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
  *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
  *                             &lt;element name="mainEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
  *                           &lt;/sequence>
  *                         &lt;/restriction>
  *                       &lt;/complexContent>
  *                     &lt;/complexType>
  *                   &lt;/element>
  *                 &lt;/sequence>
  *               &lt;/restriction>
  *             &lt;/complexContent>
  *           &lt;/complexType>
  *         &lt;/element>
  *         &lt;element name="citizenshipList" minOccurs="0">
  *           &lt;complexType>
  *             &lt;complexContent>
  *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                 &lt;sequence>
  *                   &lt;element name="citizenship" maxOccurs="unbounded" minOccurs="0">
  *                     &lt;complexType>
  *                       &lt;complexContent>
  *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                           &lt;sequence>
  *                             &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
  *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
  *                             &lt;element name="mainEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
  *                           &lt;/sequence>
  *                         &lt;/restriction>
  *                       &lt;/complexContent>
  *                     &lt;/complexType>
  *                   &lt;/element>
  *                 &lt;/sequence>
  *               &lt;/restriction>
  *             &lt;/complexContent>
  *           &lt;/complexType>
  *         &lt;/element>
  *         &lt;element name="dateOfBirthList" minOccurs="0">
  *           &lt;complexType>
  *             &lt;complexContent>
  *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                 &lt;sequence>
  *                   &lt;element name="dateOfBirthItem" maxOccurs="unbounded" minOccurs="0">
  *                     &lt;complexType>
  *                       &lt;complexContent>
  *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                           &lt;sequence>
  *                             &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
  *                             &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
  *                             &lt;element name="mainEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
  *                           &lt;/sequence>
  *                         &lt;/restriction>
  *                       &lt;/complexContent>
  *                     &lt;/complexType>
  *                   &lt;/element>
  *                 &lt;/sequence>
  *               &lt;/restriction>
  *             &lt;/complexContent>
  *           &lt;/complexType>
  *         &lt;/element>
  *         &lt;element name="placeOfBirthList" minOccurs="0">
  *           &lt;complexType>
  *             &lt;complexContent>
  *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                 &lt;sequence>
  *                   &lt;element name="placeOfBirthItem" maxOccurs="unbounded" minOccurs="0">
  *                     &lt;complexType>
  *                       &lt;complexContent>
  *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                           &lt;sequence>
  *                             &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
  *                             &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
  *                             &lt;element name="mainEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
  *                           &lt;/sequence>
  *                         &lt;/restriction>
  *                       &lt;/complexContent>
  *                     &lt;/complexType>
  *                   &lt;/element>
  *                 &lt;/sequence>
  *               &lt;/restriction>
  *             &lt;/complexContent>
  *           &lt;/complexType>
  *         &lt;/element>
  *         &lt;element name="vesselInfo" minOccurs="0">
  *           &lt;complexType>
  *             &lt;complexContent>
  *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
  *                 &lt;sequence>
  *                   &lt;element name="callSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                   &lt;element name="vesselType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                   &lt;element name="vesselFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                   &lt;element name="vesselOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
  *                   &lt;element name="tonnage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
  *                   &lt;element name="grossRegisteredTonnage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
  *                 &lt;/sequence>
  *               &lt;/restriction>
  *             &lt;/complexContent>
  *           &lt;/complexType>
  *         &lt;/element>
  *       &lt;/sequence>
  *     &lt;/restriction>
  *   &lt;/complexContent>
  * &lt;/complexType>
  * </pre>
  * 
  * 
  */
 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "", propOrder = {
     "uid",
     "firstName",
     "lastName",
     "title",
     "screeningType",
     "remarks",
     "programList",
     "idList",
     "akaList",
     "addressList",
     "nationalityList",
     "citizenshipList",
     "dateOfBirthList",
     "placeOfBirthList",
     "vesselInfo"
 })
 public static class ScreeningEntry {

     protected int uid;
     protected String firstName;
     @XmlElement(required = true)
     protected String lastName;
     protected String title;
     @XmlElement(required = true)
     protected String sdnType;
     protected String remarks;
     @XmlElement(required = true)
     protected ScreeningListXml.ScreeningEntry.ProgramList programList;
     protected ScreeningListXml.ScreeningEntry.IdList idList;
     protected ScreeningListXml.ScreeningEntry.AkaList akaList;
     protected ScreeningListXml.ScreeningEntry.AddressList addressList;
     protected ScreeningListXml.ScreeningEntry.NationalityList nationalityList;
     protected ScreeningListXml.ScreeningEntry.CitizenshipList citizenshipList;
     protected ScreeningListXml.ScreeningEntry.DateOfBirthList dateOfBirthList;
     protected ScreeningListXml.ScreeningEntry.PlaceOfBirthList placeOfBirthList;
     protected ScreeningListXml.ScreeningEntry.VesselInfo vesselInfo;

     /**
      * Gets the value of the uid property.
      * 
      */
     public int getUid() {
         return uid;
     }

     /**
      * Sets the value of the uid property.
      * 
      */
     public void setUid(int value) {
         this.uid = value;
     }

     /**
      * Gets the value of the firstName property.
      * 
      * @return
      *     possible object is
      *     {@link String }
      *     
      */
     public String getFirstName() {
         return firstName;
     }

     /**
      * Sets the value of the firstName property.
      * 
      * @param value
      *     allowed object is
      *     {@link String }
      *     
      */
     public void setFirstName(String value) {
         this.firstName = value;
     }

     /**
      * Gets the value of the lastName property.
      * 
      * @return
      *     possible object is
      *     {@link String }
      *     
      */
     public String getLastName() {
         return lastName;
     }

     /**
      * Sets the value of the lastName property.
      * 
      * @param value
      *     allowed object is
      *     {@link String }
      *     
      */
     public void setLastName(String value) {
         this.lastName = value;
     }

     /**
      * Gets the value of the title property.
      * 
      * @return
      *     possible object is
      *     {@link String }
      *     
      */
     public String getTitle() {
         return title;
     }

     /**
      * Sets the value of the title property.
      * 
      * @param value
      *     allowed object is
      *     {@link String }
      *     
      */
     public void setTitle(String value) {
         this.title = value;
     }

     /**
      * Gets the value of the sdnType property.
      * 
      * @return
      *     possible object is
      *     {@link String }
      *     
      */
     public String getSdnType() {
         return sdnType;
     }

     /**
      * Sets the value of the sdnType property.
      * 
      * @param value
      *     allowed object is
      *     {@link String }
      *     
      */
     public void setSdnType(String value) {
         this.sdnType = value;
     }

     /**
      * Gets the value of the remarks property.
      * 
      * @return
      *     possible object is
      *     {@link String }
      *     
      */
     public String getRemarks() {
         return remarks;
     }

     /**
      * Sets the value of the remarks property.
      * 
      * @param value
      *     allowed object is
      *     {@link String }
      *     
      */
     public void setRemarks(String value) {
         this.remarks = value;
     }

     /**
      * Gets the value of the programList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningListXml.ScreeningEntry.ProgramList }
      *     
      */
     public ScreeningListXml.ScreeningEntry.ProgramList getProgramList() {
         return programList;
     }

     /**
      * Sets the value of the programList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningListXml.ScreeningEntry.ProgramList }
      *     
      */
     public void setProgramList(ScreeningListXml.ScreeningEntry.ProgramList value) {
         this.programList = value;
     }

     /**
      * Gets the value of the idList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningListXml.ScreeningEntry.IdList }
      *     
      */
     public ScreeningListXml.ScreeningEntry.IdList getIdList() {
         return idList;
     }

     /**
      * Sets the value of the idList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningListXml.ScreeningEntry.IdList }
      *     
      */
     public void setIdList(ScreeningListXml.ScreeningEntry.IdList value) {
         this.idList = value;
     }

     /**
      * Gets the value of the akaList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningListXml.ScreeningEntry.AkaList }
      *     
      */
     public ScreeningListXml.ScreeningEntry.AkaList getAkaList() {
         return akaList;
     }

     /**
      * Sets the value of the akaList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningListXml.ScreeningEntry.AkaList }
      *     
      */
     public void setAkaList(ScreeningListXml.ScreeningEntry.AkaList value) {
         this.akaList = value;
     }

     /**
      * Gets the value of the addressList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningListXml.ScreeningEntry.AddressList }
      *     
      */
     public ScreeningListXml.ScreeningEntry.AddressList getAddressList() {
         return addressList;
     }

     /**
      * Sets the value of the addressList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningListXml.ScreeningEntry.AddressList }
      *     
      */
     public void setAddressList(ScreeningListXml.ScreeningEntry.AddressList value) {
         this.addressList = value;
     }

     /**
      * Gets the value of the nationalityList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningListXml.ScreeningEntry.NationalityList }
      *     
      */
     public ScreeningListXml.ScreeningEntry.NationalityList getNationalityList() {
         return nationalityList;
     }

     /**
      * Sets the value of the nationalityList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningListXml.ScreeningEntry.NationalityList }
      *     
      */
     public void setNationalityList(ScreeningListXml.ScreeningEntry.NationalityList value) {
         this.nationalityList = value;
     }

     /**
      * Gets the value of the citizenshipList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningListXml.ScreeningEntry.CitizenshipList }
      *     
      */
     public ScreeningListXml.ScreeningEntry.CitizenshipList getCitizenshipList() {
         return citizenshipList;
     }

     /**
      * Sets the value of the citizenshipList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningListXml.ScreeningEntry.CitizenshipList }
      *     
      */
     public void setCitizenshipList(ScreeningListXml.ScreeningEntry.CitizenshipList value) {
         this.citizenshipList = value;
     }

     /**
      * Gets the value of the dateOfBirthList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningListXml.ScreeningEntry.DateOfBirthList }
      *     
      */
     public ScreeningListXml.ScreeningEntry.DateOfBirthList getDateOfBirthList() {
         return dateOfBirthList;
     }

     /**
      * Sets the value of the dateOfBirthList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningListXml.ScreeningEntry.DateOfBirthList }
      *     
      */
     public void setDateOfBirthList(ScreeningListXml.ScreeningEntry.DateOfBirthList value) {
         this.dateOfBirthList = value;
     }

     /**
      * Gets the value of the placeOfBirthList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningListXml.ScreeningEntry.PlaceOfBirthList }
      *     
      */
     public ScreeningListXml.ScreeningEntry.PlaceOfBirthList getPlaceOfBirthList() {
         return placeOfBirthList;
     }

     /**
      * Sets the value of the placeOfBirthList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningListXml.ScreeningEntry.PlaceOfBirthList }
      *     
      */
     public void setPlaceOfBirthList(ScreeningListXml.ScreeningEntry.PlaceOfBirthList value) {
         this.placeOfBirthList = value;
     }

     /**
      * Gets the value of the vesselInfo property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningListXml.ScreeningEntry.VesselInfo }
      *     
      */
     public ScreeningListXml.ScreeningEntry.VesselInfo getVesselInfo() {
         return vesselInfo;
     }

     /**
      * Sets the value of the vesselInfo property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningListXml.ScreeningEntry.VesselInfo }
      *     
      */
     public void setVesselInfo(ScreeningListXml.ScreeningEntry.VesselInfo value) {
         this.vesselInfo = value;
     }


     /**
      * <p>Java class for anonymous complex type.
      * 
      * <p>The following schema fragment specifies the expected content contained within this class.
      * 
      * <pre>
      * &lt;complexType>
      *   &lt;complexContent>
      *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *       &lt;sequence>
      *         &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
      *           &lt;complexType>
      *             &lt;complexContent>
      *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *                 &lt;sequence>
      *                   &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
      *                   &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                   &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                   &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                   &lt;element name="stateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                 &lt;/sequence>
      *               &lt;/restriction>
      *             &lt;/complexContent>
      *           &lt;/complexType>
      *         &lt;/element>
      *       &lt;/sequence>
      *     &lt;/restriction>
      *   &lt;/complexContent>
      * &lt;/complexType>
      * </pre>
      * 
      * 
      */
     @XmlAccessorType(XmlAccessType.FIELD)
     @XmlType(name = "", propOrder = {
         "address"
     })
     public static class AddressList {

         protected List<ScreeningListXml.ScreeningEntry.AddressList.Address> address;

         /**
          * Gets the value of the address property.
          * 
          * <p>
          * This accessor method returns a reference to the live list,
          * not a snapshot. Therefore any modification you make to the
          * returned list will be present inside the JAXB object.
          * This is why there is not a <CODE>set</CODE> method for the address property.
          * 
          * <p>
          * For example, to add a new item, do as follows:
          * <pre>
          *    getAddress().add(newItem);
          * </pre>
          * 
          * 
          * <p>
          * Objects of the following type(s) are allowed in the list
          * {@link ScreeningListXml.ScreeningEntry.AddressList.Address }
          * 
          * 
          */
         public List<ScreeningListXml.ScreeningEntry.AddressList.Address> getAddress() {
             if (address == null) {
                 address = new ArrayList<ScreeningListXml.ScreeningEntry.AddressList.Address>();
             }
             return this.address;
         }


         /**
          * <p>Java class for anonymous complex type.
          * 
          * <p>The following schema fragment specifies the expected content contained within this class.
          * 
          * <pre>
          * &lt;complexType>
          *   &lt;complexContent>
          *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
          *       &lt;sequence>
          *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
          *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *         &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *         &lt;element name="stateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *       &lt;/sequence>
          *     &lt;/restriction>
          *   &lt;/complexContent>
          * &lt;/complexType>
          * </pre>
          * 
          * 
          */
         @XmlAccessorType(XmlAccessType.FIELD)
         @XmlType(name = "", propOrder = {
             "uid",
             "address1",
             "address2",
             "address3",
             "city",
             "stateOrProvince",
             "postalCode",
             "country"
         })
         public static class Address {

             protected int uid;
             protected String address1;
             protected String address2;
             protected String address3;
             protected String city;
             protected String stateOrProvince;
             protected String postalCode;
             protected String country;

             /**
              * Gets the value of the uid property.
              * 
              */
             public int getUid() {
                 return uid;
             }

             /**
              * Sets the value of the uid property.
              * 
              */
             public void setUid(int value) {
                 this.uid = value;
             }

             /**
              * Gets the value of the address1 property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getAddress1() {
                 return address1;
             }

             /**
              * Sets the value of the address1 property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setAddress1(String value) {
                 this.address1 = value;
             }

             /**
              * Gets the value of the address2 property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getAddress2() {
                 return address2;
             }

             /**
              * Sets the value of the address2 property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setAddress2(String value) {
                 this.address2 = value;
             }

             /**
              * Gets the value of the address3 property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getAddress3() {
                 return address3;
             }

             /**
              * Sets the value of the address3 property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setAddress3(String value) {
                 this.address3 = value;
             }

             /**
              * Gets the value of the city property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getCity() {
                 return city;
             }

             /**
              * Sets the value of the city property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setCity(String value) {
                 this.city = value;
             }

             /**
              * Gets the value of the stateOrProvince property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getStateOrProvince() {
                 return stateOrProvince;
             }

             /**
              * Sets the value of the stateOrProvince property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setStateOrProvince(String value) {
                 this.stateOrProvince = value;
             }

             /**
              * Gets the value of the postalCode property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getPostalCode() {
                 return postalCode;
             }

             /**
              * Sets the value of the postalCode property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setPostalCode(String value) {
                 this.postalCode = value;
             }

             /**
              * Gets the value of the country property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getCountry() {
                 return country;
             }

             /**
              * Sets the value of the country property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setCountry(String value) {
                 this.country = value;
             }

         }

     }


     /**
      * <p>Java class for anonymous complex type.
      * 
      * <p>The following schema fragment specifies the expected content contained within this class.
      * 
      * <pre>
      * &lt;complexType>
      *   &lt;complexContent>
      *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *       &lt;sequence>
      *         &lt;element name="aka" maxOccurs="unbounded" minOccurs="0">
      *           &lt;complexType>
      *             &lt;complexContent>
      *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *                 &lt;sequence>
      *                   &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
      *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
      *                   &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
      *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                 &lt;/sequence>
      *               &lt;/restriction>
      *             &lt;/complexContent>
      *           &lt;/complexType>
      *         &lt;/element>
      *       &lt;/sequence>
      *     &lt;/restriction>
      *   &lt;/complexContent>
      * &lt;/complexType>
      * </pre>
      * 
      * 
      */
     @XmlAccessorType(XmlAccessType.FIELD)
     @XmlType(name = "", propOrder = {
         "aka"
     })
     public static class AkaList {

         protected List<ScreeningListXml.ScreeningEntry.AkaList.Aka> aka;

         /**
          * Gets the value of the aka property.
          * 
          * <p>
          * This accessor method returns a reference to the live list,
          * not a snapshot. Therefore any modification you make to the
          * returned list will be present inside the JAXB object.
          * This is why there is not a <CODE>set</CODE> method for the aka property.
          * 
          * <p>
          * For example, to add a new item, do as follows:
          * <pre>
          *    getAka().add(newItem);
          * </pre>
          * 
          * 
          * <p>
          * Objects of the following type(s) are allowed in the list
          * {@link ScreeningListXml.ScreeningEntry.AkaList.Aka }
          * 
          * 
          */
         public List<ScreeningListXml.ScreeningEntry.AkaList.Aka> getAka() {
             if (aka == null) {
                 aka = new ArrayList<ScreeningListXml.ScreeningEntry.AkaList.Aka>();
             }
             return this.aka;
         }


         /**
          * <p>Java class for anonymous complex type.
          * 
          * <p>The following schema fragment specifies the expected content contained within this class.
          * 
          * <pre>
          * &lt;complexType>
          *   &lt;complexContent>
          *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
          *       &lt;sequence>
          *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
          *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
          *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
          *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *       &lt;/sequence>
          *     &lt;/restriction>
          *   &lt;/complexContent>
          * &lt;/complexType>
          * </pre>
          * 
          * 
          */
         @XmlAccessorType(XmlAccessType.FIELD)
         @XmlType(name = "", propOrder = {
             "uid",
             "type",
             "category",
             "lastName",
             "firstName"
         })
         public static class Aka {

             protected int uid;
             @XmlElement(required = true)
             protected String type;
             @XmlElement(required = true)
             protected String category;
             protected String lastName;
             protected String firstName;

             /**
              * Gets the value of the uid property.
              * 
              */
             public int getUid() {
                 return uid;
             }

             /**
              * Sets the value of the uid property.
              * 
              */
             public void setUid(int value) {
                 this.uid = value;
             }

             /**
              * Gets the value of the type property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getType() {
                 return type;
             }

             /**
              * Sets the value of the type property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setType(String value) {
                 this.type = value;
             }

             /**
              * Gets the value of the category property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getCategory() {
                 return category;
             }

             /**
              * Sets the value of the category property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setCategory(String value) {
                 this.category = value;
             }

             /**
              * Gets the value of the lastName property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getLastName() {
                 return lastName;
             }

             /**
              * Sets the value of the lastName property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setLastName(String value) {
                 this.lastName = value;
             }

             /**
              * Gets the value of the firstName property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getFirstName() {
                 return firstName;
             }

             /**
              * Sets the value of the firstName property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setFirstName(String value) {
                 this.firstName = value;
             }

         }

     }


     /**
      * <p>Java class for anonymous complex type.
      * 
      * <p>The following schema fragment specifies the expected content contained within this class.
      * 
      * <pre>
      * &lt;complexType>
      *   &lt;complexContent>
      *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *       &lt;sequence>
      *         &lt;element name="citizenship" maxOccurs="unbounded" minOccurs="0">
      *           &lt;complexType>
      *             &lt;complexContent>
      *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *                 &lt;sequence>
      *                   &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
      *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
      *                   &lt;element name="mainEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
      *                 &lt;/sequence>
      *               &lt;/restriction>
      *             &lt;/complexContent>
      *           &lt;/complexType>
      *         &lt;/element>
      *       &lt;/sequence>
      *     &lt;/restriction>
      *   &lt;/complexContent>
      * &lt;/complexType>
      * </pre>
      * 
      * 
      */
     @XmlAccessorType(XmlAccessType.FIELD)
     @XmlType(name = "", propOrder = {
         "citizenship"
     })
     public static class CitizenshipList {

         protected List<ScreeningListXml.ScreeningEntry.CitizenshipList.Citizenship> citizenship;

         /**
          * Gets the value of the citizenship property.
          * 
          * <p>
          * This accessor method returns a reference to the live list,
          * not a snapshot. Therefore any modification you make to the
          * returned list will be present inside the JAXB object.
          * This is why there is not a <CODE>set</CODE> method for the citizenship property.
          * 
          * <p>
          * For example, to add a new item, do as follows:
          * <pre>
          *    getCitizenship().add(newItem);
          * </pre>
          * 
          * 
          * <p>
          * Objects of the following type(s) are allowed in the list
          * {@link ScreeningListXml.ScreeningEntry.CitizenshipList.Citizenship }
          * 
          * 
          */
         public List<ScreeningListXml.ScreeningEntry.CitizenshipList.Citizenship> getCitizenship() {
             if (citizenship == null) {
                 citizenship = new ArrayList<ScreeningListXml.ScreeningEntry.CitizenshipList.Citizenship>();
             }
             return this.citizenship;
         }


         /**
          * <p>Java class for anonymous complex type.
          * 
          * <p>The following schema fragment specifies the expected content contained within this class.
          * 
          * <pre>
          * &lt;complexType>
          *   &lt;complexContent>
          *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
          *       &lt;sequence>
          *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
          *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
          *         &lt;element name="mainEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
          *       &lt;/sequence>
          *     &lt;/restriction>
          *   &lt;/complexContent>
          * &lt;/complexType>
          * </pre>
          * 
          * 
          */
         @XmlAccessorType(XmlAccessType.FIELD)
         @XmlType(name = "", propOrder = {
             "uid",
             "country",
             "mainEntry"
         })
         public static class Citizenship {

             protected int uid;
             @XmlElement(required = true)
             protected String country;
             protected boolean mainEntry;

             /**
              * Gets the value of the uid property.
              * 
              */
             public int getUid() {
                 return uid;
             }

             /**
              * Sets the value of the uid property.
              * 
              */
             public void setUid(int value) {
                 this.uid = value;
             }

             /**
              * Gets the value of the country property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getCountry() {
                 return country;
             }

             /**
              * Sets the value of the country property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setCountry(String value) {
                 this.country = value;
             }

             /**
              * Gets the value of the mainEntry property.
              * 
              */
             public boolean isMainEntry() {
                 return mainEntry;
             }

             /**
              * Sets the value of the mainEntry property.
              * 
              */
             public void setMainEntry(boolean value) {
                 this.mainEntry = value;
             }

         }

     }


     /**
      * <p>Java class for anonymous complex type.
      * 
      * <p>The following schema fragment specifies the expected content contained within this class.
      * 
      * <pre>
      * &lt;complexType>
      *   &lt;complexContent>
      *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *       &lt;sequence>
      *         &lt;element name="dateOfBirthItem" maxOccurs="unbounded" minOccurs="0">
      *           &lt;complexType>
      *             &lt;complexContent>
      *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *                 &lt;sequence>
      *                   &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
      *                   &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
      *                   &lt;element name="mainEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
      *                 &lt;/sequence>
      *               &lt;/restriction>
      *             &lt;/complexContent>
      *           &lt;/complexType>
      *         &lt;/element>
      *       &lt;/sequence>
      *     &lt;/restriction>
      *   &lt;/complexContent>
      * &lt;/complexType>
      * </pre>
      * 
      * 
      */
     @XmlAccessorType(XmlAccessType.FIELD)
     @XmlType(name = "", propOrder = {
         "dateOfBirthItem"
     })
     public static class DateOfBirthList {

         protected List<ScreeningListXml.ScreeningEntry.DateOfBirthList.DateOfBirthItem> dateOfBirthItem;

         /**
          * Gets the value of the dateOfBirthItem property.
          * 
          * <p>
          * This accessor method returns a reference to the live list,
          * not a snapshot. Therefore any modification you make to the
          * returned list will be present inside the JAXB object.
          * This is why there is not a <CODE>set</CODE> method for the dateOfBirthItem property.
          * 
          * <p>
          * For example, to add a new item, do as follows:
          * <pre>
          *    getDateOfBirthItem().add(newItem);
          * </pre>
          * 
          * 
          * <p>
          * Objects of the following type(s) are allowed in the list
          * {@link ScreeningListXml.ScreeningEntry.DateOfBirthList.DateOfBirthItem }
          * 
          * 
          */
         public List<ScreeningListXml.ScreeningEntry.DateOfBirthList.DateOfBirthItem> getDateOfBirthItem() {
             if (dateOfBirthItem == null) {
                 dateOfBirthItem = new ArrayList<ScreeningListXml.ScreeningEntry.DateOfBirthList.DateOfBirthItem>();
             }
             return this.dateOfBirthItem;
         }


         /**
          * <p>Java class for anonymous complex type.
          * 
          * <p>The following schema fragment specifies the expected content contained within this class.
          * 
          * <pre>
          * &lt;complexType>
          *   &lt;complexContent>
          *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
          *       &lt;sequence>
          *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
          *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
          *         &lt;element name="mainEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
          *       &lt;/sequence>
          *     &lt;/restriction>
          *   &lt;/complexContent>
          * &lt;/complexType>
          * </pre>
          * 
          * 
          */
         @XmlAccessorType(XmlAccessType.FIELD)
         @XmlType(name = "", propOrder = {
             "uid",
             "dateOfBirth",
             "mainEntry"
         })
         public static class DateOfBirthItem {

             protected int uid;
             @XmlElement(required = true)
             protected String dateOfBirth;
             protected boolean mainEntry;

             /**
              * Gets the value of the uid property.
              * 
              */
             public int getUid() {
                 return uid;
             }

             /**
              * Sets the value of the uid property.
              * 
              */
             public void setUid(int value) {
                 this.uid = value;
             }

             /**
              * Gets the value of the dateOfBirth property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getDateOfBirth() {
                 return dateOfBirth;
             }

             /**
              * Sets the value of the dateOfBirth property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setDateOfBirth(String value) {
                 this.dateOfBirth = value;
             }

             /**
              * Gets the value of the mainEntry property.
              * 
              */
             public boolean isMainEntry() {
                 return mainEntry;
             }

             /**
              * Sets the value of the mainEntry property.
              * 
              */
             public void setMainEntry(boolean value) {
                 this.mainEntry = value;
             }

         }

     }


     /**
      * <p>Java class for anonymous complex type.
      * 
      * <p>The following schema fragment specifies the expected content contained within this class.
      * 
      * <pre>
      * &lt;complexType>
      *   &lt;complexContent>
      *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *       &lt;sequence>
      *         &lt;element name="id" maxOccurs="unbounded" minOccurs="0">
      *           &lt;complexType>
      *             &lt;complexContent>
      *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *                 &lt;sequence>
      *                   &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
      *                   &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                   &lt;element name="idNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                   &lt;element name="idCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                   &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                   &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *                 &lt;/sequence>
      *               &lt;/restriction>
      *             &lt;/complexContent>
      *           &lt;/complexType>
      *         &lt;/element>
      *       &lt;/sequence>
      *     &lt;/restriction>
      *   &lt;/complexContent>
      * &lt;/complexType>
      * </pre>
      * 
      * 
      */
     @XmlAccessorType(XmlAccessType.FIELD)
     @XmlType(name = "", propOrder = {
         "id"
     })
     public static class IdList {

         protected List<ScreeningListXml.ScreeningEntry.IdList.Id> id;

         /**
          * Gets the value of the id property.
          * 
          * <p>
          * This accessor method returns a reference to the live list,
          * not a snapshot. Therefore any modification you make to the
          * returned list will be present inside the JAXB object.
          * This is why there is not a <CODE>set</CODE> method for the id property.
          * 
          * <p>
          * For example, to add a new item, do as follows:
          * <pre>
          *    getId().add(newItem);
          * </pre>
          * 
          * 
          * <p>
          * Objects of the following type(s) are allowed in the list
          * {@link ScreeningListXml.ScreeningEntry.IdList.Id }
          * 
          * 
          */
         public List<ScreeningListXml.ScreeningEntry.IdList.Id> getId() {
             if (id == null) {
                 id = new ArrayList<ScreeningListXml.ScreeningEntry.IdList.Id>();
             }
             return this.id;
         }


         /**
          * <p>Java class for anonymous complex type.
          * 
          * <p>The following schema fragment specifies the expected content contained within this class.
          * 
          * <pre>
          * &lt;complexType>
          *   &lt;complexContent>
          *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
          *       &lt;sequence>
          *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
          *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *         &lt;element name="idNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *         &lt;element name="idCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
          *       &lt;/sequence>
          *     &lt;/restriction>
          *   &lt;/complexContent>
          * &lt;/complexType>
          * </pre>
          * 
          * 
          */
         @XmlAccessorType(XmlAccessType.FIELD)
         @XmlType(name = "", propOrder = {
             "uid",
             "idType",
             "idNumber",
             "idCountry",
             "issueDate",
             "expirationDate"
         })
         public static class Id {

             protected int uid;
             protected String idType;
             protected String idNumber;
             protected String idCountry;
             protected String issueDate;
             protected String expirationDate;

             /**
              * Gets the value of the uid property.
              * 
              */
             public int getUid() {
                 return uid;
             }

             /**
              * Sets the value of the uid property.
              * 
              */
             public void setUid(int value) {
                 this.uid = value;
             }

             /**
              * Gets the value of the idType property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getIdType() {
                 return idType;
             }

             /**
              * Sets the value of the idType property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setIdType(String value) {
                 this.idType = value;
             }

             /**
              * Gets the value of the idNumber property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getIdNumber() {
                 return idNumber;
             }

             /**
              * Sets the value of the idNumber property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setIdNumber(String value) {
                 this.idNumber = value;
             }

             /**
              * Gets the value of the idCountry property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getIdCountry() {
                 return idCountry;
             }

             /**
              * Sets the value of the idCountry property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setIdCountry(String value) {
                 this.idCountry = value;
             }

             /**
              * Gets the value of the issueDate property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getIssueDate() {
                 return issueDate;
             }

             /**
              * Sets the value of the issueDate property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setIssueDate(String value) {
                 this.issueDate = value;
             }

             /**
              * Gets the value of the expirationDate property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getExpirationDate() {
                 return expirationDate;
             }

             /**
              * Sets the value of the expirationDate property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setExpirationDate(String value) {
                 this.expirationDate = value;
             }

         }

     }


     /**
      * <p>Java class for anonymous complex type.
      * 
      * <p>The following schema fragment specifies the expected content contained within this class.
      * 
      * <pre>
      * &lt;complexType>
      *   &lt;complexContent>
      *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *       &lt;sequence>
      *         &lt;element name="nationality" maxOccurs="unbounded" minOccurs="0">
      *           &lt;complexType>
      *             &lt;complexContent>
      *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *                 &lt;sequence>
      *                   &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
      *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
      *                   &lt;element name="mainEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
      *                 &lt;/sequence>
      *               &lt;/restriction>
      *             &lt;/complexContent>
      *           &lt;/complexType>
      *         &lt;/element>
      *       &lt;/sequence>
      *     &lt;/restriction>
      *   &lt;/complexContent>
      * &lt;/complexType>
      * </pre>
      * 
      * 
      */
     @XmlAccessorType(XmlAccessType.FIELD)
     @XmlType(name = "", propOrder = {
         "nationality"
     })
     public static class NationalityList {

         protected List<ScreeningListXml.ScreeningEntry.NationalityList.Nationality> nationality;

         /**
          * Gets the value of the nationality property.
          * 
          * <p>
          * This accessor method returns a reference to the live list,
          * not a snapshot. Therefore any modification you make to the
          * returned list will be present inside the JAXB object.
          * This is why there is not a <CODE>set</CODE> method for the nationality property.
          * 
          * <p>
          * For example, to add a new item, do as follows:
          * <pre>
          *    getNationality().add(newItem);
          * </pre>
          * 
          * 
          * <p>
          * Objects of the following type(s) are allowed in the list
          * {@link ScreeningListXml.ScreeningEntry.NationalityList.Nationality }
          * 
          * 
          */
         public List<ScreeningListXml.ScreeningEntry.NationalityList.Nationality> getNationality() {
             if (nationality == null) {
                 nationality = new ArrayList<ScreeningListXml.ScreeningEntry.NationalityList.Nationality>();
             }
             return this.nationality;
         }


         /**
          * <p>Java class for anonymous complex type.
          * 
          * <p>The following schema fragment specifies the expected content contained within this class.
          * 
          * <pre>
          * &lt;complexType>
          *   &lt;complexContent>
          *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
          *       &lt;sequence>
          *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
          *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
          *         &lt;element name="mainEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
          *       &lt;/sequence>
          *     &lt;/restriction>
          *   &lt;/complexContent>
          * &lt;/complexType>
          * </pre>
          * 
          * 
          */
         @XmlAccessorType(XmlAccessType.FIELD)
         @XmlType(name = "", propOrder = {
             "uid",
             "country",
             "mainEntry"
         })
         public static class Nationality {

             protected int uid;
             @XmlElement(required = true)
             protected String country;
             protected boolean mainEntry;

             /**
              * Gets the value of the uid property.
              * 
              */
             public int getUid() {
                 return uid;
             }

             /**
              * Sets the value of the uid property.
              * 
              */
             public void setUid(int value) {
                 this.uid = value;
             }

             /**
              * Gets the value of the country property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getCountry() {
                 return country;
             }

             /**
              * Sets the value of the country property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setCountry(String value) {
                 this.country = value;
             }

             /**
              * Gets the value of the mainEntry property.
              * 
              */
             public boolean isMainEntry() {
                 return mainEntry;
             }

             /**
              * Sets the value of the mainEntry property.
              * 
              */
             public void setMainEntry(boolean value) {
                 this.mainEntry = value;
             }

         }

     }


     /**
      * <p>Java class for anonymous complex type.
      * 
      * <p>The following schema fragment specifies the expected content contained within this class.
      * 
      * <pre>
      * &lt;complexType>
      *   &lt;complexContent>
      *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *       &lt;sequence>
      *         &lt;element name="placeOfBirthItem" maxOccurs="unbounded" minOccurs="0">
      *           &lt;complexType>
      *             &lt;complexContent>
      *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *                 &lt;sequence>
      *                   &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
      *                   &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
      *                   &lt;element name="mainEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
      *                 &lt;/sequence>
      *               &lt;/restriction>
      *             &lt;/complexContent>
      *           &lt;/complexType>
      *         &lt;/element>
      *       &lt;/sequence>
      *     &lt;/restriction>
      *   &lt;/complexContent>
      * &lt;/complexType>
      * </pre>
      * 
      * 
      */
     @XmlAccessorType(XmlAccessType.FIELD)
     @XmlType(name = "", propOrder = {
         "placeOfBirthItem"
     })
     public static class PlaceOfBirthList {

         protected List<ScreeningListXml.ScreeningEntry.PlaceOfBirthList.PlaceOfBirthItem> placeOfBirthItem;

         /**
          * Gets the value of the placeOfBirthItem property.
          * 
          * <p>
          * This accessor method returns a reference to the live list,
          * not a snapshot. Therefore any modification you make to the
          * returned list will be present inside the JAXB object.
          * This is why there is not a <CODE>set</CODE> method for the placeOfBirthItem property.
          * 
          * <p>
          * For example, to add a new item, do as follows:
          * <pre>
          *    getPlaceOfBirthItem().add(newItem);
          * </pre>
          * 
          * 
          * <p>
          * Objects of the following type(s) are allowed in the list
          * {@link ScreeningListXml.ScreeningEntry.PlaceOfBirthList.PlaceOfBirthItem }
          * 
          * 
          */
         public List<ScreeningListXml.ScreeningEntry.PlaceOfBirthList.PlaceOfBirthItem> getPlaceOfBirthItem() {
             if (placeOfBirthItem == null) {
                 placeOfBirthItem = new ArrayList<ScreeningListXml.ScreeningEntry.PlaceOfBirthList.PlaceOfBirthItem>();
             }
             return this.placeOfBirthItem;
         }


         /**
          * <p>Java class for anonymous complex type.
          * 
          * <p>The following schema fragment specifies the expected content contained within this class.
          * 
          * <pre>
          * &lt;complexType>
          *   &lt;complexContent>
          *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
          *       &lt;sequence>
          *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}int"/>
          *         &lt;element name="placeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
          *         &lt;element name="mainEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
          *       &lt;/sequence>
          *     &lt;/restriction>
          *   &lt;/complexContent>
          * &lt;/complexType>
          * </pre>
          * 
          * 
          */
         @XmlAccessorType(XmlAccessType.FIELD)
         @XmlType(name = "", propOrder = {
             "uid",
             "placeOfBirth",
             "mainEntry"
         })
         public static class PlaceOfBirthItem {

             protected int uid;
             @XmlElement(required = true)
             protected String placeOfBirth;
             protected boolean mainEntry;

             /**
              * Gets the value of the uid property.
              * 
              */
             public int getUid() {
                 return uid;
             }

             /**
              * Sets the value of the uid property.
              * 
              */
             public void setUid(int value) {
                 this.uid = value;
             }

             /**
              * Gets the value of the placeOfBirth property.
              * 
              * @return
              *     possible object is
              *     {@link String }
              *     
              */
             public String getPlaceOfBirth() {
                 return placeOfBirth;
             }

             /**
              * Sets the value of the placeOfBirth property.
              * 
              * @param value
              *     allowed object is
              *     {@link String }
              *     
              */
             public void setPlaceOfBirth(String value) {
                 this.placeOfBirth = value;
             }

             /**
              * Gets the value of the mainEntry property.
              * 
              */
             public boolean isMainEntry() {
                 return mainEntry;
             }

             /**
              * Sets the value of the mainEntry property.
              * 
              */
             public void setMainEntry(boolean value) {
                 this.mainEntry = value;
             }

         }

     }


     /**
      * <p>Java class for anonymous complex type.
      * 
      * <p>The following schema fragment specifies the expected content contained within this class.
      * 
      * <pre>
      * &lt;complexType>
      *   &lt;complexContent>
      *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *       &lt;sequence>
      *         &lt;element name="program" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
      *       &lt;/sequence>
      *     &lt;/restriction>
      *   &lt;/complexContent>
      * &lt;/complexType>
      * </pre>
      * 
      * 
      */
     @XmlAccessorType(XmlAccessType.FIELD)
     @XmlType(name = "", propOrder = {
         "program"
     })
     public static class ProgramList {

         protected List<String> program;

         /**
          * Gets the value of the program property.
          * 
          * <p>
          * This accessor method returns a reference to the live list,
          * not a snapshot. Therefore any modification you make to the
          * returned list will be present inside the JAXB object.
          * This is why there is not a <CODE>set</CODE> method for the program property.
          * 
          * <p>
          * For example, to add a new item, do as follows:
          * <pre>
          *    getProgram().add(newItem);
          * </pre>
          * 
          * 
          * <p>
          * Objects of the following type(s) are allowed in the list
          * {@link String }
          * 
          * 
          */
         public List<String> getProgram() {
             if (program == null) {
                 program = new ArrayList<String>();
             }
             return this.program;
         }

     }


     /**
      * <p>Java class for anonymous complex type.
      * 
      * <p>The following schema fragment specifies the expected content contained within this class.
      * 
      * <pre>
      * &lt;complexType>
      *   &lt;complexContent>
      *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      *       &lt;sequence>
      *         &lt;element name="callSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *         &lt;element name="vesselType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *         &lt;element name="vesselFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *         &lt;element name="vesselOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
      *         &lt;element name="tonnage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
      *         &lt;element name="grossRegisteredTonnage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
      *       &lt;/sequence>
      *     &lt;/restriction>
      *   &lt;/complexContent>
      * &lt;/complexType>
      * </pre>
      * 
      * 
      */
     @XmlAccessorType(XmlAccessType.FIELD)
     @XmlType(name = "", propOrder = {
         "callSign",
         "vesselType",
         "vesselFlag",
         "vesselOwner",
         "tonnage",
         "grossRegisteredTonnage"
     })
     public static class VesselInfo {

         protected String callSign;
         protected String vesselType;
         protected String vesselFlag;
         protected String vesselOwner;
         protected Integer tonnage;
         protected Integer grossRegisteredTonnage;

         /**
          * Gets the value of the callSign property.
          * 
          * @return
          *     possible object is
          *     {@link String }
          *     
          */
         public String getCallSign() {
             return callSign;
         }

         /**
          * Sets the value of the callSign property.
          * 
          * @param value
          *     allowed object is
          *     {@link String }
          *     
          */
         public void setCallSign(String value) {
             this.callSign = value;
         }

         /**
          * Gets the value of the vesselType property.
          * 
          * @return
          *     possible object is
          *     {@link String }
          *     
          */
         public String getVesselType() {
             return vesselType;
         }

         /**
          * Sets the value of the vesselType property.
          * 
          * @param value
          *     allowed object is
          *     {@link String }
          *     
          */
         public void setVesselType(String value) {
             this.vesselType = value;
         }

         /**
          * Gets the value of the vesselFlag property.
          * 
          * @return
          *     possible object is
          *     {@link String }
          *     
          */
         public String getVesselFlag() {
             return vesselFlag;
         }

         /**
          * Sets the value of the vesselFlag property.
          * 
          * @param value
          *     allowed object is
          *     {@link String }
          *     
          */
         public void setVesselFlag(String value) {
             this.vesselFlag = value;
         }

         /**
          * Gets the value of the vesselOwner property.
          * 
          * @return
          *     possible object is
          *     {@link String }
          *     
          */
         public String getVesselOwner() {
             return vesselOwner;
         }

         /**
          * Sets the value of the vesselOwner property.
          * 
          * @param value
          *     allowed object is
          *     {@link String }
          *     
          */
         public void setVesselOwner(String value) {
             this.vesselOwner = value;
         }

         /**
          * Gets the value of the tonnage property.
          * 
          * @return
          *     possible object is
          *     {@link Integer }
          *     
          */
         public Integer getTonnage() {
             return tonnage;
         }

         /**
          * Sets the value of the tonnage property.
          * 
          * @param value
          *     allowed object is
          *     {@link Integer }
          *     
          */
         public void setTonnage(Integer value) {
             this.tonnage = value;
         }

         /**
          * Gets the value of the grossRegisteredTonnage property.
          * 
          * @return
          *     possible object is
          *     {@link Integer }
          *     
          */
         public Integer getGrossRegisteredTonnage() {
             return grossRegisteredTonnage;
         }

         /**
          * Sets the value of the grossRegisteredTonnage property.
          * 
          * @param value
          *     allowed object is
          *     {@link Integer }
          *     
          */
         public void setGrossRegisteredTonnage(Integer value) {
             this.grossRegisteredTonnage = value;
         }

     }

 }

}