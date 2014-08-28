/**
 * PssuUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public abstract class PssuUnit  implements java.io.Serializable {
    private lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] communicationUris;

    private java.lang.String[] mails;

    private lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] phones;

    private java.lang.String type;

    private java.lang.String uid;

    public PssuUnit() {
    }

    public PssuUnit(
           lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] communicationUris,
           java.lang.String[] mails,
           lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] phones,
           java.lang.String type,
           java.lang.String uid) {
           this.communicationUris = communicationUris;
           this.mails = mails;
           this.phones = phones;
           this.type = type;
           this.uid = uid;
    }


    /**
     * Gets the communicationUris value for this PssuUnit.
     * 
     * @return communicationUris
     */
    public lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] getCommunicationUris() {
        return communicationUris;
    }


    /**
     * Sets the communicationUris value for this PssuUnit.
     * 
     * @param communicationUris
     */
    public void setCommunicationUris(lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] communicationUris) {
        this.communicationUris = communicationUris;
    }

    public lu.hitec.pss.soap.ds.out._15_x.TypeValueComment getCommunicationUris(int i) {
        return this.communicationUris[i];
    }

    public void setCommunicationUris(int i, lu.hitec.pss.soap.ds.out._15_x.TypeValueComment _value) {
        this.communicationUris[i] = _value;
    }


    /**
     * Gets the mails value for this PssuUnit.
     * 
     * @return mails
     */
    public java.lang.String[] getMails() {
        return mails;
    }


    /**
     * Sets the mails value for this PssuUnit.
     * 
     * @param mails
     */
    public void setMails(java.lang.String[] mails) {
        this.mails = mails;
    }

    public java.lang.String getMails(int i) {
        return this.mails[i];
    }

    public void setMails(int i, java.lang.String _value) {
        this.mails[i] = _value;
    }


    /**
     * Gets the phones value for this PssuUnit.
     * 
     * @return phones
     */
    public lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] getPhones() {
        return phones;
    }


    /**
     * Sets the phones value for this PssuUnit.
     * 
     * @param phones
     */
    public void setPhones(lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] phones) {
        this.phones = phones;
    }

    public lu.hitec.pss.soap.ds.out._15_x.TypeValueComment getPhones(int i) {
        return this.phones[i];
    }

    public void setPhones(int i, lu.hitec.pss.soap.ds.out._15_x.TypeValueComment _value) {
        this.phones[i] = _value;
    }


    /**
     * Gets the type value for this PssuUnit.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this PssuUnit.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the uid value for this PssuUnit.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this PssuUnit.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssuUnit)) return false;
        PssuUnit other = (PssuUnit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.communicationUris==null && other.getCommunicationUris()==null) || 
             (this.communicationUris!=null &&
              java.util.Arrays.equals(this.communicationUris, other.getCommunicationUris()))) &&
            ((this.mails==null && other.getMails()==null) || 
             (this.mails!=null &&
              java.util.Arrays.equals(this.mails, other.getMails()))) &&
            ((this.phones==null && other.getPhones()==null) || 
             (this.phones!=null &&
              java.util.Arrays.equals(this.phones, other.getPhones()))) &&
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
        if (getCommunicationUris() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommunicationUris());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommunicationUris(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhones(), i);
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
        new org.apache.axis.description.TypeDesc(PssuUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationUris");
        elemField.setXmlName(new javax.xml.namespace.QName("", "communicationUris"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "typeValueComment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "typeValueComment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
