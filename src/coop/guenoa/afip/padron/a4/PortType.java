/**
 * PersonaServiceA4_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.padron.a4;

public interface PortType extends java.rmi.Remote {
    public coop.guenoa.afip.padron.a4.DummyReturn dummy() throws java.rmi.RemoteException;
    public coop.guenoa.afip.padron.a4.PersonaReturn getPersona(java.lang.String token, java.lang.String sign, long cuitRepresentada, long idPersona) throws java.rmi.RemoteException, coop.guenoa.afip.padron.a4.SRValidationException;
}
