/**
 * DtoThreshold.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class DtoThreshold  implements java.io.Serializable {
    private java.lang.Double maxCrit;

    private java.lang.Double maxWarn;

    private java.lang.Double minCrit;

    private java.lang.Double minWarn;

    private java.lang.String uid;

    private java.lang.String unit;

    public DtoThreshold() {
    }

    public DtoThreshold(
           java.lang.Double maxCrit,
           java.lang.Double maxWarn,
           java.lang.Double minCrit,
           java.lang.Double minWarn,
           java.lang.String uid,
           java.lang.String unit) {
           this.maxCrit = maxCrit;
           this.maxWarn = maxWarn;
           this.minCrit = minCrit;
           this.minWarn = minWarn;
           this.uid = uid;
           this.unit = unit;
    }


    /**
     * Gets the maxCrit value for this DtoThreshold.
     * 
     * @return maxCrit
     */
    public java.lang.Double getMaxCrit() {
        return maxCrit;
    }


    /**
     * Sets the maxCrit value for this DtoThreshold.
     * 
     * @param maxCrit
     */
    public void setMaxCrit(java.lang.Double maxCrit) {
        this.maxCrit = maxCrit;
    }


    /**
     * Gets the maxWarn value for this DtoThreshold.
     * 
     * @return maxWarn
     */
    public java.lang.Double getMaxWarn() {
        return maxWarn;
    }


    /**
     * Sets the maxWarn value for this DtoThreshold.
     * 
     * @param maxWarn
     */
    public void setMaxWarn(java.lang.Double maxWarn) {
        this.maxWarn = maxWarn;
    }


    /**
     * Gets the minCrit value for this DtoThreshold.
     * 
     * @return minCrit
     */
    public java.lang.Double getMinCrit() {
        return minCrit;
    }


    /**
     * Sets the minCrit value for this DtoThreshold.
     * 
     * @param minCrit
     */
    public void setMinCrit(java.lang.Double minCrit) {
        this.minCrit = minCrit;
    }


    /**
     * Gets the minWarn value for this DtoThreshold.
     * 
     * @return minWarn
     */
    public java.lang.Double getMinWarn() {
        return minWarn;
    }


    /**
     * Sets the minWarn value for this DtoThreshold.
     * 
     * @param minWarn
     */
    public void setMinWarn(java.lang.Double minWarn) {
        this.minWarn = minWarn;
    }


    /**
     * Gets the uid value for this DtoThreshold.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this DtoThreshold.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }


    /**
     * Gets the unit value for this DtoThreshold.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this DtoThreshold.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtoThreshold)) return false;
        DtoThreshold other = (DtoThreshold) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxCrit==null && other.getMaxCrit()==null) || 
             (this.maxCrit!=null &&
              this.maxCrit.equals(other.getMaxCrit()))) &&
            ((this.maxWarn==null && other.getMaxWarn()==null) || 
             (this.maxWarn!=null &&
              this.maxWarn.equals(other.getMaxWarn()))) &&
            ((this.minCrit==null && other.getMinCrit()==null) || 
             (this.minCrit!=null &&
              this.minCrit.equals(other.getMinCrit()))) &&
            ((this.minWarn==null && other.getMinWarn()==null) || 
             (this.minWarn!=null &&
              this.minWarn.equals(other.getMinWarn()))) &&
            ((this.uid==null && other.getUid()==null) || 
             (this.uid!=null &&
              this.uid.equals(other.getUid()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit())));
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
        if (getMaxCrit() != null) {
            _hashCode += getMaxCrit().hashCode();
        }
        if (getMaxWarn() != null) {
            _hashCode += getMaxWarn().hashCode();
        }
        if (getMinCrit() != null) {
            _hashCode += getMinCrit().hashCode();
        }
        if (getMinWarn() != null) {
            _hashCode += getMinWarn().hashCode();
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtoThreshold.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoThreshold"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCrit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxCrit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxWarn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxWarn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minCrit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minCrit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minWarn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minWarn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
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
