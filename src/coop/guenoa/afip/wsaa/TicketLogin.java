package coop.guenoa.afip.wsaa;

import java.util.Date;

public class TicketLogin {

	String token;
	String Sign;
	Date expirationTime;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getSign() {
		return Sign;
	}

	public void setSign(String sign) {
		Sign = sign;
	}

	public Date getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}

	public boolean esVigente() {
		Date anotherDate = new Date();

		return this.expirationTime.compareTo(anotherDate) > 0;
	}

	@Override
	public String toString() {
		return "TicketLogin [token=" + token + ", Sign=" + Sign + ", expirationTime=" + expirationTime + "]";
	}

	/*
	 * public String getLoginTicketResponse() { return loginTicketResponse; }
	 * 
	 * public void setLoginTicketResponse(String loginTicketResponse) throws
	 * DocumentException { this.loginTicketResponse = loginTicketResponse; }
	 * 
	 * public String getToken() throws DocumentException {
	 * 
	 * return leerXML("/loginTicketResponse/credentials/token"); }
	 * 
	 * public String getSign() throws DocumentException { return
	 * leerXML("/loginTicketResponse/credentials/sign"); }
	 * 
	 * public boolean esVigente() throws DocumentException, ParseException {
	 * 
	 * String expirationTime =
	 * leerXML("/loginTicketResponse/header/expirationTime");
	 * 
	 * String format = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
	 * 
	 * GregorianCalendar cal = new GregorianCalendar();
	 * 
	 * cal.setTime(new SimpleDateFormat(format).parse(expirationTime));
	 * 
	 * return false; }
	 * 
	 * @Override public String toString() { return loginTicketResponse; }
	 * 
	 * private String leerXML(String value) throws DocumentException { Reader
	 * tokenReader = new StringReader(loginTicketResponse);
	 * 
	 * Document tokenDoc = new SAXReader(false).read(tokenReader);
	 * 
	 * return tokenDoc.valueOf(value); }
	 */
	
	
}
