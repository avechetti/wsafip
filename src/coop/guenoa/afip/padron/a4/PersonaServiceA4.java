package coop.guenoa.afip.padron.a4;

public class PersonaServiceA4 implements PortType {
	private String _endpoint = null;
	private PortType personaServiceA4_PortType = null;

	public PersonaServiceA4() {
		_initPersonaServiceA4Proxy();
	}

	public PersonaServiceA4(String endpoint) {
		_endpoint = endpoint;
		_initPersonaServiceA4Proxy();
	}

	private void _initPersonaServiceA4Proxy() {
		try {
			personaServiceA4_PortType = (new ServiceLocator()).getPersonaServiceA4Port();
			if (personaServiceA4_PortType != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) personaServiceA4_PortType)
							._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) personaServiceA4_PortType)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (personaServiceA4_PortType != null)
			((javax.xml.rpc.Stub) personaServiceA4_PortType)._setProperty("javax.xml.rpc.service.endpoint.address",
					_endpoint);

	}

	public PortType getPersonaServiceA4_PortType() {
		if (personaServiceA4_PortType == null)
			_initPersonaServiceA4Proxy();
		return personaServiceA4_PortType;
	}

	public DummyReturn dummy() throws java.rmi.RemoteException {
		if (personaServiceA4_PortType == null)
			_initPersonaServiceA4Proxy();
		return personaServiceA4_PortType.dummy();
	}

	public PersonaReturn getPersona(java.lang.String token, java.lang.String sign, long cuitRepresentada,
			long idPersona) throws java.rmi.RemoteException, SRValidationException {
		if (personaServiceA4_PortType == null)
			_initPersonaServiceA4Proxy();
		return personaServiceA4_PortType.getPersona(token, sign, cuitRepresentada, idPersona);
	}

}