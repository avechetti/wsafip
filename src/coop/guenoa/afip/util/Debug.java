package coop.guenoa.afip.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;

public class Debug {

	public static Boolean debug = false;
	public static String xml_resquest;
	public static String xml_response;

	public static void guardarArchivosXml(Call _call) throws AxisFault {
		if (debug) {
			try {
				xml_resquest = _call.getMessageContext().getRequestMessage().getSOAPPartAsString();
				xml_response = _call.getMessageContext().getResponseMessage().getSOAPPartAsString();

				FileWriter fw;
				fw = new FileWriter(new File("XmlRequest.xml"));
				fw.write(xml_resquest);
				fw.close();

				fw = new FileWriter(new File("XmlResponse.xml"));
				fw.write(xml_response);
				fw.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}