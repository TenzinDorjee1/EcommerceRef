package classes;

public class PaymentPage {
	private String userAddress; 
	private String userName; 
	private int CreditNum; 
	private String userEmail;
	
	
	String getUserAddress() {
		return userAddress;
	}
	
	
	void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	
	String getUserName() {
		return userName;
	}
	

	void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	int getCreditNum() {
		return CreditNum;
	}
	
	
	void setCreditNum(int creditNum) {
		CreditNum = creditNum;
	}
	
	
	private String getUserEmail() {
		return userEmail;
	}
	
	
	private void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
}
