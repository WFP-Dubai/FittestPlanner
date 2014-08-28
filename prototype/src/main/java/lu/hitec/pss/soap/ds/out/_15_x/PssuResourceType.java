/**
 * PssuResourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class PssuResourceType  implements java.io.Serializable {
    private byte[] clusterJpegPhoto;

    private java.lang.String description;

    private byte[] jpegPhoto;

    private lu.hitec.pss.soap.ds.out._15_x.ResourcesTypesEnum type;

    private java.lang.String uid;

    public PssuResourceType() {
    }

    public PssuResourceType(
           byte[] clusterJpegPhoto,
           java.lang.String description,
           byte[] jpegPhoto,
           lu.hitec.pss.soap.ds.out._15_x.ResourcesTypesEnum type,
           java.lang.String uid) {
           this.clusterJpegPhoto = clusterJpegPhoto;
           this.description = description;
           this.jpegPhoto = jpegPhoto;
           this.type = type;
           this.uid = uid;
    }


    /**
     * Gets the clusterJpegPhoto value for this PssuResourceType.
     * 
     * @return clusterJpegPhoto
     */
    public byte[] getClusterJpegPhoto() {
        return clusterJpegPhoto;
    }


    /**
     * Sets the clusterJpegPhoto value for this PssuResourceType.
     * 
     * @param clusterJpegPhoto
     */
    public void setClusterJpegPhoto(byte[] clusterJpegPhoto) {
        this.clusterJpegPhoto = clusterJpegPhoto;
    }


    /**
     * Gets the description value for this PssuResourceType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PssuResourceType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the jpegPhoto value for this PssuResourceType.
     * 
     * @return jpegPhoto
     */
    public byte[] getJpegPhoto() {
        return jpegPhoto;
    }


    /**
     * Sets the jpegPhoto value for this PssuResourceType.
     * 
     * @param jpegPhoto
     */
    public void setJpegPhoto(byte[] jpegPhoto) {
        this.jpegPhoto = jpegPhoto;
    }


    /**
     * Gets the type value for this PssuResourceType.
     * 
     * @return type
     */
    public lu.hitec.pss.soap.ds.out._15_x.ResourcesTypesEnum getType() {
        return type;
    }


    /**
     * Sets the type value for this PssuResourceType.
     * 
     * @param type
     */
    public void setType(lu.hitec.pss.soap.ds.out._15_x.ResourcesTypesEnum type) {
        this.type = type;
    }


    /**
     * Gets the uid value for this PssuResourceType.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this PssuResourceType.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssuResourceType)) return false;
        PssuResourceType other = (PssuResourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterJpegPhoto==null && other.getClusterJpegPhoto()==null) || 
             (this.clusterJpegPhoto!=null &&
              java.util.Arrays.equals(this.clusterJpegPhoto, other.getClusterJpegPhoto()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.jpegPhoto==null && other.getJpegPhoto()==null) || 
             (this.jpegPhoto!=null &&
              java.util.Arrays.equals(this.jpegPhoto, other.getJpegPhoto()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
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
        if (getClusterJpegPhoto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterJpegPhoto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterJpegPhoto(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getJpegPhoto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJpegPhoto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJpegPhoto(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssuResourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuResourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterJpegPhoto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clusterJpegPhoto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
        elemField.setFieldName("jpegPhoto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jpegPhoto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "resourcesTypesEnum"));
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
