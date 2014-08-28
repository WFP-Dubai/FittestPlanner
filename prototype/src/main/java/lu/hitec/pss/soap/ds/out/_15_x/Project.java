/**
 * Project.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class Project  implements java.io.Serializable {
    private java.lang.String compileDate;

    private java.lang.String softwareName;

    private java.lang.String version;

    public Project() {
    }

    public Project(
           java.lang.String compileDate,
           java.lang.String softwareName,
           java.lang.String version) {
           this.compileDate = compileDate;
           this.softwareName = softwareName;
           this.version = version;
    }


    /**
     * Gets the compileDate value for this Project.
     * 
     * @return compileDate
     */
    public java.lang.String getCompileDate() {
        return compileDate;
    }


    /**
     * Sets the compileDate value for this Project.
     * 
     * @param compileDate
     */
    public void setCompileDate(java.lang.String compileDate) {
        this.compileDate = compileDate;
    }


    /**
     * Gets the softwareName value for this Project.
     * 
     * @return softwareName
     */
    public java.lang.String getSoftwareName() {
        return softwareName;
    }


    /**
     * Sets the softwareName value for this Project.
     * 
     * @param softwareName
     */
    public void setSoftwareName(java.lang.String softwareName) {
        this.softwareName = softwareName;
    }


    /**
     * Gets the version value for this Project.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Project.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Project)) return false;
        Project other = (Project) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.compileDate==null && other.getCompileDate()==null) || 
             (this.compileDate!=null &&
              this.compileDate.equals(other.getCompileDate()))) &&
            ((this.softwareName==null && other.getSoftwareName()==null) || 
             (this.softwareName!=null &&
              this.softwareName.equals(other.getSoftwareName()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getCompileDate() != null) {
            _hashCode += getCompileDate().hashCode();
        }
        if (getSoftwareName() != null) {
            _hashCode += getSoftwareName().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Project.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "project"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compileDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "compileDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softwareName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "softwareName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
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
