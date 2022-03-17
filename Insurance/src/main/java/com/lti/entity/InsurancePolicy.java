package com.lti.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class InsurancePolicy {

	@Id
	@GeneratedValue
	@Column(name="policy_id")
	private int policy_id;
	
	@Column(name="policy_name")
	private String policyname;
	
	@Column(name="policy_PaymentDate")
	private LocalDateTime paymentDate; 
	

	@Column(name="policy_startDate")
	private LocalDate startDate;
	

	@Column(name="policy_EndDate")
	private Date endDate;
	
	@Column(name="insured_amt")
	private double amount;
	
	
	@Column(name="policy_status")
	private String status;
	

	@Column(name="price")
	private double price;
	
	@ManyToOne
	@JoinColumn(name="id")
	private CustomerDetails customerdetails;
	
	
	@OneToOne
	@JoinColumn(name="vehical_number")
	private  VehicalDetail vdetail2;
	
	

	@OneToOne(mappedBy = "ipolicy3")
	private List<InsuranceClaim> iclaim3;
	

	@OneToOne(mappedBy = "ipolicy4")
	private List<RenewInsurance> renewinsurance;


	public int getPolicy_id() {
		return policy_id;
	}


	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}


	public String getPolicyname() {
		return policyname;
	}


	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}


	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public CustomerDetails getCustomerdetails() {
		return customerdetails;
	}


	public void setCustomerdetails(CustomerDetails customerdetails) {
		this.customerdetails = customerdetails;
	}


	public VehicalDetail getVdetail2() {
		return vdetail2;
	}


	public void setVdetail2(VehicalDetail vdetail2) {
		this.vdetail2 = vdetail2;
	}


	public List<InsuranceClaim> getIclaim3() {
		return iclaim3;
	}


	public void setIclaim3(List<InsuranceClaim> iclaim3) {
		this.iclaim3 = iclaim3;
	}


	public List<RenewInsurance> getRenewinsurance() {
		return renewinsurance;
	}


	public void setRenewinsurance(List<RenewInsurance> renewinsurance) {
		this.renewinsurance = renewinsurance;
	}
	
	
}
