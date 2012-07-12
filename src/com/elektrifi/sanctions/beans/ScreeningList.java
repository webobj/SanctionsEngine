package com.elektrifi.sanctions.beans;

import java.util.ArrayList;
import java.util.List;

//import org.tempuri.sdnlist.SdnList;

public class ScreeningList {

 protected ScreeningList.PublshInformation publshInformation;
 protected List<ScreeningList.ScreeningEntry> screeningEntry;

 /**
  * Gets the value of the publshInformation property.
  * 
  * @return
  *     possible object is
  *     {@link ScreeningList.PublshInformation }
  *     
  */
 public ScreeningList.PublshInformation getPublshInformation() {
     return publshInformation;
 }

 /**
  * Sets the value of the publshInformation property.
  * 
  * @param value
  *     allowed object is
  *     {@link ScreeningList.PublshInformation }
  *     
  */
 public void setPublshInformation(ScreeningList.PublshInformation value) {
     this.publshInformation = value;
 }

 /**
  * Gets the value of the screeningEntry property.
  * 
  * <p>
  * This accessor method returns a reference to the live list,
  * not a snapshot. Therefore any modification you make to the
  * returned list will be present inside the JAXB object.
  * This is why there is not a <CODE>set</CODE> method for the screeningEntry property.
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
  * {@link ScreeningList.ScreeningEntry }
  * 
  * 
  */
 public List<ScreeningList.ScreeningEntry> getScreeningEntry() {
     if (screeningEntry == null) {
    	 screeningEntry = new ArrayList<ScreeningList.ScreeningEntry>();
     }
     return this.screeningEntry;
 }
  
 public static class PublshInformation {

     protected String publishDate;
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


 
 public static class ScreeningEntry {

     protected int uid;
     protected String firstName;
     protected String lastName;
     protected String title;
     protected String screeningType;
     protected String remarks;
     protected ScreeningList.ScreeningEntry.ProgramList programList;
     protected ScreeningList.ScreeningEntry.IdList idList;
     protected ScreeningList.ScreeningEntry.AkaList akaList;
     protected ScreeningList.ScreeningEntry.AddressList addressList;
     protected ScreeningList.ScreeningEntry.NationalityList nationalityList;
     protected ScreeningList.ScreeningEntry.CitizenshipList citizenshipList;
     protected ScreeningList.ScreeningEntry.DateOfBirthList dateOfBirthList;
     protected ScreeningList.ScreeningEntry.PlaceOfBirthList placeOfBirthList;
     protected ScreeningList.ScreeningEntry.VesselInfo vesselInfo;

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
      * Gets the value of the screeningType property.
      * 
      * @return
      *     possible object is
      *     {@link String }
      *     
      */
     public String getScreeningType() {
         return screeningType;
     }

     /**
      * Sets the value of the screeningType property.
      * 
      * @param value
      *     allowed object is
      *     {@link String }
      *     
      */
     public void setScreeningType(String value) {
         this.screeningType = value;
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
      *     {@link ScreeningList.ScreeningEntry.ProgramList }
      *     
      */
     public ScreeningList.ScreeningEntry.ProgramList getProgramList() {
         return programList;
     }

     /**
      * Sets the value of the programList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningList.ScreeningEntry.ProgramList }
      *     
      */
     public void setProgramList(ScreeningList.ScreeningEntry.ProgramList value) {
         this.programList = value;
     }

     /**
      * Gets the value of the idList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningList.ScreeningEntry.IdList }
      *     
      */
     public ScreeningList.ScreeningEntry.IdList getIdList() {
         return idList;
     }

     /**
      * Sets the value of the idList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningList.ScreeningEntry.IdList }
      *     
      */
     public void setIdList(ScreeningList.ScreeningEntry.IdList value) {
         this.idList = value;
     }

     /**
      * Gets the value of the akaList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningList.ScreeningEntry.AkaList }
      *     
      */
     public ScreeningList.ScreeningEntry.AkaList getAkaList() {
         return akaList;
     }

     /**
      * Sets the value of the akaList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningList.ScreeningEntry.AkaList }
      *     
      */
     public void setAkaList(ScreeningList.ScreeningEntry.AkaList value) {
         this.akaList = value;
     }

     /**
      * Gets the value of the addressList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningList.ScreeningEntry.AddressList }
      *     
      */
     public ScreeningList.ScreeningEntry.AddressList getAddressList() {
         return addressList;
     }

     /**
      * Sets the value of the addressList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningList.ScreeningEntry.AddressList }
      *     
      */
     public void setAddressList(ScreeningList.ScreeningEntry.AddressList value) {
         this.addressList = value;
     }

     /**
      * Gets the value of the nationalityList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningList.ScreeningEntry.NationalityList }
      *     
      */
     public ScreeningList.ScreeningEntry.NationalityList getNationalityList() {
         return nationalityList;
     }

     /**
      * Sets the value of the nationalityList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningList.ScreeningEntry.NationalityList }
      *     
      */
     public void setNationalityList(ScreeningList.ScreeningEntry.NationalityList value) {
         this.nationalityList = value;
     }

     /**
      * Gets the value of the citizenshipList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningList.ScreeningEntry.CitizenshipList }
      *     
      */
     public ScreeningList.ScreeningEntry.CitizenshipList getCitizenshipList() {
         return citizenshipList;
     }

     /**
      * Sets the value of the citizenshipList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningList.ScreeningEntry.CitizenshipList }
      *     
      */
     public void setCitizenshipList(ScreeningList.ScreeningEntry.CitizenshipList value) {
         this.citizenshipList = value;
     }

     /**
      * Gets the value of the dateOfBirthList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningList.ScreeningEntry.DateOfBirthList }
      *     
      */
     public ScreeningList.ScreeningEntry.DateOfBirthList getDateOfBirthList() {
         return dateOfBirthList;
     }

     /**
      * Sets the value of the dateOfBirthList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningList.ScreeningEntry.DateOfBirthList }
      *     
      */
     public void setDateOfBirthList(ScreeningList.ScreeningEntry.DateOfBirthList value) {
         this.dateOfBirthList = value;
     }

     /**
      * Gets the value of the placeOfBirthList property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningList.ScreeningEntry.PlaceOfBirthList }
      *     
      */
     public ScreeningList.ScreeningEntry.PlaceOfBirthList getPlaceOfBirthList() {
         return placeOfBirthList;
     }

     /**
      * Sets the value of the placeOfBirthList property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningList.ScreeningEntry.PlaceOfBirthList }
      *     
      */
     public void setPlaceOfBirthList(ScreeningList.ScreeningEntry.PlaceOfBirthList value) {
         this.placeOfBirthList = value;
     }

     /**
      * Gets the value of the vesselInfo property.
      * 
      * @return
      *     possible object is
      *     {@link ScreeningList.ScreeningEntry.VesselInfo }
      *     
      */
     public ScreeningList.ScreeningEntry.VesselInfo getVesselInfo() {
         return vesselInfo;
     }

     /**
      * Sets the value of the vesselInfo property.
      * 
      * @param value
      *     allowed object is
      *     {@link ScreeningList.ScreeningEntry.VesselInfo }
      *     
      */
     public void setVesselInfo(ScreeningList.ScreeningEntry.VesselInfo value) {
         this.vesselInfo = value;
     }


      public static class AddressList {

         protected List<ScreeningList.ScreeningEntry.AddressList.Address> address;

         public List<ScreeningList.ScreeningEntry.AddressList.Address> getAddress() {
             if (address == null) {
                 address = new ArrayList<ScreeningList.ScreeningEntry.AddressList.Address>();
             }
             return this.address;
         }


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


     public static class AkaList {

         protected List<ScreeningList.ScreeningEntry.AkaList.Aka> aka;

         public List<ScreeningList.ScreeningEntry.AkaList.Aka> getAka() {
             if (aka == null) {
                 aka = new ArrayList<ScreeningList.ScreeningEntry.AkaList.Aka>();
             }
             return this.aka;
         }


         public static class Aka {

             protected int uid;
             protected String type;
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


     public static class CitizenshipList {

         protected List<ScreeningList.ScreeningEntry.CitizenshipList.Citizenship> citizenship;

         public List<ScreeningList.ScreeningEntry.CitizenshipList.Citizenship> getCitizenship() {
             if (citizenship == null) {
                 citizenship = new ArrayList<ScreeningList.ScreeningEntry.CitizenshipList.Citizenship>();
             }
             return this.citizenship;
         }

         public static class Citizenship {

             protected int uid;
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


     public static class DateOfBirthList {

         protected List<ScreeningList.ScreeningEntry.DateOfBirthList.DateOfBirthItem> dateOfBirthItem;

         public List<ScreeningList.ScreeningEntry.DateOfBirthList.DateOfBirthItem> getDateOfBirthItem() {
             if (dateOfBirthItem == null) {
                 dateOfBirthItem = new ArrayList<ScreeningList.ScreeningEntry.DateOfBirthList.DateOfBirthItem>();
             }
             return this.dateOfBirthItem;
         }


         public static class DateOfBirthItem {

             protected int uid;
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


     public static class IdList {

         protected List<ScreeningList.ScreeningEntry.IdList.Id> id;

         public List<ScreeningList.ScreeningEntry.IdList.Id> getId() {
             if (id == null) {
                 id = new ArrayList<ScreeningList.ScreeningEntry.IdList.Id>();
             }
             return this.id;
         }


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


     public static class NationalityList {

         protected List<ScreeningList.ScreeningEntry.NationalityList.Nationality> nationality;

         public List<ScreeningList.ScreeningEntry.NationalityList.Nationality> getNationality() {
             if (nationality == null) {
                 nationality = new ArrayList<ScreeningList.ScreeningEntry.NationalityList.Nationality>();
             }
             return this.nationality;
         }


         public static class Nationality {

             protected int uid;
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


     public static class PlaceOfBirthList {

         protected List<ScreeningList.ScreeningEntry.PlaceOfBirthList.PlaceOfBirthItem> placeOfBirthItem;

         public List<ScreeningList.ScreeningEntry.PlaceOfBirthList.PlaceOfBirthItem> getPlaceOfBirthItem() {
             if (placeOfBirthItem == null) {
                 placeOfBirthItem = new ArrayList<ScreeningList.ScreeningEntry.PlaceOfBirthList.PlaceOfBirthItem>();
             }
             return this.placeOfBirthItem;
         }


         public static class PlaceOfBirthItem {

             protected int uid;
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


     public static class ProgramList {

         protected List<String> program;

         public List<String> getProgram() {
             if (program == null) {
                 program = new ArrayList<String>();
             }
             return this.program;
         }

     }


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