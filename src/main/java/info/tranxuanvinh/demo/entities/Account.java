package info.tranxuanvinh.demo.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5722333337619806228L;
	
	@Id
	private Integer id;
	private Integer accountOwnerId;
	private String accountNumber;
	private String accountName;
	private String accountType;
	private Date balanceDate;
	private String currency;
	private BigDecimal openingAvailableBalance;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAccountOwnerId() {
		return accountOwnerId;
	}
	public void setAccountOwnerId(Integer accountOwnerId) {
		this.accountOwnerId = accountOwnerId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Date getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public BigDecimal getOpeningAvailableBalance() {
		return openingAvailableBalance;
	}
	public void setOpeningAvailableBalance(BigDecimal openingAvailableBalance) {
		this.openingAvailableBalance = openingAvailableBalance;
	}

}
