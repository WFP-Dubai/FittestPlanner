/**
 * DtoMiddleware.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class DtoMiddleware  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String mwType;

    private java.lang.String uid;

    public DtoMiddleware() {
    }

    public DtoMiddleware(
           java.lang.String description,
           java.lang.String mwType,
           java.lang.String uid) {
           this.description = description;
           this.mwType = mwType;
           this.uid = uid;
    }


    /**
     * Gets the description value for this DtoMiddleware.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DtoMiddleware.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the mwType value for this DtoMiddleware.
     * 
     * @return mwType
     */
    public java.lang.String getMwType() {
        return mwType;
    }


    /**
     * Sets the mwType value for this DtoMiddleware.
     * 
     * @param mwType
     */
    public void setMwType(java.lang.String mwType) {
        this.mwType = mwType;
    }


    /**
     * Gets the uid value for this DtoMiddleware.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this DtoMiddleware.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtoMiddleware)) return false;
        DtoMiddleware other = (DtoMiddleware) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.mwType==null && other.getMwType()==null) || 
             (this.mwType!=null &&
              this.mwType.equals(other.getMwType()))) &&
            ((this.uid==null && other.getUid()==null) || 
             (this.uid!=null &&
              this.uid.equals(other.getUid())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getMwType() != null) {
            _hashCode += getMwType().hashCode();
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtoMiddleware.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoMiddleware"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mwType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mwType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uid"));
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
