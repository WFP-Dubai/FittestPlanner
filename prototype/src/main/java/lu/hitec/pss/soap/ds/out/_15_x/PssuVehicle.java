/**
 * PssuVehicle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class PssuVehicle  extends lu.hitec.pss.soap.ds.out._15_x.PssuUnit  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String displayName;

    private lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] vehicleIDs;

    public PssuVehicle() {
    }

    public PssuVehicle(
           lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] communicationUris,
           java.lang.String[] mails,
           lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] phones,
           java.lang.String type,
           java.lang.String uid,
           java.lang.String description,
           java.lang.String displayName,
           lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] vehicleIDs) {
        super(
            communicationUris,
            mails,
            phones,
            type,
            uid);
        this.description = description;
        this.displayName = displayName;
        this.vehicleIDs = vehicleIDs;
    }


    /**
     * Gets the description value for this PssuVehicle.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PssuVehicle.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the displayName value for this PssuVehicle.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this PssuVehicle.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the vehicleIDs value for this PssuVehicle.
     * 
     * @return vehicleIDs
     */
    public lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] getVehicleIDs() {
        return vehicleIDs;
    }


    /**
     * Sets the vehicleIDs value for this PssuVehicle.
     * 
     * @param vehicleIDs
     */
    public void setVehicleIDs(lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] vehicleIDs) {
        this.vehicleIDs = vehicleIDs;
    }

    public lu.hitec.pss.soap.ds.out._15_x.TypeValueComment getVehicleIDs(int i) {
        return this.vehicleIDs[i];
    }

    public void setVehicleIDs(int i, lu.hitec.pss.soap.ds.out._15_x.TypeValueComment _value) {
        this.vehicleIDs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssuVehicle)) return false;
        PssuVehicle other = (PssuVehicle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.vehicleIDs==null && other.getVehicleIDs()==null) || 
             (this.vehicleIDs!=null &&
              java.util.Arrays.equals(this.vehicleIDs, other.getVehicleIDs())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getVehicleIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVehicleIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVehicleIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssuVehicle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuVehicle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("vehicleIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vehicleIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "typeValueComment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
