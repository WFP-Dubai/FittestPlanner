/**
 * ServiceEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class ServiceEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ServiceEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CameraSrv = "CameraSrv";
    public static final java.lang.String _EventSrv = "EventSrv";
    public static final java.lang.String _LdapDirectorySrv = "LdapDirectorySrv";
    public static final java.lang.String _MapElementSrv = "MapElementSrv";
    public static final java.lang.String _MapTileSrv = "MapTileSrv";
    public static final java.lang.String _SensorCollectorSrv = "SensorCollectorSrv";
    public static final java.lang.String _SensorSrv = "SensorSrv";
    public static final java.lang.String _DocumentSrv = "DocumentSrv";
    public static final ServiceEnum CameraSrv = new ServiceEnum(_CameraSrv);
    public static final ServiceEnum EventSrv = new ServiceEnum(_EventSrv);
    public static final ServiceEnum LdapDirectorySrv = new ServiceEnum(_LdapDirectorySrv);
    public static final ServiceEnum MapElementSrv = new ServiceEnum(_MapElementSrv);
    public static final ServiceEnum MapTileSrv = new ServiceEnum(_MapTileSrv);
    public static final ServiceEnum SensorCollectorSrv = new ServiceEnum(_SensorCollectorSrv);
    public static final ServiceEnum SensorSrv = new ServiceEnum(_SensorSrv);
    public static final ServiceEnum DocumentSrv = new ServiceEnum(_DocumentSrv);
    public java.lang.String getValue() { return _value_;}
    public static ServiceEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ServiceEnum enumeration = (ServiceEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ServiceEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "serviceEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
