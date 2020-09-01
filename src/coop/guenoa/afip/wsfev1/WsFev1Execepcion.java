package coop.guenoa.afip.wsfev1;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;

import coop.guenoa.afip.wsaa.Wsaa;

public class WsFev1Execepcion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Err[] errs;
	private Obs[] obss;

	private static Logger log = Logger.getLogger(WsFev1Execepcion.class);

	public WsFev1Execepcion(Err[] errs, Obs[] obss) {
		super();
		this.errs = errs;
		this.obss = obss;
	}

	public WsFev1Execepcion(FECAEResponse response) {
		errs = response.getErrors();

		ArrayList<Obs> obslist = new ArrayList<>();
		FECAEDetResponse[] det = response.getFeDetResp();
		for (int i = 0; i < det.length; i++) {
			FECAEDetResponse fecaeDetResponse = det[i];
			Obs[] obss = fecaeDetResponse.getObservaciones();

			if (obss != null) {
				for (int j = 0; j < obss.length; j++) {
					obslist.add(obss[j]);
				}
			}
		}
		obss = new Obs[obslist.size()];
		obss = obslist.toArray(obss);

		log.error(getMessage());

	}

	@Override
	public String getMessage() {
		String value = new String();
		if (errs != null) {
			for (int i = 0; i < errs.length; i++) {
				Err err = errs[i];
				value = value.concat(err.toString()).concat("\n");
			}
		}

		if (obss != null) {
			for (int i = 0; i < obss.length; i++) {
				Obs obs = obss[i];
				value = value.concat(obs.toString()).concat("\n");
			}
		}

		return value;
	}

	public void setErrs(Err[] errs) {
		this.errs = errs;
	}

	public Obs[] getObss() {
		return obss;
	}

	public void setObss(Obs[] obss) {
		this.obss = obss;
	}

	public Err[] getErrs() {
		return errs;
	}

}
