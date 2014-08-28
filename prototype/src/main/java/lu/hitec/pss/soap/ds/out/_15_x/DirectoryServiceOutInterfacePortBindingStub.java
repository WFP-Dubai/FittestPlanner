/**
 * DirectoryServiceOutInterfacePortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lu.hitec.pss.soap.ds.out._15_x;

public class DirectoryServiceOutInterfacePortBindingStub extends org.apache.axis.client.Stub implements lu.hitec.pss.soap.ds.out._15_x.DirectoryServiceOutInterface_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[97];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getThreshold");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "thresholdId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoThreshold"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoThreshold.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProfilesForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoProfile"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoProfile[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProfileIdsForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("authenticate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "uid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "token"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCasualtiesByMission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "missionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoCasualty"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoCasualty[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeviceCapabilitiesByUnitId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId"), lu.hitec.pss.soap.ds.out._15_x.UnitId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "excludeDeviceCapabilities"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "deviceCapabilityEnum"), lu.hitec.pss.soap.ds.out._15_x.DeviceCapabilityEnum[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDevicesAssignedToUnitForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId"), lu.hitec.pss.soap.ds.out._15_x.UnitId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuDevice"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuDevice[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEquipmentIdsAssignedToKitForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "kitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("authenticateWithSurfaceId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "surfaceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "token"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeviceIdsAssignedToUnitForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId"), lu.hitec.pss.soap.ds.out._15_x.UnitId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDevicesWithAssignmentForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuDeviceWithAssignment"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuDeviceWithAssignment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPrimaryLocalisationDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId"), lu.hitec.pss.soap.ds.out._15_x.UnitId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuDevice"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuDevice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnitsAssignedToMissionForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "missionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitType"), lu.hitec.pss.soap.ds.out._15_x.UnitType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUnit"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuUnit[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserIdsAssignedToProfileForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMissionsAssignedToUnitForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId"), lu.hitec.pss.soap.ds.out._15_x.UnitId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoMission"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoMission[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getKitIdAssignedToEquipmentForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "equipmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFenceIdsAssignedToMissionForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "missionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInternalIdsAssignedToKit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "kitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "internalId"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.InternalId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFencesAssignedToMissionForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "missionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuFence"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuFence[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPictureAssignedToEquipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "equipmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnitIdsAssignedToMissionForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "missionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitType"), lu.hitec.pss.soap.ds.out._15_x.UnitType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPictureAssignedToMission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "missionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInternalIdsAssignedToUnit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId"), lu.hitec.pss.soap.ds.out._15_x.UnitId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "internalId"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.InternalId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUsersAssignedToProfileForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUser"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProfileIdsAssignedToUserForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnitIdAssignedToDeviceForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.UnitId.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEquipmentsAssignedToKitForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "kitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoEquipment"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoEquipment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMissionsAssignedToFenceForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fenceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoMission"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoMission[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProfilesAssignedToUserForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoProfile"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoProfile[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMissionIdsAssignedToUnitForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId"), lu.hitec.pss.soap.ds.out._15_x.UnitId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getKitAssignedToEquipmentForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "equipmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoKit"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoKit.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMissionsAssignedToProfileForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoMission"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoMission[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPictureAssignedToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnitAssignedToDeviceForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUnit"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuUnit.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getKitIdsAssignedToUnitForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId"), lu.hitec.pss.soap.ds.out._15_x.UnitId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnitIdAssignedToKitForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "kitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.UnitId.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMissionIdsAssignedToFenceForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fenceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFence");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fenceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuFence"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuFence.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getKit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "kitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoKit"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoKit.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEquipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "equipmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoEquipment"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoEquipment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCasualty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "casualtyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoCasualty"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoCasualty.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEquipmentsForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoEquipment"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoEquipment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getKitsForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoKit"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoKit[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDevicesForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuDevice"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuDevice[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMissionIdsForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuDevice"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuDevice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "missionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoMission"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoMission.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPlacesForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuPlace"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuPlace[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMissionsForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoMission"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoMission[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUsersForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUser"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "widgetId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoWidget"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoWidget.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVehicle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "vehicleId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuVehicle"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuVehicle.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRefugee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refugeeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoRefugee"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoRefugee.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUser"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuUser.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchDevices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuDevice"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuDevice[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUser"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVehiclesForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuVehicle"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoProfile"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoProfile.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMyPicture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPlace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "placeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuPlace"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuPlace.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getThresholdsForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoThreshold"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoThreshold[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWidgetsForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoWidget"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoWidget[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchFences");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuFence"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuFence[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchPlaces");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuPlace"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuPlace[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMyDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUser"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuUser.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInternalIdsAssignedToEquipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "equipmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "internalId"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.InternalId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMissionIdsByMiddlewareMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mwId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrganizationIdsAssignedToProfileForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrganizationIdsAssignedToUnitForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId"), lu.hitec.pss.soap.ds.out._15_x.UnitId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMissionIdsAssignedToProfileForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profileId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCertificationsAssignedToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoCertification"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoCertification[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUsersAssignedToCertification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "certificationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUser"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDevicesAssignedToUnitForCrudAndCapabilities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId"), lu.hitec.pss.soap.ds.out._15_x.UnitId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceCapabilites"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "deviceCapabilityEnum"), lu.hitec.pss.soap.ds.out._15_x.DeviceCapabilityEnum[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuDevice"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuDevice[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCertifications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoCertification"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoCertification[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCircularFencesForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuCircularFence"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuCircularFence[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getKitsAssignedToUnitForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId"), lu.hitec.pss.soap.ds.out._15_x.UnitId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoKit"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoKit[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMiddlewaresForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoMiddleware"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoMiddleware[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMissionIdsForCrudFiltered");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "workflowStatus"), lu.hitec.pss.soap.ds.out._15_x.WorkflowStatus.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMissionsForCrudFiltered");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "workflowStatus"), lu.hitec.pss.soap.ds.out._15_x.WorkflowStatus.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoMission"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoMission[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMyCertifications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoCertification"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoCertification[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMyDashboardWidgets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMyPermissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrganizationIdsForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPolygonalFencesForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuPolygonalFence"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuPolygonalFence[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCertification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "certificationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoCertification"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoCertification.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnitAssignedToKitForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "kitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUnit"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuUnit.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchMissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoMission"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoMission[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnAssignedPlacesForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuPlace"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuPlace[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchVehicles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuVehicle"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRefugeesByMission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "missionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoRefugee"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.DtoRefugee[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getResourceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "typeType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "resourcesTypesEnum"), lu.hitec.pss.soap.ds.out._15_x.ResourcesTypesEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resourceTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuResourceType"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuResourceType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"),
                      "lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException"), 
                      true
                     ));
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnAssignedUsersForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUser"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rest"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProjectDetails");
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "project"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.Project.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUidBySurfaceId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "surfaceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getResourceTypesForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "typeType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "resourcesTypesEnum"), lu.hitec.pss.soap.ds.out._15_x.ResourcesTypesEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuResourceType"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuResourceType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnAssignedVehiclesForCrud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "crud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum"), lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuVehicle"));
        oper.setReturnClass(lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "res"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthorizationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"),
                      "lu.hitec.pss.soap.ds.out._15_x.AuthenticationException",
                      new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException"), 
                      true
                     ));
        _operations[96] = oper;

    }

    public DirectoryServiceOutInterfacePortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DirectoryServiceOutInterfacePortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DirectoryServiceOutInterfacePortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthenticationException");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.AuthenticationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "AuthorizationException");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.AuthorizationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "cameraPictureInternalId");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.CameraPictureInternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "cameraVideoInternalId");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.CameraVideoInternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "crudEnum");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.CrudEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "deviceCapabilityEnum");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.DeviceCapabilityEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "documentFileInternalId");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.DocumentFileInternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoCasualty");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.DtoCasualty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoCertification");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.DtoCertification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoEquipment");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.DtoEquipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoKit");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.DtoKit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoMiddleware");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.DtoMiddleware.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoMission");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.DtoMission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoProfile");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.DtoProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoRefugee");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.DtoRefugee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoThreshold");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.DtoThreshold.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "dtoWidget");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.DtoWidget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "internalId");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.InternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ldapPlaceInternalId");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.LdapPlaceInternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ldapUserInternalId");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.LdapUserInternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ldapVehicleInternalId");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.LdapVehicleInternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "mapelementKMLFileInternalId");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.MapelementKMLFileInternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "mapelementKMZFileInternalId");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.MapelementKMZFileInternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "mapelementLibraryInternalId");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.MapelementLibraryInternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "mapelementSceneInternalId");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.MapelementSceneInternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "project");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.Project.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuCircularFence");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.PssuCircularFence.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuDevice");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.PssuDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuDeviceWithAssignment");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.PssuDeviceWithAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuFence");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.PssuFence.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuPlace");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.PssuPlace.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuPoint");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.PssuPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuPolygonalFence");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.PssuPolygonalFence.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuResourceType");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.PssuResourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUnit");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.PssuUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuUser");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.PssuUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "pssuVehicle");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.PssuVehicle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "ResourceNotFoundException");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "resourcesTypesEnum");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.ResourcesTypesEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "sensorDeviceInternalId");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.SensorDeviceInternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "serviceEnum");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.ServiceEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "typeValueComment");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.TypeValueComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitId");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.UnitId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "unitType");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.UnitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "workflowStatus");
            cachedSerQNames.add(qName);
            cls = lu.hitec.pss.soap.ds.out._15_x.WorkflowStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoThreshold getThreshold(java.lang.String token, java.lang.String thresholdId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getThreshold"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, thresholdId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoThreshold) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoThreshold) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoThreshold.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoProfile[] getProfilesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getProfilesForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoProfile[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoProfile[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoProfile[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getProfileIdsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getProfileIdsForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String authenticate(java.lang.String uid, java.lang.String credential, java.lang.String sessionId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "authenticate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uid, credential, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoCasualty[] getCasualtiesByMission(java.lang.String token, java.lang.String missionId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getCasualtiesByMission"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, missionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoCasualty[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoCasualty[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoCasualty[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getDeviceCapabilitiesByUnitId(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.DeviceCapabilityEnum[] excludeDeviceCapabilities) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getDeviceCapabilitiesByUnitId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, unitId, excludeDeviceCapabilities});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuDevice[] getDevicesAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getDevicesAssignedToUnitForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, unitId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDevice[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDevice[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuDevice[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getEquipmentIdsAssignedToKitForCrud(java.lang.String token, java.lang.String kitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getEquipmentIdsAssignedToKitForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, kitId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String authenticateWithSurfaceId(java.lang.String surfaceId, java.lang.String credential, java.lang.String sessionId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "authenticateWithSurfaceId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {surfaceId, credential, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getDeviceIdsAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getDeviceIdsAssignedToUnitForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, unitId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuDeviceWithAssignment[] getDevicesWithAssignmentForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getDevicesWithAssignmentForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDeviceWithAssignment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDeviceWithAssignment[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuDeviceWithAssignment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuDevice getPrimaryLocalisationDevice(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getPrimaryLocalisationDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, unitId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDevice) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDevice) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuDevice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuUnit[] getUnitsAssignedToMissionForCrud(java.lang.String token, java.lang.String missionId, lu.hitec.pss.soap.ds.out._15_x.UnitType unitType, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUnitsAssignedToMissionForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, missionId, unitType, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUnit[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUnit[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuUnit[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getUserIdsAssignedToProfileForCrud(java.lang.String token, java.lang.String profileId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUserIdsAssignedToProfileForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, profileId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoMission[] getMissionsAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMissionsAssignedToUnitForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, unitId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoMission[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getKitIdAssignedToEquipmentForCrud(java.lang.String token, java.lang.String equipmentId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getKitIdAssignedToEquipmentForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, equipmentId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getFenceIdsAssignedToMissionForCrud(java.lang.String token, java.lang.String missionId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getFenceIdsAssignedToMissionForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, missionId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.InternalId[] getInternalIdsAssignedToKit(java.lang.String token, java.lang.String kitId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getInternalIdsAssignedToKit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, kitId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.InternalId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.InternalId[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.InternalId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuFence[] getFencesAssignedToMissionForCrud(java.lang.String token, java.lang.String missionId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getFencesAssignedToMissionForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, missionId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuFence[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuFence[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuFence[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] getPictureAssignedToEquipment(java.lang.String token, java.lang.String equipmentId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getPictureAssignedToEquipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, equipmentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getUnitIdsAssignedToMissionForCrud(java.lang.String token, java.lang.String missionId, lu.hitec.pss.soap.ds.out._15_x.UnitType unitType, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUnitIdsAssignedToMissionForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, missionId, unitType, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] getPictureAssignedToMission(java.lang.String token, java.lang.String missionId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getPictureAssignedToMission"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, missionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.InternalId[] getInternalIdsAssignedToUnit(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getInternalIdsAssignedToUnit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, unitId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.InternalId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.InternalId[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.InternalId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuUser[] getUsersAssignedToProfileForCrud(java.lang.String token, java.lang.String profileId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUsersAssignedToProfileForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, profileId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getProfileIdsAssignedToUserForCrud(java.lang.String token, java.lang.String userId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getProfileIdsAssignedToUserForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, userId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.UnitId getUnitIdAssignedToDeviceForCrud(java.lang.String token, java.lang.String deviceId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUnitIdAssignedToDeviceForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, deviceId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.UnitId) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.UnitId) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.UnitId.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoEquipment[] getEquipmentsAssignedToKitForCrud(java.lang.String token, java.lang.String kitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getEquipmentsAssignedToKitForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, kitId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoEquipment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoEquipment[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoEquipment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoMission[] getMissionsAssignedToFenceForCrud(java.lang.String token, java.lang.String fenceId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMissionsAssignedToFenceForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, fenceId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoMission[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoProfile[] getProfilesAssignedToUserForCrud(java.lang.String token, java.lang.String userId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getProfilesAssignedToUserForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, userId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoProfile[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoProfile[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoProfile[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getMissionIdsAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMissionIdsAssignedToUnitForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, unitId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoKit getKitAssignedToEquipmentForCrud(java.lang.String token, java.lang.String equipmentId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getKitAssignedToEquipmentForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, equipmentId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoKit) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoKit) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoKit.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoMission[] getMissionsAssignedToProfileForCrud(java.lang.String token, java.lang.String profileId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMissionsAssignedToProfileForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, profileId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoMission[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] getPictureAssignedToUser(java.lang.String token, java.lang.String userId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getPictureAssignedToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, userId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuUnit getUnitAssignedToDeviceForCrud(java.lang.String token, java.lang.String deviceId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUnitAssignedToDeviceForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, deviceId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUnit) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUnit) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuUnit.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getKitIdsAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId arg1, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getKitIdsAssignedToUnitForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, arg1, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.UnitId getUnitIdAssignedToKitForCrud(java.lang.String token, java.lang.String kitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUnitIdAssignedToKitForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, kitId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.UnitId) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.UnitId) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.UnitId.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getMissionIdsAssignedToFenceForCrud(java.lang.String token, java.lang.String fenceId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMissionIdsAssignedToFenceForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, fenceId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuFence getFence(java.lang.String token, java.lang.String fenceId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getFence"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, fenceId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuFence) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuFence) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuFence.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoKit getKit(java.lang.String token, java.lang.String kitId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getKit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, kitId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoKit) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoKit) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoKit.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoEquipment getEquipment(java.lang.String token, java.lang.String equipmentId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getEquipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, equipmentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoEquipment) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoEquipment) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoEquipment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoCasualty getCasualty(java.lang.String token, java.lang.String casualtyId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getCasualty"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, casualtyId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoCasualty) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoCasualty) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoCasualty.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoEquipment[] getEquipmentsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getEquipmentsForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoEquipment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoEquipment[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoEquipment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoKit[] getKitsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getKitsForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoKit[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoKit[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoKit[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuDevice[] getDevicesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getDevicesForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDevice[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDevice[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuDevice[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getMissionIdsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMissionIdsForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuDevice getDevice(java.lang.String token, java.lang.String deviceId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, deviceId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDevice) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDevice) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuDevice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoMission getMission(java.lang.String token, java.lang.String missionId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMission"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, missionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoMission.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuPlace[] getPlacesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getPlacesForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuPlace[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuPlace[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuPlace[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoMission[] getMissionsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMissionsForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoMission[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuUser[] getUsersForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUsersForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoWidget getWidget(java.lang.String token, java.lang.String widgetId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, widgetId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoWidget) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoWidget) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoWidget.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuVehicle getVehicle(java.lang.String token, java.lang.String vehicleId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getVehicle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, vehicleId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuVehicle) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuVehicle) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuVehicle.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoRefugee getRefugee(java.lang.String token, java.lang.String refugeeId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getRefugee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, refugeeId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoRefugee) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoRefugee) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoRefugee.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuUser getUser(java.lang.String token, java.lang.String userId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, userId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuUser.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuDevice[] searchDevices(java.lang.String token, java.lang.String searchString) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "searchDevices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, searchString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDevice[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDevice[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuDevice[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuUser[] searchUsers(java.lang.String token, java.lang.String searchString) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "searchUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, searchString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[] getVehiclesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getVehiclesForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoProfile getProfile(java.lang.String token, java.lang.String profileId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, profileId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoProfile) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoProfile) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoProfile.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] getMyPicture(java.lang.String token) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMyPicture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuPlace getPlace(java.lang.String token, java.lang.String placeId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getPlace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, placeId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuPlace) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuPlace) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuPlace.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoThreshold[] getThresholdsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getThresholdsForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoThreshold[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoThreshold[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoThreshold[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void logout(java.lang.String token) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoWidget[] getWidgetsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getWidgetsForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoWidget[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoWidget[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoWidget[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuFence[] searchFences(java.lang.String token, java.lang.String searchString) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "searchFences"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, searchString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuFence[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuFence[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuFence[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuPlace[] searchPlaces(java.lang.String token, java.lang.String searchString) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "searchPlaces"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, searchString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuPlace[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuPlace[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuPlace[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuUser getMyDetails(java.lang.String token) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMyDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuUser.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.InternalId[] getInternalIdsAssignedToEquipment(java.lang.String token, java.lang.String equipmentId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getInternalIdsAssignedToEquipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, equipmentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.InternalId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.InternalId[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.InternalId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getMissionIdsByMiddlewareMember(java.lang.String token, java.lang.String mwId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMissionIdsByMiddlewareMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, mwId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getOrganizationIdsAssignedToProfileForCrud(java.lang.String token, java.lang.String profileId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getOrganizationIdsAssignedToProfileForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, profileId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getOrganizationIdsAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getOrganizationIdsAssignedToUnitForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, unitId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getMissionIdsAssignedToProfileForCrud(java.lang.String token, java.lang.String profileId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMissionIdsAssignedToProfileForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, profileId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoCertification[] getCertificationsAssignedToUser(java.lang.String token, java.lang.String userId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getCertificationsAssignedToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, userId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoCertification[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoCertification[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoCertification[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuUser[] getUsersAssignedToCertification(java.lang.String token, java.lang.String certificationId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUsersAssignedToCertification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, certificationId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuDevice[] getDevicesAssignedToUnitForCrudAndCapabilities(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud, lu.hitec.pss.soap.ds.out._15_x.DeviceCapabilityEnum[] deviceCapabilites) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getDevicesAssignedToUnitForCrudAndCapabilities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, unitId, crud, deviceCapabilites});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDevice[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuDevice[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuDevice[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoCertification[] getCertifications(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getCertifications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoCertification[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoCertification[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoCertification[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuCircularFence[] getCircularFencesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getCircularFencesForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuCircularFence[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuCircularFence[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuCircularFence[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoKit[] getKitsAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getKitsAssignedToUnitForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, unitId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoKit[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoKit[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoKit[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoMiddleware[] getMiddlewaresForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMiddlewaresForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMiddleware[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMiddleware[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoMiddleware[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getMissionIdsForCrudFiltered(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud, lu.hitec.pss.soap.ds.out._15_x.WorkflowStatus status) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMissionIdsForCrudFiltered"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud, status});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoMission[] getMissionsForCrudFiltered(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud, lu.hitec.pss.soap.ds.out._15_x.WorkflowStatus status) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMissionsForCrudFiltered"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud, status});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoMission[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoCertification[] getMyCertifications(java.lang.String token) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMyCertifications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoCertification[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoCertification[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoCertification[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getMyDashboardWidgets(java.lang.String token) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMyDashboardWidgets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getMyPermissions(java.lang.String token) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getMyPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getOrganizationIdsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getOrganizationIdsForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuPolygonalFence[] getPolygonalFencesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getPolygonalFencesForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuPolygonalFence[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuPolygonalFence[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuPolygonalFence[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoCertification getCertification(java.lang.String token, java.lang.String certificationId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getCertification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, certificationId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoCertification) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoCertification) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoCertification.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuUnit getUnitAssignedToKitForCrud(java.lang.String token, java.lang.String kitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUnitAssignedToKitForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, kitId, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUnit) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUnit) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuUnit.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoMission[] searchMissions(java.lang.String token, java.lang.String searchString) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "searchMissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, searchString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoMission[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoMission[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuPlace[] getUnAssignedPlacesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUnAssignedPlacesForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuPlace[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuPlace[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuPlace[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[] searchVehicles(java.lang.String token, java.lang.String searchString) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "searchVehicles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, searchString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.DtoRefugee[] getRefugeesByMission(java.lang.String token, java.lang.String missionId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getRefugeesByMission"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, missionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoRefugee[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.DtoRefugee[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.DtoRefugee[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuResourceType getResourceType(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.ResourcesTypesEnum typeType, java.lang.String resourceTypeId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getResourceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, typeType, resourceTypeId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuResourceType) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuResourceType) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuResourceType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuUser[] getUnAssignedUsersForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUnAssignedUsersForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.Project getProjectDetails() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getProjectDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.Project) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.Project) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.Project.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getUidBySurfaceId(java.lang.String surfaceId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUidBySurfaceId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {surfaceId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuResourceType[] getResourceTypesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.ResourcesTypesEnum typeType, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getResourceTypesForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, typeType, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuResourceType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuResourceType[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuResourceType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[] getUnAssignedVehiclesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://hitec.lu/pss/soap/ds/out/15.x", "getUnAssignedVehiclesForCrud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, crud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[]) org.apache.axis.utils.JavaUtils.convert(_resp, lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthorizationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) {
              throw (lu.hitec.pss.soap.ds.out._15_x.AuthenticationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
