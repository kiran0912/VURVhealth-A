package com.VURVhealth.vurvhealth.vision.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VisionInsertPastSearchReqPayload {
    @SerializedName("Browser")
    @Expose
    private String browser;
    @SerializedName("City")
    @Expose
    private String city;
    @SerializedName("DeviceType")
    @Expose
    private String deviceType;
    @SerializedName("DoctorSpeciality")
    @Expose
    private String doctorSpeciality;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("Gender")
    @Expose
    private String gender;
    @SerializedName("IP")
    @Expose
    private String iP;
    @SerializedName("Language")
    @Expose
    private String language;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("OfficeSpeciality")
    @Expose
    private String officeSpeciality;
    @SerializedName("OperatingSystem")
    @Expose
    private String operatingSystem;
    @SerializedName("Range")
    @Expose
    private String range;
    @SerializedName("State")
    @Expose
    private String state;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("UserId")
    @Expose
    private String userId;
    @SerializedName("ZipCode")
    @Expose
    private String zipCode;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRange() {
        return this.range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDoctorSpeciality() {
        return this.doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }

    public String getOfficeSpeciality() {
        return this.officeSpeciality;
    }

    public void setOfficeSpeciality(String officeSpeciality) {
        this.officeSpeciality = officeSpeciality;
    }

    public String getIP() {
        return this.iP;
    }

    public void setIP(String iP) {
        this.iP = iP;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getBrowser() {
        return this.browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
}
