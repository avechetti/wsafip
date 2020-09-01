package coop.guenoa.afip.wsaa;

public class WsaaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WsaaException(Exception e) {
		super(e);
	}

	public WsaaException(String string) {
		super(string);
	}

}
