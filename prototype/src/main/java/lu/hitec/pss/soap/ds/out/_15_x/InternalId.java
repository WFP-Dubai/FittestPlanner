/**
 * InternalId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class InternalId  implements java.io.Serializable {
    private java.lang.String middlewareId;

    private java.lang.String missionId;

    private java.lang.String payload;

    private lu.hitec.pss.soap.ds.out._15_x.ServiceEnum service;

    public InternalId() {
    }

    public InternalId(
           java.lang.String middlewareId,
           java.lang.String missionId,
           java.lang.String payload,
           lu.hitec.pss.soap.ds.out._15_x.ServiceEnum service) {
           this.middlewareId = middlewareId;
           this.missionId = missionId;
           this.payload = payload;
           this.service = service;
    }


    /**
     * Gets the middlewareId value for this InternalId.
     * 
     * @return middlewareId
     */
    public java.lang.String getMiddlewareId() {
        return middlewareId;
    }


    /**
     * Sets the middlewareId value for this InternalId.
     * 
     * @param middlewareId
     */
    public void setMiddlewareId(java.lang.String middlewareId) {
        this.middlewareId = middlewareId;
    }


    /**
     * Gets the missionId value for this InternalId.
     * 
     * @return missionId
     */
    public java.lang.String getMissionId() {
        return missionId;
    }


    /**
     * Sets the missionId value for this InternalId.
     * 
     * @param missionId
     */
    public void setMissionId(java.lang.String missionId) {
        this.missionId = missionId;
    }


    /**
     * Gets the payload value for this InternalId.
     * 
     * @return payload
     */
    public java.lang.String getPayload() {
        return payload;
    }


    /**
     * Sets the payload value for this InternalId.
     * 
     * @param payload
     */
    public void setPayload(java.lang.String payload) {
        this.payload = payload;
    }


    /**
     * Gets the service value for this InternalId.
     * 
     * @return service
     */
    public lu.hitec.pss.soap.ds.out._15_x.ServiceEnum getService() {
        return service;
    }


    /**
     * Sets the service value for this InternalId.
     * 
     * @param service
     */
    public void setService(lu.hitec.pss.soap.ds.out._15_x.ServiceEnum service) {
        this.service = service;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternalId)) return false;
        InternalId other = (InternalId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.middlewareId==null && other.getMiddlewareId()==null) || 
             (this.middlewareId!=null &&
              this.middlewareId.equals(other.getMiddlewareId()))) &&
            ((this.missionId==null && other.getMissionId()==null) || 
             (this.missionId!=null &&
              this.missionId.equals(other.getMissionId()))) &&
            ((this.payload==null && other.getPayload()==null) || 
             (this.payload!=null &&
              this.payload.equals(other.getPayload()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService())));
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
        if (getMiddlewareId() != null) {
            _hashCode += getMiddlewareId().hashCode();
        }
        if (getMissionId() != null) {
            _hashCode += getMissionId().hashCode();
        }
        if (getPayload() != null) {
            _hashCode += getPayload().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternalId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "internalId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middlewareId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "middlewareId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "missionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payload");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "serviceEnum"));
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
