/**
 * PersonaServiceA5_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.padron.a5;

public interface PersonaServiceA5_PortType extends java.rmi.Remote {
    public coop.guenoa.afip.padron.a5.PersonaReturn getPersona(java.lang.String token, java.lang.String sign, long cuitRepresentada, long idPersona) throws java.rmi.RemoteException, coop.guenoa.afip.padron.a5.SRValidationException;
    public coop.guenoa.afip.padron.a5.PersonaListReturn getPersonaList(java.lang.String token, java.lang.String sign, long cuitRepresentada, long[] idPersona) throws java.rmi.RemoteException, coop.guenoa.afip.padron.a5.SRValidationException;
    public coop.guenoa.afip.padron.a5.PersonaReturn getPersona_v2(java.lang.String token, java.lang.String sign, long cuitRepresentada, long idPersona) throws java.rmi.RemoteException, coop.guenoa.afip.padron.a5.SRValidationException;
    public coop.guenoa.afip.padron.a5.DummyReturn dummy() throws java.rmi.RemoteException;
    public coop.guenoa.afip.padron.a5.PersonaListReturn getPersonaList_v2(java.lang.String token, java.lang.String sign, long cuitRepresentada, long[] idPersona) throws java.rmi.RemoteException, coop.guenoa.afip.padron.a5.SRValidationException;
}
