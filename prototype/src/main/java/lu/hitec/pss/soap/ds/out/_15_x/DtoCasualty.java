/**
 * DtoCasualty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class DtoCasualty  implements java.io.Serializable {
    private java.util.Calendar birthDate;

    private java.lang.Double coordLatitude;

    private java.lang.Double coordLongitude;

    private java.lang.String country;

    private java.lang.String description;

    private java.lang.String firstname;

    private java.lang.String gender;

    private java.lang.String[] injuryScale;

    private java.lang.String language;

    private java.lang.String lastname;

    private java.lang.String medicalDetails;

    private java.lang.String mission;

    private java.lang.String mobile;

    private java.lang.String nationality;

    private java.lang.String precision;

    private int radiusInMeters;

    private java.lang.String uniqueId;

    public DtoCasualty() {
    }

    public DtoCasualty(
           java.util.Calendar birthDate,
           java.lang.Double coordLatitude,
           java.lang.Double coordLongitude,
           java.lang.String country,
           java.lang.String description,
           java.lang.String firstname,
           java.lang.String gender,
           java.lang.String[] injuryScale,
           java.lang.String language,
           java.lang.String lastname,
           java.lang.String medicalDetails,
           java.lang.String mission,
           java.lang.String mobile,
           java.lang.String nationality,
           java.lang.String precision,
           int radiusInMeters,
           java.lang.String uniqueId) {
           this.birthDate = birthDate;
           this.coordLatitude = coordLatitude;
           this.coordLongitude = coordLongitude;
           this.country = country;
           this.description = description;
           this.firstname = firstname;
           this.gender = gender;
           this.injuryScale = injuryScale;
           this.language = language;
           this.lastname = lastname;
           this.medicalDetails = medicalDetails;
           this.mission = mission;
           this.mobile = mobile;
           this.nationality = nationality;
           this.precision = precision;
           this.radiusInMeters = radiusInMeters;
           this.uniqueId = uniqueId;
    }


    /**
     * Gets the birthDate value for this DtoCasualty.
     * 
     * @return birthDate
     */
    public java.util.Calendar getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this DtoCasualty.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Calendar birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the coordLatitude value for this DtoCasualty.
     * 
     * @return coordLatitude
     */
    public java.lang.Double getCoordLatitude() {
        return coordLatitude;
    }


    /**
     * Sets the coordLatitude value for this DtoCasualty.
     * 
     * @param coordLatitude
     */
    public void setCoordLatitude(java.lang.Double coordLatitude) {
        this.coordLatitude = coordLatitude;
    }


    /**
     * Gets the coordLongitude value for this DtoCasualty.
     * 
     * @return coordLongitude
     */
    public java.lang.Double getCoordLongitude() {
        return coordLongitude;
    }


    /**
     * Sets the coordLongitude value for this DtoCasualty.
     * 
     * @param coordLongitude
     */
    public void setCoordLongitude(java.lang.Double coordLongitude) {
        this.coordLongitude = coordLongitude;
    }


    /**
     * Gets the country value for this DtoCasualty.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DtoCasualty.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the description value for this DtoCasualty.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DtoCasualty.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the firstname value for this DtoCasualty.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this DtoCasualty.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
    }


    /**
     * Gets the gender value for this DtoCasualty.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this DtoCasualty.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the injuryScale value for this DtoCasualty.
     * 
     * @return injuryScale
     */
    public java.lang.String[] getInjuryScale() {
        return injuryScale;
    }


    /**
     * Sets the injuryScale value for this DtoCasualty.
     * 
     * @param injuryScale
     */
    public void setInjuryScale(java.lang.String[] injuryScale) {
        this.injuryScale = injuryScale;
    }

    public java.lang.String getInjuryScale(int i) {
        return this.injuryScale[i];
    }

    public void setInjuryScale(int i, java.lang.String _value) {
        this.injuryScale[i] = _value;
    }


    /**
     * Gets the language value for this DtoCasualty.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this DtoCasualty.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the lastname value for this DtoCasualty.
     * 
     * @return lastname
     */
    public java.lang.String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this DtoCasualty.
     * 
     * @param lastname
     */
    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
    }


    /**
     * Gets the medicalDetails value for this DtoCasualty.
     * 
     * @return medicalDetails
     */
    public java.lang.String getMedicalDetails() {
        return medicalDetails;
    }


    /**
     * Sets the medicalDetails value for this DtoCasualty.
     * 
     * @param medicalDetails
     */
    public void setMedicalDetails(java.lang.String medicalDetails) {
        this.medicalDetails = medicalDetails;
    }


    /**
     * Gets the mission value for this DtoCasualty.
     * 
     * @return mission
     */
    public java.lang.String getMission() {
        return mission;
    }


    /**
     * Sets the mission value for this DtoCasualty.
     * 
     * @param mission
     */
    public void setMission(java.lang.String mission) {
        this.mission = mission;
    }


    /**
     * Gets the mobile value for this DtoCasualty.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this DtoCasualty.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the nationality value for this DtoCasualty.
     * 
     * @return nationality
     */
    public java.lang.String getNationality() {
        return nationality;
    }


    /**
     * Sets the nationality value for this DtoCasualty.
     * 
     * @param nationality
     */
    public void setNationality(java.lang.String nationality) {
        this.nationality = nationality;
    }


    /**
     * Gets the precision value for this DtoCasualty.
     * 
     * @return precision
     */
    public java.lang.String getPrecision() {
        return precision;
    }


    /**
     * Sets the precision value for this DtoCasualty.
     * 
     * @param precision
     */
    public void setPrecision(java.lang.String precision) {
        this.precision = precision;
    }


    /**
     * Gets the radiusInMeters value for this DtoCasualty.
     * 
     * @return radiusInMeters
     */
    public int getRadiusInMeters() {
        return radiusInMeters;
    }


    /**
     * Sets the radiusInMeters value for this DtoCasualty.
     * 
     * @param radiusInMeters
     */
    public void setRadiusInMeters(int radiusInMeters) {
        this.radiusInMeters = radiusInMeters;
    }


    /**
     * Gets the uniqueId value for this DtoCasualty.
     * 
     * @return uniqueId
     */
    public java.lang.String getUniqueId() {
        return uniqueId;
    }


    /**
     * Sets the uniqueId value for this DtoCasualty.
     * 
     * @param uniqueId
     */
    public void setUniqueId(java.lang.String uniqueId) {
        this.uniqueId = uniqueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtoCasualty)) return false;
        DtoCasualty other = (DtoCasualty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.coordLatitude==null && other.getCoordLatitude()==null) || 
             (this.coordLatitude!=null &&
              this.coordLatitude.equals(other.getCoordLatitude()))) &&
            ((this.coordLongitude==null && other.getCoordLongitude()==null) || 
             (this.coordLongitude!=null &&
              this.coordLongitude.equals(other.getCoordLongitude()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.firstname==null && other.getFirstname()==null) || 
             (this.firstname!=null &&
              this.firstname.equals(other.getFirstname()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.injuryScale==null && other.getInjuryScale()==null) || 
             (this.injuryScale!=null &&
              java.util.Arrays.equals(this.injuryScale, other.getInjuryScale()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.lastname==null && other.getLastname()==null) || 
             (this.lastname!=null &&
              this.lastname.equals(other.getLastname()))) &&
            ((this.medicalDetails==null && other.getMedicalDetails()==null) || 
             (this.medicalDetails!=null &&
              this.medicalDetails.equals(other.getMedicalDetails()))) &&
            ((this.mission==null && other.getMission()==null) || 
             (this.mission!=null &&
              this.mission.equals(other.getMission()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.nationality==null && other.getNationality()==null) || 
             (this.nationality!=null &&
              this.nationality.equals(other.getNationality()))) &&
            ((this.precision==null && other.getPrecision()==null) || 
             (this.precision!=null &&
              this.precision.equals(other.getPrecision()))) &&
            this.radiusInMeters == other.getRadiusInMeters() &&
            ((this.uniqueId==null && other.getUniqueId()==null) || 
             (this.uniqueId!=null &&
              this.uniqueId.equals(other.getUniqueId())));
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
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getCoordLatitude() != null) {
            _hashCode += getCoordLatitude().hashCode();
        }
        if (getCoordLongitude() != null) {
            _hashCode += getCoordLongitude().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFirstname() != null) {
            _hashCode += getFirstname().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getInjuryScale() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInjuryScale());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInjuryScale(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getLastname() != null) {
            _hashCode += getLastname().hashCode();
        }
        if (getMedicalDetails() != null) {
            _hashCode += getMedicalDetails().hashCode();
        }
        if (getMission() != null) {
            _hashCode += getMission().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getNationality() != null) {
            _hashCode += getNationality().hashCode();
        }
        if (getPrecision() != null) {
            _hashCode += getPrecision().hashCode();
        }
        _hashCode += getRadiusInMeters();
        if (getUniqueId() != null) {
            _hashCode += getUniqueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtoCasualty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoCasualty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
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
        elemField.setFieldName("firstname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("injuryScale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "injuryScale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medicalDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "medicalDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mission");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusInMeters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radiusInMeters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uniqueId"));
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
