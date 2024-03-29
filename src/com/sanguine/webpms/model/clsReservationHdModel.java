package com.sanguine.webpms.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;


@Entity
@Table(name = "tblreservationhd")
@IdClass(clsReservationModel_ID.class)
public class clsReservationHdModel implements Serializable {
	private static final long serialVersionUID = 1L;

	public clsReservationHdModel() {
	}

	public clsReservationHdModel(clsReservationModel_ID objModelID) {
		strReservationNo = objModelID.getStrReservationNo();
		strClientCode = objModelID.getStrClientCode();
	}

	@ElementCollection(fetch=FetchType.LAZY)
	@JoinTable(name = "tblreservationdtl", joinColumns = { @JoinColumn(name = "strClientCode"), @JoinColumn(name = "strReservationNo") })
	@Id
	@AttributeOverrides({ @AttributeOverride(name = "strReservationNo", column = @Column(name = "strReservationNo")), 
	@AttributeOverride(name = "strClientCode", column = @Column(name = "strClientCode")) })
	private List<clsReservationDtlModel> listReservationDtlModel = new ArrayList<clsReservationDtlModel>();

	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name = "tblreservationroomratedtl", joinColumns = { @JoinColumn(name = "strClientCode"), @JoinColumn(name = "strReservationNo") })
	@Id
	@AttributeOverrides({ @AttributeOverride(name = "strReservationNo", column = @Column(name = "strReservationNo")), 
	@AttributeOverride(name = "strClientCode", column = @Column(name = "strClientCode")) })
	private List<clsReservationRoomRateModelDtl> listReservationRoomRateDtl = new ArrayList<clsReservationRoomRateModelDtl>();

	
	

	// Variable Declaration
	@Column(name = "strReservationNo")
	private String strReservationNo;

	@Column(name = "strPropertyCode")
	private String strPropertyCode;

	@Column(name = "strCorporateCode")
	private String strCorporateCode;

	@Column(name = "strBookingTypeCode")
	private String strBookingTypeCode;

	@Column(name = "dteArrivalDate")
	private String dteArrivalDate;

	@Column(name = "dteDepartureDate")
	private String dteDepartureDate;

	@Column(name = "intNoOfNights")
	private int intNoOfNights;

	@Column(name = "strContactPerson")
	private String strContactPerson;

	@Column(name = "strEmailId")
	private String strEmailId;

	@Column(name = "strBillingInstCode")
	private String strBillingInstCode;

	@Column(name = "strBookerCode")
	private String strBookerCode;

	@Column(name = "strBusinessSourceCode")
	private String strBusinessSourceCode;

	@Column(name = "strAgentCode")
	private String strAgentCode;

	@Column(name = "strRemarks")
	private String strRemarks;

	@Column(name = "dteCancelDate")
	private String dteCancelDate;

	@Column(name = "dteConfirmDate")
	private String dteConfirmDate;

	@Column(name = "strCancelReservation")
	private String strCancelReservation;

	@Column(name = "strUserCreated", updatable = false)
	private String strUserCreated;

	@Column(name = "strUserEdited")
	private String strUserEdited;

	@Column(name = "dteDateCreated", updatable = false)
	private String dteDateCreated;

	@Column(name = "dteDateEdited")
	private String dteDateEdited;

	@Column(name = "strClientCode")
	private String strClientCode;

	@Column(name = "tmeArrivalTime")
	private String tmeArrivalTime;

	@Column(name = "tmeDepartureTime")
	private String tmeDepartureTime;

	@Column(name = "dteReservationDate")
	private String dteReservationDate;

	@Column(name = "strRoomNo")
	private String strRoomNo;

	@Column(name = "intNoOfAdults")
	private int intNoOfAdults;

	@Column(name = "intNoOfChild")
	private int intNoOfChild;

	@Column(name = "strExtraBedCode")
	private String strExtraBedCode;

	@Column(name = "strNoRoomsBooked")
	private String strNoRoomsBooked;

	@Column(name = "strGuestcode")
	private String strGuestcode;
	
	@Column(name = "strOTANo")
	private String strOTANo;
	
	@Column(name = "strMarketSourceCode")
	private String strMarketSourceCode;
	
	@Column(name = "strIncomeHeadCode")
	private String strIncomeHeadCode;
	
	
	@Column(name = "tmeDropTime")
	private String tmeDropTime;
	
	@Column(name = "tmePickUpTime")
	private String tmePickUpTime;
	

	public List<clsReservationDtlModel> getListReservationDtlModel() {
		return listReservationDtlModel;
	}

	public void setListReservationDtlModel(List<clsReservationDtlModel> listReservationDtlModel) {
		this.listReservationDtlModel = listReservationDtlModel;
	}

	// Setter-Getter Methods
	public String getStrReservationNo() {
		return strReservationNo;
	}

	public void setStrReservationNo(String strReservationNo) {
		this.strReservationNo = (String) setDefaultValue(strReservationNo, "");
	}

	public String getStrPropertyCode() {
		return strPropertyCode;
	}

	public void setStrPropertyCode(String strPropertyCode) {
		this.strPropertyCode = (String) setDefaultValue(strPropertyCode, "");
	}

	public String getStrCorporateCode() {
		return strCorporateCode;
	}

	public void setStrCorporateCode(String strCorporateCode) {
		this.strCorporateCode = (String) setDefaultValue(strCorporateCode, "");
	}

	public String getStrBookingTypeCode() {
		return strBookingTypeCode;
	}

	public void setStrBookingTypeCode(String strBookingTypeCode) {
		this.strBookingTypeCode = (String) setDefaultValue(strBookingTypeCode, "");
	}

	public String getDteArrivalDate() {
		return dteArrivalDate;
	}

	public void setDteArrivalDate(String dteArrivalDate) {
		this.dteArrivalDate = dteArrivalDate;
	}

	public String getDteDepartureDate() {
		return dteDepartureDate;
	}

	public void setDteDepartureDate(String dteDepartureDate) {
		this.dteDepartureDate = dteDepartureDate;
	}

	public int getIntNoOfNights() {
		return intNoOfNights;
	}

	public void setIntNoOfNights(int intNoOfNights) {
		this.intNoOfNights = (Integer) setDefaultValue(intNoOfNights, "0");
	}

	public String getStrContactPerson() {
		return strContactPerson;
	}

	public void setStrContactPerson(String strContactPerson) {
		this.strContactPerson = (String) setDefaultValue(strContactPerson, "");
	}

	public String getStrEmailId() {
		return strEmailId;
	}

	public void setStrEmailId(String strEmailId) {
		this.strEmailId = (String) setDefaultValue(strEmailId, "");
	}

	public String getStrBillingInstCode() {
		return strBillingInstCode;
	}

	public void setStrBillingInstCode(String strBillingInstCode) {
		this.strBillingInstCode = (String) setDefaultValue(strBillingInstCode, "");
	}

	public String getStrBookerCode() {
		return strBookerCode;
	}

	public void setStrBookerCode(String strBookerCode) {
		this.strBookerCode = (String) setDefaultValue(strBookerCode, "");
	}

	public String getStrBusinessSourceCode() {
		return strBusinessSourceCode;
	}

	public void setStrBusinessSourceCode(String strBusinessSourceCode) {
		this.strBusinessSourceCode = (String) setDefaultValue(strBusinessSourceCode, "");
	}

	public String getStrAgentCode() {
		return strAgentCode;
	}

	public void setStrAgentCode(String strAgentCode) {
		this.strAgentCode = (String) setDefaultValue(strAgentCode, "");
	}

	public String getStrRemarks() {
		return strRemarks;
	}

	public void setStrRemarks(String strRemarks) {
		this.strRemarks = (String) setDefaultValue(strRemarks, "");
	}

	public String getDteCancelDate() {
		return dteCancelDate;
	}

	public void setDteCancelDate(String dteCancelDate) {
		this.dteCancelDate = dteCancelDate;
	}

	public String getDteConfirmDate() {
		return dteConfirmDate;
	}

	public void setDteConfirmDate(String dteConfirmDate) {
		this.dteConfirmDate = dteConfirmDate;
	}

	public String getStrCancelReservation() {
		return strCancelReservation;
	}

	public void setStrCancelReservation(String strCancelReservation) {
		this.strCancelReservation = (String) setDefaultValue(strCancelReservation, "");
	}

	public String getStrUserCreated() {
		return strUserCreated;
	}

	public void setStrUserCreated(String strUserCreated) {
		this.strUserCreated = (String) setDefaultValue(strUserCreated, "");
	}

	public String getStrUserEdited() {
		return strUserEdited;
	}

	public void setStrUserEdited(String strUserEdited) {
		this.strUserEdited = (String) setDefaultValue(strUserEdited, "");
	}

	public String getDteDateCreated() {
		return dteDateCreated;
	}

	public void setDteDateCreated(String dteDateCreated) {
		this.dteDateCreated = dteDateCreated;
	}

	public String getDteDateEdited() {
		return dteDateEdited;
	}

	public void setDteDateEdited(String dteDateEdited) {
		this.dteDateEdited = dteDateEdited;
	}

	public String getStrClientCode() {
		return strClientCode;
	}

	public void setStrClientCode(String strClientCode) {
		this.strClientCode = (String) setDefaultValue(strClientCode, "");
	}

	public String getTmeArrivalTime() {
		return tmeArrivalTime;
	}

	public void setTmeArrivalTime(String tmeArrivalTime) {
		this.tmeArrivalTime = tmeArrivalTime;
	}

	public String getTmeDepartureTime() {
		return tmeDepartureTime;
	}

	public void setTmeDepartureTime(String tmeDepartureTime) {
		this.tmeDepartureTime = tmeDepartureTime;
	}

	public String getDteReservationDate() {
		return dteReservationDate;
	}

	public void setDteReservationDate(String dteReservationDate) {
		this.dteReservationDate = dteReservationDate;
	}

	public String getStrRoomNo() {
		return strRoomNo;
	}

	public void setStrRoomNo(String strRoomNo) {
		this.strRoomNo = (String) setDefaultValue(strRoomNo, "");
	}

	public int getIntNoOfAdults() {
		return intNoOfAdults;
	}

	public void setIntNoOfAdults(int intNoOfAdults) {
		this.intNoOfAdults = intNoOfAdults;
	}

	public int getIntNoOfChild() {
		return intNoOfChild;
	}

	public void setIntNoOfChild(int intNoOfChild) {
		this.intNoOfChild = intNoOfChild;
	}

	public String getStrExtraBedCode() {
		return strExtraBedCode;
	}

	public void setStrExtraBedCode(String strExtraBedCode) {
		this.strExtraBedCode = (String) setDefaultValue(strExtraBedCode, "");
	}

	// Function to Set Default Values
	private Object setDefaultValue(Object value, Object defaultValue) {
		if (value != null && (value instanceof String && value.toString().length() > 0)) {
			return value;
		} else if (value != null && (value instanceof Double && value.toString().length() > 0)) {
			return value;
		} else if (value != null && (value instanceof Integer && value.toString().length() > 0)) {
			return value;
		} else if (value != null && (value instanceof Long && value.toString().length() > 0)) {
			return value;
		} else {
			return defaultValue;
		}
	}

	public String getStrNoRoomsBooked() {
		return strNoRoomsBooked;
	}

	public void setStrNoRoomsBooked(String strNoRoomsBooked) {
		this.strNoRoomsBooked = (String) setDefaultValue(strNoRoomsBooked, "1");
		;
	}

	public String getStrGuestcode() {
		return strGuestcode;
	}

	public void setStrGuestcode(String strGuestcode) {
		this.strGuestcode = strGuestcode;
	}

	public String getStrOTANo() {
		return strOTANo;
	}

	public void setStrOTANo(String strOTANo) {
		this.strOTANo = (String) setDefaultValue(strOTANo, "");
	}

	public String getStrMarketSourceCode() {
		return strMarketSourceCode;
	}

	public void setStrMarketSourceCode(String strMarketSourceCode) {
		this.strMarketSourceCode = strMarketSourceCode;
	}

	public String getStrIncomeHeadCode() {
		return strIncomeHeadCode;
	}

	public void setStrIncomeHeadCode(String strIncomeHeadCode) {
		this.strIncomeHeadCode = strIncomeHeadCode;
	}

	public List<clsReservationRoomRateModelDtl> getListReservationRoomRateDtl() {
		return listReservationRoomRateDtl;
	}

	public void setListReservationRoomRateDtl(List<clsReservationRoomRateModelDtl> listReservationRoomRateDtl) {
		this.listReservationRoomRateDtl = listReservationRoomRateDtl;
	}

	public String getTmeDropTime() {
		return tmeDropTime;
	}

	public void setTmeDropTime(String tmeDropTime) {
		this.tmeDropTime = tmeDropTime;
	}

	public String getTmePickUpTime() {
		return tmePickUpTime;
	}

	public void setTmePickUpTime(String tmePickUpTime) {
		this.tmePickUpTime = tmePickUpTime;
	}

	
	
	

}
