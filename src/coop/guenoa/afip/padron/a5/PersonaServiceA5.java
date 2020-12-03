package coop.guenoa.afip.padron.a5;

public class PersonaServiceA5 implements coop.guenoa.afip.padron.a5.PersonaServiceA5_PortType {
  private String _endpoint = null;
  private coop.guenoa.afip.padron.a5.PersonaServiceA5_PortType personaServiceA5_PortType = null;
  
  public PersonaServiceA5() {
    _initPersonaServiceA5Proxy();
  }
  
  public PersonaServiceA5(String endpoint) {
    _endpoint = endpoint;
    _initPersonaServiceA5Proxy();
  }
  
  private void _initPersonaServiceA5Proxy() {
    try {
      personaServiceA5_PortType = (new coop.guenoa.afip.padron.a5.PersonaServiceA5_ServiceLocator()).getPersonaServiceA5Port();
      if (personaServiceA5_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personaServiceA5_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personaServiceA5_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personaServiceA5_PortType != null)
      ((javax.xml.rpc.Stub)personaServiceA5_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public coop.guenoa.afip.padron.a5.PersonaServiceA5_PortType getPersonaServiceA5_PortType() {
    if (personaServiceA5_PortType == null)
      _initPersonaServiceA5Proxy();
    return personaServiceA5_PortType;
  }
  
  public coop.guenoa.afip.padron.a5.PersonaReturn getPersona(java.lang.String token, java.lang.String sign, long cuitRepresentada, long idPersona) throws java.rmi.RemoteException, coop.guenoa.afip.padron.a5.SRValidationException{
    if (personaServiceA5_PortType == null)
      _initPersonaServiceA5Proxy();
    return personaServiceA5_PortType.getPersona(token, sign, cuitRepresentada, idPersona);
  }
  
  public coop.guenoa.afip.padron.a5.PersonaListReturn getPersonaList(java.lang.String token, java.lang.String sign, long cuitRepresentada, long[] idPersona) throws java.rmi.RemoteException, coop.guenoa.afip.padron.a5.SRValidationException{
    if (personaServiceA5_PortType == null)
      _initPersonaServiceA5Proxy();
    return personaServiceA5_PortType.getPersonaList(token, sign, cuitRepresentada, idPersona);
  }
  
  public coop.guenoa.afip.padron.a5.PersonaReturn getPersona_v2(java.lang.String token, java.lang.String sign, long cuitRepresentada, long idPersona) throws java.rmi.RemoteException, coop.guenoa.afip.padron.a5.SRValidationException{
    if (personaServiceA5_PortType == null)
      _initPersonaServiceA5Proxy();
    return personaServiceA5_PortType.getPersona_v2(token, sign, cuitRepresentada, idPersona);
  }
  
  public coop.guenoa.afip.padron.a5.DummyReturn dummy() throws java.rmi.RemoteException{
    if (personaServiceA5_PortType == null)
      _initPersonaServiceA5Proxy();
    return personaServiceA5_PortType.dummy();
  }
  
  public coop.guenoa.afip.padron.a5.PersonaListReturn getPersonaList_v2(java.lang.String token, java.lang.String sign, long cuitRepresentada, long[] idPersona) throws java.rmi.RemoteException, coop.guenoa.afip.padron.a5.SRValidationException{
    if (personaServiceA5_PortType == null)
      _initPersonaServiceA5Proxy();
    return personaServiceA5_PortType.getPersonaList_v2(token, sign, cuitRepresentada, idPersona);
  }
  
  
}