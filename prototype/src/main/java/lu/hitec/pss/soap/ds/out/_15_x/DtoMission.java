/**
 * DtoMission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class DtoMission  implements java.io.Serializable {
    private java.lang.String area;

    private java.util.Calendar createTimestamp;

    private java.lang.String description;

    private java.lang.String displayName;

    private java.lang.Boolean hasPicture;

    private java.lang.String locality;

    private java.lang.String[] middlewares;

    private java.lang.String[] missionCategories;

    private java.lang.String missionCertainty;

    private java.lang.String missionScope;

    private java.lang.String missionSeverity;

    private java.lang.String missionStatus;

    private java.lang.String missionType;

    private java.lang.String missionUrgency;

    private java.util.Calendar modifyTimestamp;

    private java.lang.String owner;

    private java.lang.String postalCode;

    private java.lang.String[] privateLayerMembers;

    private java.lang.String uniqueId;

    private lu.hitec.pss.soap.ds.out._15_x.WorkflowStatus workflowStatus;

    private int zoomLevel;

    public DtoMission() {
    }

    public DtoMission(
           java.lang.String area,
           java.util.Calendar createTimestamp,
           java.lang.String description,
           java.lang.String displayName,
           java.lang.Boolean hasPicture,
           java.lang.String locality,
           java.lang.String[] middlewares,
           java.lang.String[] missionCategories,
           java.lang.String missionCertainty,
           java.lang.String missionScope,
           java.lang.String missionSeverity,
           java.lang.String missionStatus,
           java.lang.String missionType,
           java.lang.String missionUrgency,
           java.util.Calendar modifyTimestamp,
           java.lang.String owner,
           java.lang.String postalCode,
           java.lang.String[] privateLayerMembers,
           java.lang.String uniqueId,
           lu.hitec.pss.soap.ds.out._15_x.WorkflowStatus workflowStatus,
           int zoomLevel) {
           this.area = area;
           this.createTimestamp = createTimestamp;
           this.description = description;
           this.displayName = displayName;
           this.hasPicture = hasPicture;
           this.locality = locality;
           this.middlewares = middlewares;
           this.missionCategories = missionCategories;
           this.missionCertainty = missionCertainty;
           this.missionScope = missionScope;
           this.missionSeverity = missionSeverity;
           this.missionStatus = missionStatus;
           this.missionType = missionType;
           this.missionUrgency = missionUrgency;
           this.modifyTimestamp = modifyTimestamp;
           this.owner = owner;
           this.postalCode = postalCode;
           this.privateLayerMembers = privateLayerMembers;
           this.uniqueId = uniqueId;
           this.workflowStatus = workflowStatus;
           this.zoomLevel = zoomLevel;
    }


    /**
     * Gets the area value for this DtoMission.
     * 
     * @return area
     */
    public java.lang.String getArea() {
        return area;
    }


    /**
     * Sets the area value for this DtoMission.
     * 
     * @param area
     */
    public void setArea(java.lang.String area) {
        this.area = area;
    }


    /**
     * Gets the createTimestamp value for this DtoMission.
     * 
     * @return createTimestamp
     */
    public java.util.Calendar getCreateTimestamp() {
        return createTimestamp;
    }


    /**
     * Sets the createTimestamp value for this DtoMission.
     * 
     * @param createTimestamp
     */
    public void setCreateTimestamp(java.util.Calendar createTimestamp) {
        this.createTimestamp = createTimestamp;
    }


    /**
     * Gets the description value for this DtoMission.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DtoMission.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the displayName value for this DtoMission.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this DtoMission.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the hasPicture value for this DtoMission.
     * 
     * @return hasPicture
     */
    public java.lang.Boolean getHasPicture() {
        return hasPicture;
    }


    /**
     * Sets the hasPicture value for this DtoMission.
     * 
     * @param hasPicture
     */
    public void setHasPicture(java.lang.Boolean hasPicture) {
        this.hasPicture = hasPicture;
    }


    /**
     * Gets the locality value for this DtoMission.
     * 
     * @return locality
     */
    public java.lang.String getLocality() {
        return locality;
    }


    /**
     * Sets the locality value for this DtoMission.
     * 
     * @param locality
     */
    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }


    /**
     * Gets the middlewares value for this DtoMission.
     * 
     * @return middlewares
     */
    public java.lang.String[] getMiddlewares() {
        return middlewares;
    }


    /**
     * Sets the middlewares value for this DtoMission.
     * 
     * @param middlewares
     */
    public void setMiddlewares(java.lang.String[] middlewares) {
        this.middlewares = middlewares;
    }

    public java.lang.String getMiddlewares(int i) {
        return this.middlewares[i];
    }

    public void setMiddlewares(int i, java.lang.String _value) {
        this.middlewares[i] = _value;
    }


    /**
     * Gets the missionCategories value for this DtoMission.
     * 
     * @return missionCategories
     */
    public java.lang.String[] getMissionCategories() {
        return missionCategories;
    }


    /**
     * Sets the missionCategories value for this DtoMission.
     * 
     * @param missionCategories
     */
    public void setMissionCategories(java.lang.String[] missionCategories) {
        this.missionCategories = missionCategories;
    }

    public java.lang.String getMissionCategories(int i) {
        return this.missionCategories[i];
    }

    public void setMissionCategories(int i, java.lang.String _value) {
        this.missionCategories[i] = _value;
    }


    /**
     * Gets the missionCertainty value for this DtoMission.
     * 
     * @return missionCertainty
     */
    public java.lang.String getMissionCertainty() {
        return missionCertainty;
    }


    /**
     * Sets the missionCertainty value for this DtoMission.
     * 
     * @param missionCertainty
     */
    public void setMissionCertainty(java.lang.String missionCertainty) {
        this.missionCertainty = missionCertainty;
    }


    /**
     * Gets the missionScope value for this DtoMission.
     * 
     * @return missionScope
     */
    public java.lang.String getMissionScope() {
        return missionScope;
    }


    /**
     * Sets the missionScope value for this DtoMission.
     * 
     * @param missionScope
     */
    public void setMissionScope(java.lang.String missionScope) {
        this.missionScope = missionScope;
    }


    /**
     * Gets the missionSeverity value for this DtoMission.
     * 
     * @return missionSeverity
     */
    public java.lang.String getMissionSeverity() {
        return missionSeverity;
    }


    /**
     * Sets the missionSeverity value for this DtoMission.
     * 
     * @param missionSeverity
     */
    public void setMissionSeverity(java.lang.String missionSeverity) {
        this.missionSeverity = missionSeverity;
    }


    /**
     * Gets the missionStatus value for this DtoMission.
     * 
     * @return missionStatus
     */
    public java.lang.String getMissionStatus() {
        return missionStatus;
    }


    /**
     * Sets the missionStatus value for this DtoMission.
     * 
     * @param missionStatus
     */
    public void setMissionStatus(java.lang.String missionStatus) {
        this.missionStatus = missionStatus;
    }


    /**
     * Gets the missionType value for this DtoMission.
     * 
     * @return missionType
     */
    public java.lang.String getMissionType() {
        return missionType;
    }


    /**
     * Sets the missionType value for this DtoMission.
     * 
     * @param missionType
     */
    public void setMissionType(java.lang.String missionType) {
        this.missionType = missionType;
    }


    /**
     * Gets the missionUrgency value for this DtoMission.
     * 
     * @return missionUrgency
     */
    public java.lang.String getMissionUrgency() {
        return missionUrgency;
    }


    /**
     * Sets the missionUrgency value for this DtoMission.
     * 
     * @param missionUrgency
     */
    public void setMissionUrgency(java.lang.String missionUrgency) {
        this.missionUrgency = missionUrgency;
    }


    /**
     * Gets the modifyTimestamp value for this DtoMission.
     * 
     * @return modifyTimestamp
     */
    public java.util.Calendar getModifyTimestamp() {
        return modifyTimestamp;
    }


    /**
     * Sets the modifyTimestamp value for this DtoMission.
     * 
     * @param modifyTimestamp
     */
    public void setModifyTimestamp(java.util.Calendar modifyTimestamp) {
        this.modifyTimestamp = modifyTimestamp;
    }


    /**
     * Gets the owner value for this DtoMission.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this DtoMission.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the postalCode value for this DtoMission.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this DtoMission.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the privateLayerMembers value for this DtoMission.
     * 
     * @return privateLayerMembers
     */
    public java.lang.String[] getPrivateLayerMembers() {
        return privateLayerMembers;
    }


    /**
     * Sets the privateLayerMembers value for this DtoMission.
     * 
     * @param privateLayerMembers
     */
    public void setPrivateLayerMembers(java.lang.String[] privateLayerMembers) {
        this.privateLayerMembers = privateLayerMembers;
    }

    public java.lang.String getPrivateLayerMembers(int i) {
        return this.privateLayerMembers[i];
    }

    public void setPrivateLayerMembers(int i, java.lang.String _value) {
        this.privateLayerMembers[i] = _value;
    }


    /**
     * Gets the uniqueId value for this DtoMission.
     * 
     * @return uniqueId
     */
    public java.lang.String getUniqueId() {
        return uniqueId;
    }


    /**
     * Sets the uniqueId value for this DtoMission.
     * 
     * @param uniqueId
     */
    public void setUniqueId(java.lang.String uniqueId) {
        this.uniqueId = uniqueId;
    }


    /**
     * Gets the workflowStatus value for this DtoMission.
     * 
     * @return workflowStatus
     */
    public lu.hitec.pss.soap.ds.out._15_x.WorkflowStatus getWorkflowStatus() {
        return workflowStatus;
    }


    /**
     * Sets the workflowStatus value for this DtoMission.
     * 
     * @param workflowStatus
     */
    public void setWorkflowStatus(lu.hitec.pss.soap.ds.out._15_x.WorkflowStatus workflowStatus) {
        this.workflowStatus = workflowStatus;
    }


    /**
     * Gets the zoomLevel value for this DtoMission.
     * 
     * @return zoomLevel
     */
    public int getZoomLevel() {
        return zoomLevel;
    }


    /**
     * Sets the zoomLevel value for this DtoMission.
     * 
     * @param zoomLevel
     */
    public void setZoomLevel(int zoomLevel) {
        this.zoomLevel = zoomLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DtoMission)) return false;
        DtoMission other = (DtoMission) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.area==null && other.getArea()==null) || 
             (this.area!=null &&
              this.area.equals(other.getArea()))) &&
            ((this.createTimestamp==null && other.getCreateTimestamp()==null) || 
             (this.createTimestamp!=null &&
              this.createTimestamp.equals(other.getCreateTimestamp()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.hasPicture==null && other.getHasPicture()==null) || 
             (this.hasPicture!=null &&
              this.hasPicture.equals(other.getHasPicture()))) &&
            ((this.locality==null && other.getLocality()==null) || 
             (this.locality!=null &&
              this.locality.equals(other.getLocality()))) &&
            ((this.middlewares==null && other.getMiddlewares()==null) || 
             (this.middlewares!=null &&
              java.util.Arrays.equals(this.middlewares, other.getMiddlewares()))) &&
            ((this.missionCategories==null && other.getMissionCategories()==null) || 
             (this.missionCategories!=null &&
              java.util.Arrays.equals(this.missionCategories, other.getMissionCategories()))) &&
            ((this.missionCertainty==null && other.getMissionCertainty()==null) || 
             (this.missionCertainty!=null &&
              this.missionCertainty.equals(other.getMissionCertainty()))) &&
            ((this.missionScope==null && other.getMissionScope()==null) || 
             (this.missionScope!=null &&
              this.missionScope.equals(other.getMissionScope()))) &&
            ((this.missionSeverity==null && other.getMissionSeverity()==null) || 
             (this.missionSeverity!=null &&
              this.missionSeverity.equals(other.getMissionSeverity()))) &&
            ((this.missionStatus==null && other.getMissionStatus()==null) || 
             (this.missionStatus!=null &&
              this.missionStatus.equals(other.getMissionStatus()))) &&
            ((this.missionType==null && other.getMissionType()==null) || 
             (this.missionType!=null &&
              this.missionType.equals(other.getMissionType()))) &&
            ((this.missionUrgency==null && other.getMissionUrgency()==null) || 
             (this.missionUrgency!=null &&
              this.missionUrgency.equals(other.getMissionUrgency()))) &&
            ((this.modifyTimestamp==null && other.getModifyTimestamp()==null) || 
             (this.modifyTimestamp!=null &&
              this.modifyTimestamp.equals(other.getModifyTimestamp()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.privateLayerMembers==null && other.getPrivateLayerMembers()==null) || 
             (this.privateLayerMembers!=null &&
              java.util.Arrays.equals(this.privateLayerMembers, other.getPrivateLayerMembers()))) &&
            ((this.uniqueId==null && other.getUniqueId()==null) || 
             (this.uniqueId!=null &&
              this.uniqueId.equals(other.getUniqueId()))) &&
            ((this.workflowStatus==null && other.getWorkflowStatus()==null) || 
             (this.workflowStatus!=null &&
              this.workflowStatus.equals(other.getWorkflowStatus()))) &&
            this.zoomLevel == other.getZoomLevel();
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
        if (getArea() != null) {
            _hashCode += getArea().hashCode();
        }
        if (getCreateTimestamp() != null) {
            _hashCode += getCreateTimestamp().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getHasPicture() != null) {
            _hashCode += getHasPicture().hashCode();
        }
        if (getLocality() != null) {
            _hashCode += getLocality().hashCode();
        }
        if (getMiddlewares() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMiddlewares());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMiddlewares(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMissionCategories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMissionCategories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMissionCategories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMissionCertainty() != null) {
            _hashCode += getMissionCertainty().hashCode();
        }
        if (getMissionScope() != null) {
            _hashCode += getMissionScope().hashCode();
        }
        if (getMissionSeverity() != null) {
            _hashCode += getMissionSeverity().hashCode();
        }
        if (getMissionStatus() != null) {
            _hashCode += getMissionStatus().hashCode();
        }
        if (getMissionType() != null) {
            _hashCode += getMissionType().hashCode();
        }
        if (getMissionUrgency() != null) {
            _hashCode += getMissionUrgency().hashCode();
        }
        if (getModifyTimestamp() != null) {
            _hashCode += getModifyTimestamp().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getPrivateLayerMembers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrivateLayerMembers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrivateLayerMembers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUniqueId() != null) {
            _hashCode += getUniqueId().hashCode();
        }
        if (getWorkflowStatus() != null) {
            _hashCode += getWorkflowStatus().hashCode();
        }
        _hashCode += getZoomLevel();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DtoMission.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoMission"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("area");
        elemField.setXmlName(new javax.xml.namespace.QName("", "area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("hasPicture");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasPicture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middlewares");
        elemField.setXmlName(new javax.xml.namespace.QName("", "middlewares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missionCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("", "missionCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missionCertainty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "missionCertainty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missionScope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "missionScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missionSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "missionSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "missionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "missionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missionUrgency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "missionUrgency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifyTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner"));
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
        elemField.setFieldName("privateLayerMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateLayerMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workflowStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "workflowStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoomLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zoomLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
