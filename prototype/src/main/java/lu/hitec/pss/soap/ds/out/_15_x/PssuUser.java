/**
 * PssuUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class PssuUser  extends lu.hitec.pss.soap.ds.out._15_x.PssuUnit  implements java.io.Serializable {
    private java.util.Calendar birthDate;

    private java.lang.String country;

    private java.lang.String defaultPage;

    private java.lang.String firstname;

    private java.lang.String gender;

    private boolean hasPicture;

    private java.lang.String jobTitle;

    private java.lang.String lastname;

    private java.lang.String localityName;

    private java.lang.String organizationalUnitName;

    private java.lang.String password;

    private java.lang.String personalTitle;

    private java.lang.String postalCode;

    private java.lang.String preferredLanguage;

    private java.lang.String primaryMail;

    private long quota;

    private int quotaInMb;

    private java.lang.String streetAddress;

    private java.lang.String surfaceID;

    private boolean tracePrivacy;

    private boolean userEnabled;

    private lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] userPreferences;

    private java.lang.String widgetConfiguration;

    public PssuUser() {
    }

    public PssuUser(
           lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] communicationUris,
           java.lang.String[] mails,
           lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] phones,
           java.lang.String type,
           java.lang.String uid,
           java.util.Calendar birthDate,
           java.lang.String country,
           java.lang.String defaultPage,
           java.lang.String firstname,
           java.lang.String gender,
           boolean hasPicture,
           java.lang.String jobTitle,
           java.lang.String lastname,
           java.lang.String localityName,
           java.lang.String organizationalUnitName,
           java.lang.String password,
           java.lang.String personalTitle,
           java.lang.String postalCode,
           java.lang.String preferredLanguage,
           java.lang.String primaryMail,
           long quota,
           int quotaInMb,
           java.lang.String streetAddress,
           java.lang.String surfaceID,
           boolean tracePrivacy,
           boolean userEnabled,
           lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] userPreferences,
           java.lang.String widgetConfiguration) {
        super(
            communicationUris,
            mails,
            phones,
            type,
            uid);
        this.birthDate = birthDate;
        this.country = country;
        this.defaultPage = defaultPage;
        this.firstname = firstname;
        this.gender = gender;
        this.hasPicture = hasPicture;
        this.jobTitle = jobTitle;
        this.lastname = lastname;
        this.localityName = localityName;
        this.organizationalUnitName = organizationalUnitName;
        this.password = password;
        this.personalTitle = personalTitle;
        this.postalCode = postalCode;
        this.preferredLanguage = preferredLanguage;
        this.primaryMail = primaryMail;
        this.quota = quota;
        this.quotaInMb = quotaInMb;
        this.streetAddress = streetAddress;
        this.surfaceID = surfaceID;
        this.tracePrivacy = tracePrivacy;
        this.userEnabled = userEnabled;
        this.userPreferences = userPreferences;
        this.widgetConfiguration = widgetConfiguration;
    }


    /**
     * Gets the birthDate value for this PssuUser.
     * 
     * @return birthDate
     */
    public java.util.Calendar getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this PssuUser.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Calendar birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the country value for this PssuUser.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this PssuUser.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the defaultPage value for this PssuUser.
     * 
     * @return defaultPage
     */
    public java.lang.String getDefaultPage() {
        return defaultPage;
    }


    /**
     * Sets the defaultPage value for this PssuUser.
     * 
     * @param defaultPage
     */
    public void setDefaultPage(java.lang.String defaultPage) {
        this.defaultPage = defaultPage;
    }


    /**
     * Gets the firstname value for this PssuUser.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this PssuUser.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
    }


    /**
     * Gets the gender value for this PssuUser.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this PssuUser.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the hasPicture value for this PssuUser.
     * 
     * @return hasPicture
     */
    public boolean isHasPicture() {
        return hasPicture;
    }


    /**
     * Sets the hasPicture value for this PssuUser.
     * 
     * @param hasPicture
     */
    public void setHasPicture(boolean hasPicture) {
        this.hasPicture = hasPicture;
    }


    /**
     * Gets the jobTitle value for this PssuUser.
     * 
     * @return jobTitle
     */
    public java.lang.String getJobTitle() {
        return jobTitle;
    }


    /**
     * Sets the jobTitle value for this PssuUser.
     * 
     * @param jobTitle
     */
    public void setJobTitle(java.lang.String jobTitle) {
        this.jobTitle = jobTitle;
    }


    /**
     * Gets the lastname value for this PssuUser.
     * 
     * @return lastname
     */
    public java.lang.String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this PssuUser.
     * 
     * @param lastname
     */
    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
    }


    /**
     * Gets the localityName value for this PssuUser.
     * 
     * @return localityName
     */
    public java.lang.String getLocalityName() {
        return localityName;
    }


    /**
     * Sets the localityName value for this PssuUser.
     * 
     * @param localityName
     */
    public void setLocalityName(java.lang.String localityName) {
        this.localityName = localityName;
    }


    /**
     * Gets the organizationalUnitName value for this PssuUser.
     * 
     * @return organizationalUnitName
     */
    public java.lang.String getOrganizationalUnitName() {
        return organizationalUnitName;
    }


    /**
     * Sets the organizationalUnitName value for this PssuUser.
     * 
     * @param organizationalUnitName
     */
    public void setOrganizationalUnitName(java.lang.String organizationalUnitName) {
        this.organizationalUnitName = organizationalUnitName;
    }


    /**
     * Gets the password value for this PssuUser.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this PssuUser.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the personalTitle value for this PssuUser.
     * 
     * @return personalTitle
     */
    public java.lang.String getPersonalTitle() {
        return personalTitle;
    }


    /**
     * Sets the personalTitle value for this PssuUser.
     * 
     * @param personalTitle
     */
    public void setPersonalTitle(java.lang.String personalTitle) {
        this.personalTitle = personalTitle;
    }


    /**
     * Gets the postalCode value for this PssuUser.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this PssuUser.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the preferredLanguage value for this PssuUser.
     * 
     * @return preferredLanguage
     */
    public java.lang.String getPreferredLanguage() {
        return preferredLanguage;
    }


    /**
     * Sets the preferredLanguage value for this PssuUser.
     * 
     * @param preferredLanguage
     */
    public void setPreferredLanguage(java.lang.String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }


    /**
     * Gets the primaryMail value for this PssuUser.
     * 
     * @return primaryMail
     */
    public java.lang.String getPrimaryMail() {
        return primaryMail;
    }


    /**
     * Sets the primaryMail value for this PssuUser.
     * 
     * @param primaryMail
     */
    public void setPrimaryMail(java.lang.String primaryMail) {
        this.primaryMail = primaryMail;
    }


    /**
     * Gets the quota value for this PssuUser.
     * 
     * @return quota
     */
    public long getQuota() {
        return quota;
    }


    /**
     * Sets the quota value for this PssuUser.
     * 
     * @param quota
     */
    public void setQuota(long quota) {
        this.quota = quota;
    }


    /**
     * Gets the quotaInMb value for this PssuUser.
     * 
     * @return quotaInMb
     */
    public int getQuotaInMb() {
        return quotaInMb;
    }


    /**
     * Sets the quotaInMb value for this PssuUser.
     * 
     * @param quotaInMb
     */
    public void setQuotaInMb(int quotaInMb) {
        this.quotaInMb = quotaInMb;
    }


    /**
     * Gets the streetAddress value for this PssuUser.
     * 
     * @return streetAddress
     */
    public java.lang.String getStreetAddress() {
        return streetAddress;
    }


    /**
     * Sets the streetAddress value for this PssuUser.
     * 
     * @param streetAddress
     */
    public void setStreetAddress(java.lang.String streetAddress) {
        this.streetAddress = streetAddress;
    }


    /**
     * Gets the surfaceID value for this PssuUser.
     * 
     * @return surfaceID
     */
    public java.lang.String getSurfaceID() {
        return surfaceID;
    }


    /**
     * Sets the surfaceID value for this PssuUser.
     * 
     * @param surfaceID
     */
    public void setSurfaceID(java.lang.String surfaceID) {
        this.surfaceID = surfaceID;
    }


    /**
     * Gets the tracePrivacy value for this PssuUser.
     * 
     * @return tracePrivacy
     */
    public boolean isTracePrivacy() {
        return tracePrivacy;
    }


    /**
     * Sets the tracePrivacy value for this PssuUser.
     * 
     * @param tracePrivacy
     */
    public void setTracePrivacy(boolean tracePrivacy) {
        this.tracePrivacy = tracePrivacy;
    }


    /**
     * Gets the userEnabled value for this PssuUser.
     * 
     * @return userEnabled
     */
    public boolean isUserEnabled() {
        return userEnabled;
    }


    /**
     * Sets the userEnabled value for this PssuUser.
     * 
     * @param userEnabled
     */
    public void setUserEnabled(boolean userEnabled) {
        this.userEnabled = userEnabled;
    }


    /**
     * Gets the userPreferences value for this PssuUser.
     * 
     * @return userPreferences
     */
    public lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] getUserPreferences() {
        return userPreferences;
    }


    /**
     * Sets the userPreferences value for this PssuUser.
     * 
     * @param userPreferences
     */
    public void setUserPreferences(lu.hitec.pss.soap.ds.out._15_x.TypeValueComment[] userPreferences) {
        this.userPreferences = userPreferences;
    }

    public lu.hitec.pss.soap.ds.out._15_x.TypeValueComment getUserPreferences(int i) {
        return this.userPreferences[i];
    }

    public void setUserPreferences(int i, lu.hitec.pss.soap.ds.out._15_x.TypeValueComment _value) {
        this.userPreferences[i] = _value;
    }


    /**
     * Gets the widgetConfiguration value for this PssuUser.
     * 
     * @return widgetConfiguration
     */
    public java.lang.String getWidgetConfiguration() {
        return widgetConfiguration;
    }


    /**
     * Sets the widgetConfiguration value for this PssuUser.
     * 
     * @param widgetConfiguration
     */
    public void setWidgetConfiguration(java.lang.String widgetConfiguration) {
        this.widgetConfiguration = widgetConfiguration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssuUser)) return false;
        PssuUser other = (PssuUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.defaultPage==null && other.getDefaultPage()==null) || 
             (this.defaultPage!=null &&
              this.defaultPage.equals(other.getDefaultPage()))) &&
            ((this.firstname==null && other.getFirstname()==null) || 
             (this.firstname!=null &&
              this.firstname.equals(other.getFirstname()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            this.hasPicture == other.isHasPicture() &&
            ((this.jobTitle==null && other.getJobTitle()==null) || 
             (this.jobTitle!=null &&
              this.jobTitle.equals(other.getJobTitle()))) &&
            ((this.lastname==null && other.getLastname()==null) || 
             (this.lastname!=null &&
              this.lastname.equals(other.getLastname()))) &&
            ((this.localityName==null && other.getLocalityName()==null) || 
             (this.localityName!=null &&
              this.localityName.equals(other.getLocalityName()))) &&
            ((this.organizationalUnitName==null && other.getOrganizationalUnitName()==null) || 
             (this.organizationalUnitName!=null &&
              this.organizationalUnitName.equals(other.getOrganizationalUnitName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.personalTitle==null && other.getPersonalTitle()==null) || 
             (this.personalTitle!=null &&
              this.personalTitle.equals(other.getPersonalTitle()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.preferredLanguage==null && other.getPreferredLanguage()==null) || 
             (this.preferredLanguage!=null &&
              this.preferredLanguage.equals(other.getPreferredLanguage()))) &&
            ((this.primaryMail==null && other.getPrimaryMail()==null) || 
             (this.primaryMail!=null &&
              this.primaryMail.equals(other.getPrimaryMail()))) &&
            this.quota == other.getQuota() &&
            this.quotaInMb == other.getQuotaInMb() &&
            ((this.streetAddress==null && other.getStreetAddress()==null) || 
             (this.streetAddress!=null &&
              this.streetAddress.equals(other.getStreetAddress()))) &&
            ((this.surfaceID==null && other.getSurfaceID()==null) || 
             (this.surfaceID!=null &&
              this.surfaceID.equals(other.getSurfaceID()))) &&
            this.tracePrivacy == other.isTracePrivacy() &&
            this.userEnabled == other.isUserEnabled() &&
            ((this.userPreferences==null && other.getUserPreferences()==null) || 
             (this.userPreferences!=null &&
              java.util.Arrays.equals(this.userPreferences, other.getUserPreferences()))) &&
            ((this.widgetConfiguration==null && other.getWidgetConfiguration()==null) || 
             (this.widgetConfiguration!=null &&
              this.widgetConfiguration.equals(other.getWidgetConfiguration())));
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
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getDefaultPage() != null) {
            _hashCode += getDefaultPage().hashCode();
        }
        if (getFirstname() != null) {
            _hashCode += getFirstname().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        _hashCode += (isHasPicture() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getJobTitle() != null) {
            _hashCode += getJobTitle().hashCode();
        }
        if (getLastname() != null) {
            _hashCode += getLastname().hashCode();
        }
        if (getLocalityName() != null) {
            _hashCode += getLocalityName().hashCode();
        }
        if (getOrganizationalUnitName() != null) {
            _hashCode += getOrganizationalUnitName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPersonalTitle() != null) {
            _hashCode += getPersonalTitle().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getPreferredLanguage() != null) {
            _hashCode += getPreferredLanguage().hashCode();
        }
        if (getPrimaryMail() != null) {
            _hashCode += getPrimaryMail().hashCode();
        }
        _hashCode += new Long(getQuota()).hashCode();
        _hashCode += getQuotaInMb();
        if (getStreetAddress() != null) {
            _hashCode += getStreetAddress().hashCode();
        }
        if (getSurfaceID() != null) {
            _hashCode += getSurfaceID().hashCode();
        }
        _hashCode += (isTracePrivacy() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUserEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUserPreferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserPreferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserPreferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWidgetConfiguration() != null) {
            _hashCode += getWidgetConfiguration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssuUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("defaultPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultPage"));
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
        elemField.setFieldName("hasPicture");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasPicture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobTitle"));
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
        elemField.setFieldName("localityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationalUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organizationalUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personalTitle"));
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
        elemField.setFieldName("preferredLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferredLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryMail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaInMb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quotaInMb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streetAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surfaceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surfaceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracePrivacy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tracePrivacy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "typeValueComment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widgetConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "widgetConfiguration"));
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
