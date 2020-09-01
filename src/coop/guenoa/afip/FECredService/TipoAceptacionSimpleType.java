/**
 * TipoAceptacionSimpleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package coop.guenoa.afip.FECredService;

import java.util.HashMap;

public class TipoAceptacionSimpleType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _value_;
	private static HashMap<String, TipoAceptacionSimpleType> _table_ = new HashMap<String, TipoAceptacionSimpleType>();

	// Constructor
	protected TipoAceptacionSimpleType(String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final String _Tacita = "Tacita";
	public static final String _Expresa = "Expresa";
	public static final TipoAceptacionSimpleType Tacita = new TipoAceptacionSimpleType(_Tacita);
	public static final TipoAceptacionSimpleType Expresa = new TipoAceptacionSimpleType(_Expresa);

	public String getValue() {
		return _value_;
	}

	public static TipoAceptacionSimpleType fromValue(String value) throws IllegalArgumentException {
		TipoAceptacionSimpleType enumeration = (TipoAceptacionSimpleType) _table_.get(value);
		if (enumeration == null)
			throw new IllegalArgumentException();
		return enumeration;
	}

	public static TipoAceptacionSimpleType fromString(String value) throws IllegalArgumentException {
		return fromValue(value);
	}

	public boolean equals(Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public String toString() {
		return _value_;
	}

	public Object readResolve() throws java.io.ObjectStreamException {
		return fromValue(_value_);
	}

	public static org.apache.axis.encoding.Serializer getSerializer(String mechType, Class<?> _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumSerializer(_javaType, _xmlType);
	}

	public static org.apache.axis.encoding.Deserializer getDeserializer(String mechType, Class<?> _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumDeserializer(_javaType, _xmlType);
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			TipoAceptacionSimpleType.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.afip.wsfecred/FECredService/",
				"TipoAceptacionSimpleType"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
