/**
 * ResourcesTypesEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class ResourcesTypesEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ResourcesTypesEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACL_PERMISSION_TYPES = "ACL_PERMISSION_TYPES";
    public static final java.lang.String _CERTIFICATION_TYPES = "CERTIFICATION_TYPES";
    public static final java.lang.String _COMMUNICATION_URI_TYPES = "COMMUNICATION_URI_TYPES";
    public static final java.lang.String _COUNTRY_TYPES = "COUNTRY_TYPES";
    public static final java.lang.String _EQUIPMENT_STATUS_TYPES = "EQUIPMENT_STATUS_TYPES";
    public static final java.lang.String _EQUIPMENT_TYPES = "EQUIPMENT_TYPES";
    public static final java.lang.String _EVENT_TYPES = "EVENT_TYPES";
    public static final java.lang.String _EXTERNAL_ID_TYPES = "EXTERNAL_ID_TYPES";
    public static final java.lang.String _FENCE_TYPES = "FENCE_TYPES";
    public static final java.lang.String _KIT_STATUS_TYPES = "KIT_STATUS_TYPES";
    public static final java.lang.String _KIT_TYPES = "KIT_TYPES";
    public static final java.lang.String _MISSION_CATEGORY_TYPES = "MISSION_CATEGORY_TYPES";
    public static final java.lang.String _MISSION_CERTAINTY_TYPES = "MISSION_CERTAINTY_TYPES";
    public static final java.lang.String _MISSION_SCOPE_TYPES = "MISSION_SCOPE_TYPES";
    public static final java.lang.String _MISSION_SEVERITY_TYPES = "MISSION_SEVERITY_TYPES";
    public static final java.lang.String _MISSION_STATUS_TYPES = "MISSION_STATUS_TYPES";
    public static final java.lang.String _MISSION_URGENCY_TYPES = "MISSION_URGENCY_TYPES";
    public static final java.lang.String _ORGANIZATION_TYPES = "ORGANIZATION_TYPES";
    public static final java.lang.String _PERSONAL_TITLE_TYPES = "PERSONAL_TITLE_TYPES";
    public static final java.lang.String _PHONE_TYPES = "PHONE_TYPES";
    public static final java.lang.String _PLACE_TYPES = "PLACE_TYPES";
    public static final java.lang.String _PRIVATE_LAYER_TYPES = "PRIVATE_LAYER_TYPES";
    public static final java.lang.String _PUBLIC_LAYER_TYPES = "PUBLIC_LAYER_TYPES";
    public static final java.lang.String _SCENE_STATUS_TYPES = "SCENE_STATUS_TYPES";
    public static final java.lang.String _SCENE_VISIBILITY_TYPES = "SCENE_VISIBILITY_TYPES";
    public static final java.lang.String _USER_TYPES = "USER_TYPES";
    public static final java.lang.String _VEHICLE_ID_TYPES = "VEHICLE_ID_TYPES";
    public static final java.lang.String _VEHICLE_TYPES = "VEHICLE_TYPES";
    public static final ResourcesTypesEnum ACL_PERMISSION_TYPES = new ResourcesTypesEnum(_ACL_PERMISSION_TYPES);
    public static final ResourcesTypesEnum CERTIFICATION_TYPES = new ResourcesTypesEnum(_CERTIFICATION_TYPES);
    public static final ResourcesTypesEnum COMMUNICATION_URI_TYPES = new ResourcesTypesEnum(_COMMUNICATION_URI_TYPES);
    public static final ResourcesTypesEnum COUNTRY_TYPES = new ResourcesTypesEnum(_COUNTRY_TYPES);
    public static final ResourcesTypesEnum EQUIPMENT_STATUS_TYPES = new ResourcesTypesEnum(_EQUIPMENT_STATUS_TYPES);
    public static final ResourcesTypesEnum EQUIPMENT_TYPES = new ResourcesTypesEnum(_EQUIPMENT_TYPES);
    public static final ResourcesTypesEnum EVENT_TYPES = new ResourcesTypesEnum(_EVENT_TYPES);
    public static final ResourcesTypesEnum EXTERNAL_ID_TYPES = new ResourcesTypesEnum(_EXTERNAL_ID_TYPES);
    public static final ResourcesTypesEnum FENCE_TYPES = new ResourcesTypesEnum(_FENCE_TYPES);
    public static final ResourcesTypesEnum KIT_STATUS_TYPES = new ResourcesTypesEnum(_KIT_STATUS_TYPES);
    public static final ResourcesTypesEnum KIT_TYPES = new ResourcesTypesEnum(_KIT_TYPES);
    public static final ResourcesTypesEnum MISSION_CATEGORY_TYPES = new ResourcesTypesEnum(_MISSION_CATEGORY_TYPES);
    public static final ResourcesTypesEnum MISSION_CERTAINTY_TYPES = new ResourcesTypesEnum(_MISSION_CERTAINTY_TYPES);
    public static final ResourcesTypesEnum MISSION_SCOPE_TYPES = new ResourcesTypesEnum(_MISSION_SCOPE_TYPES);
    public static final ResourcesTypesEnum MISSION_SEVERITY_TYPES = new ResourcesTypesEnum(_MISSION_SEVERITY_TYPES);
    public static final ResourcesTypesEnum MISSION_STATUS_TYPES = new ResourcesTypesEnum(_MISSION_STATUS_TYPES);
    public static final ResourcesTypesEnum MISSION_URGENCY_TYPES = new ResourcesTypesEnum(_MISSION_URGENCY_TYPES);
    public static final ResourcesTypesEnum ORGANIZATION_TYPES = new ResourcesTypesEnum(_ORGANIZATION_TYPES);
    public static final ResourcesTypesEnum PERSONAL_TITLE_TYPES = new ResourcesTypesEnum(_PERSONAL_TITLE_TYPES);
    public static final ResourcesTypesEnum PHONE_TYPES = new ResourcesTypesEnum(_PHONE_TYPES);
    public static final ResourcesTypesEnum PLACE_TYPES = new ResourcesTypesEnum(_PLACE_TYPES);
    public static final ResourcesTypesEnum PRIVATE_LAYER_TYPES = new ResourcesTypesEnum(_PRIVATE_LAYER_TYPES);
    public static final ResourcesTypesEnum PUBLIC_LAYER_TYPES = new ResourcesTypesEnum(_PUBLIC_LAYER_TYPES);
    public static final ResourcesTypesEnum SCENE_STATUS_TYPES = new ResourcesTypesEnum(_SCENE_STATUS_TYPES);
    public static final ResourcesTypesEnum SCENE_VISIBILITY_TYPES = new ResourcesTypesEnum(_SCENE_VISIBILITY_TYPES);
    public static final ResourcesTypesEnum USER_TYPES = new ResourcesTypesEnum(_USER_TYPES);
    public static final ResourcesTypesEnum VEHICLE_ID_TYPES = new ResourcesTypesEnum(_VEHICLE_ID_TYPES);
    public static final ResourcesTypesEnum VEHICLE_TYPES = new ResourcesTypesEnum(_VEHICLE_TYPES);
    public java.lang.String getValue() { return _value_;}
    public static ResourcesTypesEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ResourcesTypesEnum enumeration = (ResourcesTypesEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ResourcesTypesEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourcesTypesEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "resourcesTypesEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
