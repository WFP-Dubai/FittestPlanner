/**
 * MapelementLibraryInternalId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class MapelementLibraryInternalId  extends lu.hitec.pss.soap.ds.out._15_x.InternalId  implements java.io.Serializable {
    private java.lang.String libraryName;

    private java.lang.String libraryVersion;

    private java.lang.String type;

    public MapelementLibraryInternalId() {
    }

    public MapelementLibraryInternalId(
           java.lang.String middlewareId,
           java.lang.String missionId,
           java.lang.String payload,
           lu.hitec.pss.soap.ds.out._15_x.ServiceEnum service,
           java.lang.String libraryName,
           java.lang.String libraryVersion,
           java.lang.String type) {
        super(
            middlewareId,
            missionId,
            payload,
            service);
        this.libraryName = libraryName;
        this.libraryVersion = libraryVersion;
        this.type = type;
    }


    /**
     * Gets the libraryName value for this MapelementLibraryInternalId.
     * 
     * @return libraryName
     */
    public java.lang.String getLibraryName() {
        return libraryName;
    }


    /**
     * Sets the libraryName value for this MapelementLibraryInternalId.
     * 
     * @param libraryName
     */
    public void setLibraryName(java.lang.String libraryName) {
        this.libraryName = libraryName;
    }


    /**
     * Gets the libraryVersion value for this MapelementLibraryInternalId.
     * 
     * @return libraryVersion
     */
    public java.lang.String getLibraryVersion() {
        return libraryVersion;
    }


    /**
     * Sets the libraryVersion value for this MapelementLibraryInternalId.
     * 
     * @param libraryVersion
     */
    public void setLibraryVersion(java.lang.String libraryVersion) {
        this.libraryVersion = libraryVersion;
    }


    /**
     * Gets the type value for this MapelementLibraryInternalId.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this MapelementLibraryInternalId.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapelementLibraryInternalId)) return false;
        MapelementLibraryInternalId other = (MapelementLibraryInternalId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.libraryName==null && other.getLibraryName()==null) || 
             (this.libraryName!=null &&
              this.libraryName.equals(other.getLibraryName()))) &&
            ((this.libraryVersion==null && other.getLibraryVersion()==null) || 
             (this.libraryVersion!=null &&
              this.libraryVersion.equals(other.getLibraryVersion()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getLibraryName() != null) {
            _hashCode += getLibraryName().hashCode();
        }
        if (getLibraryVersion() != null) {
            _hashCode += getLibraryVersion().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MapelementLibraryInternalId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "mapelementLibraryInternalId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("libraryName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "libraryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("libraryVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "libraryVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
