/**
 * DtoProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class DtoProfile  implements java.io.Serializable {
    private boolean missionsWildcard;

    private boolean organizationsWildcard;

    private java.lang.String[] permissions;

    private java.lang.String uid;

    public DtoProfile() {
    }

    public DtoProfile(
           boolean missionsWildcard,
           boolean organizationsWildcard,
           java.lang.String[] permissions,
           java.lang.String uid) {
           this.missionsWildcard = missionsWildcard;
           this.organizationsWildcard = organizationsWildcard;
           this.permissions = permissions;
           this.uid = uid;
    }


    /**
     * Gets the missionsWildcard value for this DtoProfile.
     * 
     * @return missionsWildcard
     */
    public boolean isMissionsWildcard() {
        return missionsWildcard;
    }


    /**
     * Sets the missionsWildcard value for this DtoProfile.
     * 
     * @param missionsWildcard
     */
    public void setMissionsWildcard(boolean missionsWildcard) {
        this.missionsWildcard = missionsWildcard;
    }


    /**
     * Gets the organizationsWildcard value for this DtoProfile.
     * 
     * @return organizationsWildcard
     */
    public boolean isOrganizationsWildcard() {
        return organizationsWildcard;
    }


    /**
     * Sets the organizationsWildcard value for this DtoProfile.
     * 
     * @param organizationsWildcard
     */
    public void setOrganizationsWildcard(boolean organizationsWildcard) {
        this.organizationsWildcard = organizationsWildcard;
    }


    /**
     * Gets the permissions value for this DtoProfile.
     * 
     * @return permissions
     */
    public java.lang.String[] getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this DtoProfile.
     * 
     * @param permissions
     */
    public void setPermissions(java.lang.String[] permissions) {
        this.permissions = permissions;
    }

    public java.lang.String getPermissions(int i) {
        return this.permissions[i];
    }

    public void setPermissions(int i, java.lang.String _value) {
        this.permissions[i] = _value;
    }


    /**
     * Gets the uid value for this DtoProfile.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this DtoProfile.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtoProfile)) return false;
        DtoProfile other = (DtoProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.missionsWildcard == other.isMissionsWildcard() &&
            this.organizationsWildcard == other.isOrganizationsWildcard() &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              java.util.Arrays.equals(this.permissions, other.getPermissions()))) &&
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
        _hashCode += (isMissionsWildcard() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOrganizationsWildcard() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtoProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missionsWildcard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "missionsWildcard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationsWildcard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organizationsWildcard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
