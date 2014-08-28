/**
 * MapelementSceneInternalId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class MapelementSceneInternalId  extends lu.hitec.pss.soap.ds.out._15_x.InternalId  implements java.io.Serializable {
    private java.lang.String sceneId;

    private java.lang.String shortDescription;

    private java.lang.String type;

    public MapelementSceneInternalId() {
    }

    public MapelementSceneInternalId(
           java.lang.String middlewareId,
           java.lang.String missionId,
           java.lang.String payload,
           lu.hitec.pss.soap.ds.out._15_x.ServiceEnum service,
           java.lang.String sceneId,
           java.lang.String shortDescription,
           java.lang.String type) {
        super(
            middlewareId,
            missionId,
            payload,
            service);
        this.sceneId = sceneId;
        this.shortDescription = shortDescription;
        this.type = type;
    }


    /**
     * Gets the sceneId value for this MapelementSceneInternalId.
     * 
     * @return sceneId
     */
    public java.lang.String getSceneId() {
        return sceneId;
    }


    /**
     * Sets the sceneId value for this MapelementSceneInternalId.
     * 
     * @param sceneId
     */
    public void setSceneId(java.lang.String sceneId) {
        this.sceneId = sceneId;
    }


    /**
     * Gets the shortDescription value for this MapelementSceneInternalId.
     * 
     * @return shortDescription
     */
    public java.lang.String getShortDescription() {
        return shortDescription;
    }


    /**
     * Sets the shortDescription value for this MapelementSceneInternalId.
     * 
     * @param shortDescription
     */
    public void setShortDescription(java.lang.String shortDescription) {
        this.shortDescription = shortDescription;
    }


    /**
     * Gets the type value for this MapelementSceneInternalId.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this MapelementSceneInternalId.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapelementSceneInternalId)) return false;
        MapelementSceneInternalId other = (MapelementSceneInternalId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sceneId==null && other.getSceneId()==null) || 
             (this.sceneId!=null &&
              this.sceneId.equals(other.getSceneId()))) &&
            ((this.shortDescription==null && other.getShortDescription()==null) || 
             (this.shortDescription!=null &&
              this.shortDescription.equals(other.getShortDescription()))) &&
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
        if (getSceneId() != null) {
            _hashCode += getSceneId().hashCode();
        }
        if (getShortDescription() != null) {
            _hashCode += getShortDescription().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MapelementSceneInternalId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "mapelementSceneInternalId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sceneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortDescription"));
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
