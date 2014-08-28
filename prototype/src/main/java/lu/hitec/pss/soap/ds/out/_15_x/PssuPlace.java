/**
 * PssuPlace.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class PssuPlace  extends lu.hitec.pss.soap.ds.out._15_x.PssuUnit  implements java.io.Serializable {
    private java.lang.Double coordAltitude;

    private java.lang.Double coordLatitude;

    private java.lang.Double coordLongitude;

    private java.lang.String countryName;

    private java.lang.String description;

    private java.lang.String displayName;

    private lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] externalIDs;

    private java.lang.String locality;

    private java.lang.String postalCode;

    private java.lang.String streetAddress;

    public PssuPlace() {
    }

    public PssuPlace(
           lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] communicationUris,
           java.lang.String[] mails,
           lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] phones,
           java.lang.String type,
           java.lang.String uid,
           java.lang.Double coordAltitude,
           java.lang.Double coordLatitude,
           java.lang.Double coordLongitude,
           java.lang.String countryName,
           java.lang.String description,
           java.lang.String displayName,
           lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] externalIDs,
           java.lang.String locality,
           java.lang.String postalCode,
           java.lang.String streetAddress) {
        super(
            communicationUris,
            mails,
            phones,
            type,
            uid);
        this.coordAltitude = coordAltitude;
        this.coordLatitude = coordLatitude;
        this.coordLongitude = coordLongitude;
        this.countryName = countryName;
        this.description = description;
        this.displayName = displayName;
        this.externalIDs = externalIDs;
        this.locality = locality;
        this.postalCode = postalCode;
        this.streetAddress = streetAddress;
    }


    /**
     * Gets the coordAltitude value for this PssuPlace.
     * 
     * @return coordAltitude
     */
    public java.lang.Double getCoordAltitude() {
        return coordAltitude;
    }


    /**
     * Sets the coordAltitude value for this PssuPlace.
     * 
     * @param coordAltitude
     */
    public void setCoordAltitude(java.lang.Double coordAltitude) {
        this.coordAltitude = coordAltitude;
    }


    /**
     * Gets the coordLatitude value for this PssuPlace.
     * 
     * @return coordLatitude
     */
    public java.lang.Double getCoordLatitude() {
        return coordLatitude;
    }


    /**
     * Sets the coordLatitude value for this PssuPlace.
     * 
     * @param coordLatitude
     */
    public void setCoordLatitude(java.lang.Double coordLatitude) {
        this.coordLatitude = coordLatitude;
    }


    /**
     * Gets the coordLongitude value for this PssuPlace.
     * 
     * @return coordLongitude
     */
    public java.lang.Double getCoordLongitude() {
        return coordLongitude;
    }


    /**
     * Sets the coordLongitude value for this PssuPlace.
     * 
     * @param coordLongitude
     */
    public void setCoordLongitude(java.lang.Double coordLongitude) {
        this.coordLongitude = coordLongitude;
    }


    /**
     * Gets the countryName value for this PssuPlace.
     * 
     * @return countryName
     */
    public java.lang.String getCountryName() {
        return countryName;
    }


    /**
     * Sets the countryName value for this PssuPlace.
     * 
     * @param countryName
     */
    public void setCountryName(java.lang.String countryName) {
        this.countryName = countryName;
    }


    /**
     * Gets the description value for this PssuPlace.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PssuPlace.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the displayName value for this PssuPlace.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this PssuPlace.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the externalIDs value for this PssuPlace.
     * 
     * @return externalIDs
     */
    public lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] getExternalIDs() {
        return externalIDs;
    }


    /**
     * Sets the externalIDs value for this PssuPlace.
     * 
     * @param externalIDs
     */
    public void setExternalIDs(lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] externalIDs) {
        this.externalIDs = externalIDs;
    }

    public lu.hitec.pss.soap.ds.out._15_x.TypeValueComment getExternalIDs(int i) {
        return this.externalIDs[i];
    }

    public void setExternalIDs(int i, lu.hitec.pss.soap.ds.out._15_x.TypeValueComment _value) {
        this.externalIDs[i] = _value;
    }


    /**
     * Gets the locality value for this PssuPlace.
     * 
     * @return locality
     */
    public java.lang.String getLocality() {
        return locality;
    }


    /**
     * Sets the locality value for this PssuPlace.
     * 
     * @param locality
     */
    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }


    /**
     * Gets the postalCode value for this PssuPlace.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this PssuPlace.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the streetAddress value for this PssuPlace.
     * 
     * @return streetAddress
     */
    public java.lang.String getStreetAddress() {
        return streetAddress;
    }


    /**
     * Sets the streetAddress value for this PssuPlace.
     * 
     * @param streetAddress
     */
    public void setStreetAddress(java.lang.String streetAddress) {
        this.streetAddress = streetAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssuPlace)) return false;
        PssuPlace other = (PssuPlace) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.coordAltitude==null && other.getCoordAltitude()==null) || 
             (this.coordAltitude!=null &&
              this.coordAltitude.equals(other.getCoordAltitude()))) &&
            ((this.coordLatitude==null && other.getCoordLatitude()==null) || 
             (this.coordLatitude!=null &&
              this.coordLatitude.equals(other.getCoordLatitude()))) &&
            ((this.coordLongitude==null && other.getCoordLongitude()==null) || 
             (this.coordLongitude!=null &&
              this.coordLongitude.equals(other.getCoordLongitude()))) &&
            ((this.countryName==null && other.getCountryName()==null) || 
             (this.countryName!=null &&
              this.countryName.equals(other.getCountryName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.externalIDs==null && other.getExternalIDs()==null) || 
             (this.externalIDs!=null &&
              java.util.Arrays.equals(this.externalIDs, other.getExternalIDs()))) &&
            ((this.locality==null && other.getLocality()==null) || 
             (this.locality!=null &&
              this.locality.equals(other.getLocality()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.streetAddress==null && other.getStreetAddress()==null) || 
             (this.streetAddress!=null &&
              this.streetAddress.equals(other.getStreetAddress())));
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
        if (getCoordAltitude() != null) {
            _hashCode += getCoordAltitude().hashCode();
        }
        if (getCoordLatitude() != null) {
            _hashCode += getCoordLatitude().hashCode();
        }
        if (getCoordLongitude() != null) {
            _hashCode += getCoordLongitude().hashCode();
        }
        if (getCountryName() != null) {
            _hashCode += getCountryName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getExternalIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocality() != null) {
            _hashCode += getLocality().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getStreetAddress() != null) {
            _hashCode += getStreetAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssuPlace.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuPlace"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordAltitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coordAltitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("countryName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "typeValueComment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streetAddress"));
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
