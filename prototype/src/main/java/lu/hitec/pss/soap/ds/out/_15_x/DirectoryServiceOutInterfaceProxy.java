package lu.hitec.pss.soap.ds.out._15_x;

public class DirectoryServiceOutInterfaceProxy implements lu.hitec.pss.soap.ds.out._15_x.DirectoryServiceOutInterface_PortType {
  private String _endpoint = null;
  private lu.hitec.pss.soap.ds.out._15_x.DirectoryServiceOutInterface_PortType directoryServiceOutInterface_PortType = null;
  
  public DirectoryServiceOutInterfaceProxy() {
    _initDirectoryServiceOutInterfaceProxy();
  }
  
  public DirectoryServiceOutInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initDirectoryServiceOutInterfaceProxy();
  }
  
  private void _initDirectoryServiceOutInterfaceProxy() {
    try {
      directoryServiceOutInterface_PortType = (new lu.hitec.pss.soap.ds.out._15_x.DirectoryServiceOutInterface_ServiceLocator()).getDirectoryServiceOutInterfacePort();
      if (directoryServiceOutInterface_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)directoryServiceOutInterface_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)directoryServiceOutInterface_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (directoryServiceOutInterface_PortType != null)
      ((javax.xml.rpc.Stub)directoryServiceOutInterface_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DirectoryServiceOutInterface_PortType getDirectoryServiceOutInterface_PortType() {
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType;
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoThreshold getThreshold(java.lang.String token, java.lang.String thresholdId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getThreshold(token, thresholdId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoProfile[] getProfilesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getProfilesForCrud(token, crud);
  }
  
  public java.lang.String[] getProfileIdsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getProfileIdsForCrud(token, crud);
  }
  
  public java.lang.String authenticate(java.lang.String uid, java.lang.String credential, java.lang.String sessionId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.authenticate(uid, credential, sessionId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoCasualty[] getCasualtiesByMission(java.lang.String token, java.lang.String missionId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getCasualtiesByMission(token, missionId);
  }
  
  public java.lang.String[] getDeviceCapabilitiesByUnitId(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.DeviceCapabilityEnum[] excludeDeviceCapabilities) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getDeviceCapabilitiesByUnitId(token, unitId, excludeDeviceCapabilities);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuDevice[] getDevicesAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getDevicesAssignedToUnitForCrud(token, unitId, crud);
  }
  
  public java.lang.String[] getEquipmentIdsAssignedToKitForCrud(java.lang.String token, java.lang.String kitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getEquipmentIdsAssignedToKitForCrud(token, kitId, crud);
  }
  
  public java.lang.String authenticateWithSurfaceId(java.lang.String surfaceId, java.lang.String credential, java.lang.String sessionId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.authenticateWithSurfaceId(surfaceId, credential, sessionId);
  }
  
  public java.lang.String[] getDeviceIdsAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getDeviceIdsAssignedToUnitForCrud(token, unitId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuDeviceWithAssignment[] getDevicesWithAssignmentForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getDevicesWithAssignmentForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuDevice getPrimaryLocalisationDevice(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getPrimaryLocalisationDevice(token, unitId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuUnit[] getUnitsAssignedToMissionForCrud(java.lang.String token, java.lang.String missionId, lu.hitec.pss.soap.ds.out._15_x.UnitType unitType, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUnitsAssignedToMissionForCrud(token, missionId, unitType, crud);
  }
  
  public java.lang.String[] getUserIdsAssignedToProfileForCrud(java.lang.String token, java.lang.String profileId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUserIdsAssignedToProfileForCrud(token, profileId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoMission[] getMissionsAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMissionsAssignedToUnitForCrud(token, unitId, crud);
  }
  
  public java.lang.String getKitIdAssignedToEquipmentForCrud(java.lang.String token, java.lang.String equipmentId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getKitIdAssignedToEquipmentForCrud(token, equipmentId, crud);
  }
  
  public java.lang.String[] getFenceIdsAssignedToMissionForCrud(java.lang.String token, java.lang.String missionId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getFenceIdsAssignedToMissionForCrud(token, missionId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.InternalId[] getInternalIdsAssignedToKit(java.lang.String token, java.lang.String kitId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getInternalIdsAssignedToKit(token, kitId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuFence[] getFencesAssignedToMissionForCrud(java.lang.String token, java.lang.String missionId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getFencesAssignedToMissionForCrud(token, missionId, crud);
  }
  
  public byte[] getPictureAssignedToEquipment(java.lang.String token, java.lang.String equipmentId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getPictureAssignedToEquipment(token, equipmentId);
  }
  
  public java.lang.String[] getUnitIdsAssignedToMissionForCrud(java.lang.String token, java.lang.String missionId, lu.hitec.pss.soap.ds.out._15_x.UnitType unitType, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUnitIdsAssignedToMissionForCrud(token, missionId, unitType, crud);
  }
  
  public byte[] getPictureAssignedToMission(java.lang.String token, java.lang.String missionId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getPictureAssignedToMission(token, missionId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.InternalId[] getInternalIdsAssignedToUnit(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getInternalIdsAssignedToUnit(token, unitId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuUser[] getUsersAssignedToProfileForCrud(java.lang.String token, java.lang.String profileId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUsersAssignedToProfileForCrud(token, profileId, crud);
  }
  
  public java.lang.String[] getProfileIdsAssignedToUserForCrud(java.lang.String token, java.lang.String userId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getProfileIdsAssignedToUserForCrud(token, userId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.UnitId getUnitIdAssignedToDeviceForCrud(java.lang.String token, java.lang.String deviceId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUnitIdAssignedToDeviceForCrud(token, deviceId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoEquipment[] getEquipmentsAssignedToKitForCrud(java.lang.String token, java.lang.String kitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getEquipmentsAssignedToKitForCrud(token, kitId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoMission[] getMissionsAssignedToFenceForCrud(java.lang.String token, java.lang.String fenceId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMissionsAssignedToFenceForCrud(token, fenceId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoProfile[] getProfilesAssignedToUserForCrud(java.lang.String token, java.lang.String userId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getProfilesAssignedToUserForCrud(token, userId, crud);
  }
  
  public java.lang.String[] getMissionIdsAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMissionIdsAssignedToUnitForCrud(token, unitId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoKit getKitAssignedToEquipmentForCrud(java.lang.String token, java.lang.String equipmentId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getKitAssignedToEquipmentForCrud(token, equipmentId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoMission[] getMissionsAssignedToProfileForCrud(java.lang.String token, java.lang.String profileId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMissionsAssignedToProfileForCrud(token, profileId, crud);
  }
  
  public byte[] getPictureAssignedToUser(java.lang.String token, java.lang.String userId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getPictureAssignedToUser(token, userId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuUnit getUnitAssignedToDeviceForCrud(java.lang.String token, java.lang.String deviceId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUnitAssignedToDeviceForCrud(token, deviceId, crud);
  }
  
  public java.lang.String[] getKitIdsAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId arg1, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getKitIdsAssignedToUnitForCrud(token, arg1, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.UnitId getUnitIdAssignedToKitForCrud(java.lang.String token, java.lang.String kitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUnitIdAssignedToKitForCrud(token, kitId, crud);
  }
  
  public java.lang.String[] getMissionIdsAssignedToFenceForCrud(java.lang.String token, java.lang.String fenceId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMissionIdsAssignedToFenceForCrud(token, fenceId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuFence getFence(java.lang.String token, java.lang.String fenceId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getFence(token, fenceId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoKit getKit(java.lang.String token, java.lang.String kitId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getKit(token, kitId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoEquipment getEquipment(java.lang.String token, java.lang.String equipmentId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getEquipment(token, equipmentId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoCasualty getCasualty(java.lang.String token, java.lang.String casualtyId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getCasualty(token, casualtyId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoEquipment[] getEquipmentsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getEquipmentsForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoKit[] getKitsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getKitsForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuDevice[] getDevicesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getDevicesForCrud(token, crud);
  }
  
  public java.lang.String[] getMissionIdsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMissionIdsForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuDevice getDevice(java.lang.String token, java.lang.String deviceId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getDevice(token, deviceId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoMission getMission(java.lang.String token, java.lang.String missionId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMission(token, missionId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuPlace[] getPlacesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getPlacesForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoMission[] getMissionsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMissionsForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuUser[] getUsersForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUsersForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoWidget getWidget(java.lang.String token, java.lang.String widgetId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getWidget(token, widgetId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuVehicle getVehicle(java.lang.String token, java.lang.String vehicleId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getVehicle(token, vehicleId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoRefugee getRefugee(java.lang.String token, java.lang.String refugeeId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getRefugee(token, refugeeId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuUser getUser(java.lang.String token, java.lang.String userId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUser(token, userId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuDevice[] searchDevices(java.lang.String token, java.lang.String searchString) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.searchDevices(token, searchString);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuUser[] searchUsers(java.lang.String token, java.lang.String searchString) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.searchUsers(token, searchString);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[] getVehiclesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getVehiclesForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoProfile getProfile(java.lang.String token, java.lang.String profileId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getProfile(token, profileId);
  }
  
  public byte[] getMyPicture(java.lang.String token) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMyPicture(token);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuPlace getPlace(java.lang.String token, java.lang.String placeId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getPlace(token, placeId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoThreshold[] getThresholdsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getThresholdsForCrud(token, crud);
  }
  
  public void logout(java.lang.String token) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    directoryServiceOutInterface_PortType.logout(token);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoWidget[] getWidgetsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getWidgetsForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuFence[] searchFences(java.lang.String token, java.lang.String searchString) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.searchFences(token, searchString);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuPlace[] searchPlaces(java.lang.String token, java.lang.String searchString) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.searchPlaces(token, searchString);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuUser getMyDetails(java.lang.String token) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMyDetails(token);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.InternalId[] getInternalIdsAssignedToEquipment(java.lang.String token, java.lang.String equipmentId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getInternalIdsAssignedToEquipment(token, equipmentId);
  }
  
  public java.lang.String[] getMissionIdsByMiddlewareMember(java.lang.String token, java.lang.String mwId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMissionIdsByMiddlewareMember(token, mwId);
  }
  
  public java.lang.String[] getOrganizationIdsAssignedToProfileForCrud(java.lang.String token, java.lang.String profileId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getOrganizationIdsAssignedToProfileForCrud(token, profileId, crud);
  }
  
  public java.lang.String[] getOrganizationIdsAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getOrganizationIdsAssignedToUnitForCrud(token, unitId, crud);
  }
  
  public java.lang.String[] getMissionIdsAssignedToProfileForCrud(java.lang.String token, java.lang.String profileId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMissionIdsAssignedToProfileForCrud(token, profileId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoCertification[] getCertificationsAssignedToUser(java.lang.String token, java.lang.String userId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getCertificationsAssignedToUser(token, userId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuUser[] getUsersAssignedToCertification(java.lang.String token, java.lang.String certificationId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUsersAssignedToCertification(token, certificationId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuDevice[] getDevicesAssignedToUnitForCrudAndCapabilities(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud, lu.hitec.pss.soap.ds.out._15_x.DeviceCapabilityEnum[] deviceCapabilites) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getDevicesAssignedToUnitForCrudAndCapabilities(token, unitId, crud, deviceCapabilites);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoCertification[] getCertifications(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getCertifications(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuCircularFence[] getCircularFencesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getCircularFencesForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoKit[] getKitsAssignedToUnitForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.UnitId unitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getKitsAssignedToUnitForCrud(token, unitId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoMiddleware[] getMiddlewaresForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMiddlewaresForCrud(token, crud);
  }
  
  public java.lang.String[] getMissionIdsForCrudFiltered(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud, lu.hitec.pss.soap.ds.out._15_x.WorkflowStatus status) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMissionIdsForCrudFiltered(token, crud, status);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoMission[] getMissionsForCrudFiltered(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud, lu.hitec.pss.soap.ds.out._15_x.WorkflowStatus status) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMissionsForCrudFiltered(token, crud, status);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoCertification[] getMyCertifications(java.lang.String token) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMyCertifications(token);
  }
  
  public java.lang.String getMyDashboardWidgets(java.lang.String token) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMyDashboardWidgets(token);
  }
  
  public java.lang.String[] getMyPermissions(java.lang.String token) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getMyPermissions(token);
  }
  
  public java.lang.String[] getOrganizationIdsForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getOrganizationIdsForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuPolygonalFence[] getPolygonalFencesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getPolygonalFencesForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoCertification getCertification(java.lang.String token, java.lang.String certificationId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getCertification(token, certificationId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuUnit getUnitAssignedToKitForCrud(java.lang.String token, java.lang.String kitId, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUnitAssignedToKitForCrud(token, kitId, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoMission[] searchMissions(java.lang.String token, java.lang.String searchString) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.searchMissions(token, searchString);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuPlace[] getUnAssignedPlacesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUnAssignedPlacesForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[] searchVehicles(java.lang.String token, java.lang.String searchString) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.searchVehicles(token, searchString);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.DtoRefugee[] getRefugeesByMission(java.lang.String token, java.lang.String missionId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getRefugeesByMission(token, missionId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuResourceType getResourceType(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.ResourcesTypesEnum typeType, java.lang.String resourceTypeId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException, lu.hitec.pss.soap.ds.out._15_x.ResourceNotFoundException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getResourceType(token, typeType, resourceTypeId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuUser[] getUnAssignedUsersForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUnAssignedUsersForCrud(token, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.Project getProjectDetails() throws java.rmi.RemoteException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getProjectDetails();
  }
  
  public java.lang.String getUidBySurfaceId(java.lang.String surfaceId) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUidBySurfaceId(surfaceId);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuResourceType[] getResourceTypesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.ResourcesTypesEnum typeType, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getResourceTypesForCrud(token, typeType, crud);
  }
  
  public lu.hitec.pss.soap.ds.out._15_x.PssuVehicle[] getUnAssignedVehiclesForCrud(java.lang.String token, lu.hitec.pss.soap.ds.out._15_x.CrudEnum crud) throws java.rmi.RemoteException, lu.hitec.pss.soap.ds.out._15_x.AuthorizationException, lu.hitec.pss.soap.ds.out._15_x.AuthenticationException{
    if (directoryServiceOutInterface_PortType == null)
      _initDirectoryServiceOutInterfaceProxy();
    return directoryServiceOutInterface_PortType.getUnAssignedVehiclesForCrud(token, crud);
  }
  
  
}