/**
 * PssuCircularFence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class PssuCircularFence  extends lu.hitec.pss.soap.ds.out._15_x.PssuFence  implements java.io.Serializable {
    private java.lang.Double coordLatitude;

    private java.lang.Double coordLongitude;

    private int radiusInMeters;

    public PssuCircularFence() {
    }

    public PssuCircularFence(
           java.lang.String description,
           java.lang.String type,
           java.lang.String uid,
           java.lang.Double coordLatitude,
           java.lang.Double coordLongitude,
           int radiusInMeters) {
        super(
            description,
            type,
            uid);
        this.coordLatitude = coordLatitude;
        this.coordLongitude = coordLongitude;
        this.radiusInMeters = radiusInMeters;
    }


    /**
     * Gets the coordLatitude value for this PssuCircularFence.
     * 
     * @return coordLatitude
     */
    public java.lang.Double getCoordLatitude() {
        return coordLatitude;
    }


    /**
     * Sets the coordLatitude value for this PssuCircularFence.
     * 
     * @param coordLatitude
     */
    public void setCoordLatitude(java.lang.Double coordLatitude) {
        this.coordLatitude = coordLatitude;
    }


    /**
     * Gets the coordLongitude value for this PssuCircularFence.
     * 
     * @return coordLongitude
     */
    public java.lang.Double getCoordLongitude() {
        return coordLongitude;
    }


    /**
     * Sets the coordLongitude value for this PssuCircularFence.
     * 
     * @param coordLongitude
     */
    public void setCoordLongitude(java.lang.Double coordLongitude) {
        this.coordLongitude = coordLongitude;
    }


    /**
     * Gets the radiusInMeters value for this PssuCircularFence.
     * 
     * @return radiusInMeters
     */
    public int getRadiusInMeters() {
        return radiusInMeters;
    }


    /**
     * Sets the radiusInMeters value for this PssuCircularFence.
     * 
     * @param radiusInMeters
     */
    public void setRadiusInMeters(int radiusInMeters) {
        this.radiusInMeters = radiusInMeters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssuCircularFence)) return false;
        PssuCircularFence other = (PssuCircularFence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.coordLatitude==null && other.getCoordLatitude()==null) || 
             (this.coordLatitude!=null &&
              this.coordLatitude.equals(other.getCoordLatitude()))) &&
            ((this.coordLongitude==null && other.getCoordLongitude()==null) || 
             (this.coordLongitude!=null &&
              this.coordLongitude.equals(other.getCoordLongitude()))) &&
            this.radiusInMeters == other.getRadiusInMeters();
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
        if (getCoordLatitude() != null) {
            _hashCode += getCoordLatitude().hashCode();
        }
        if (getCoordLongitude() != null) {
            _hashCode += getCoordLongitude().hashCode();
        }
        _hashCode += getRadiusInMeters();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssuCircularFence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuCircularFence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordLatitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coordLatitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordLongitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coordLongitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusInMeters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radiusInMeters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
