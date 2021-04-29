package com.VURVhealth.vurvhealth.save.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SavedItemDetailResPayload {
    @SerializedName("Drug_Name")
    @Expose
    private String drugName;
    @SerializedName("Drug_Type")
    @Expose
    private String drugType;
    @SerializedName("GNRC_ALT_NDC")
    @Expose
    private String gNRCALTNDC;
    @SerializedName("IsLeast")
    @Expose
    private String isLeast;
    @SerializedName("NCPDP")
    @Expose
    private String nCPDP;
    @SerializedName("NDC")
    @Expose
    private String nDC;
    @SerializedName("PharmacyName")
    @Expose
    private String pharmacyName;
    @SerializedName("Price")
    @Expose
    private String price;
    @SerializedName("UserId")
    @Expose
    private String userId;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPharmacyName() {
        return this.pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getNCPDP() {
        return this.nCPDP;
    }

    public void setNCPDP(String nCPDP) {
        this.nCPDP = nCPDP;
    }

    public String getNDC() {
        return this.nDC;
    }

    public void setNDC(String nDC) {
        this.nDC = nDC;
    }

    public String getDrugName() {
        return this.drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getGNRCALTNDC() {
        return this.gNRCALTNDC;
    }

    public void setGNRCALTNDC(String gNRCALTNDC) {
        this.gNRCALTNDC = gNRCALTNDC;
    }

    public String getDrugType() {
        return this.drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIsLeast() {
        return this.isLeast;
    }

    public void setIsLeast(String isLeast) {
        this.isLeast = isLeast;
    }
}
