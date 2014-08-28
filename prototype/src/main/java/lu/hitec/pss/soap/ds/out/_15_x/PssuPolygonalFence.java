/**
 * PssuPolygonalFence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class PssuPolygonalFence  extends lu.hitec.pss.soap.ds.out._15_x.PssuFence  implements java.io.Serializable {
    private lu.hitec.pss.soap.ds.out._15_x.PssuPoint[] points;

    public PssuPolygonalFence() {
    }

    public PssuPolygonalFence(
           java.lang.String description,
           java.lang.String type,
           java.lang.String uid,
           lu.hitec.pss.soap.ds.out._15_x.PssuPoint[] points) {
        super(
            description,
            type,
            uid);
        this.points = points;
    }


    /**
     * Gets the points value for this PssuPolygonalFence.
     * 
     * @return points
     */
    public lu.hitec.pss.soap.ds.out._15_x.PssuPoint[] getPoints() {
        return points;
    }


    /**
     * Sets the points value for this PssuPolygonalFence.
     * 
     * @param points
     */
    public void setPoints(lu.hitec.pss.soap.ds.out._15_x.PssuPoint[] points) {
        this.points = points;
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuPoint getPoints(int i) {
        return this.points[i];
    }

    public void setPoints(int i, lu.hitec.pss.soap.ds.out._15_x.PssuPoint _value) {
        this.points[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssuPolygonalFence)) return false;
        PssuPolygonalFence other = (PssuPolygonalFence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.points==null && other.getPoints()==null) || 
             (this.points!=null &&
              java.util.Arrays.equals(this.points, other.getPoints())));
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
        if (getPoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPoints(), i);
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
        new org.apache.axis.description.TypeDesc(PssuPolygonalFence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuPolygonalFence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("points");
        elemField.setXmlName(new javax.xml.namespace.QName("", "points"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuPoint"));
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
