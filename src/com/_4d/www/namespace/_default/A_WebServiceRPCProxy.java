package com._4d.www.namespace._default;

public class A_WebServiceRPCProxy implements com._4d.www.namespace._default.A_WebServiceRPC {
  private String _endpoint = "http://46.21.205.149:8083/4DSOAP/";
  private com._4d.www.namespace._default.A_WebServiceRPC a_WebServiceRPC = null;
  
  public A_WebServiceRPCProxy() {
    _initA_WebServiceRPCProxy();
  }
  
  public A_WebServiceRPCProxy(String endpoint) {
    _endpoint = endpoint;
    _initA_WebServiceRPCProxy();
  }
  
  private void _initA_WebServiceRPCProxy() {
    try {
      a_WebServiceRPC = (new com._4d.www.namespace._default.A_WebServiceLocator()).getA_WebServicePort();
      if (a_WebServiceRPC != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)a_WebServiceRPC)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)a_WebServiceRPC)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (a_WebServiceRPC != null)
      ((javax.xml.rpc.Stub)a_WebServiceRPC)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com._4d.www.namespace._default.A_WebServiceRPC getA_WebServiceRPC() {
    if (a_WebServiceRPC == null)
      _initA_WebServiceRPCProxy();
    return a_WebServiceRPC;
  }
  
  public java.lang.String getEvenements() throws java.rmi.RemoteException{
    if (a_WebServiceRPC == null)
      _initA_WebServiceRPCProxy();
    return a_WebServiceRPC.getEvenements();
  }
  
  public java.lang.String eventAdd(java.lang.String dateevent, java.lang.String objetvent, java.lang.String lieuevent, java.lang.String hdebvent, java.lang.String hfinvent, java.lang.String struserid) throws java.rmi.RemoteException{
    if (a_WebServiceRPC == null)
      _initA_WebServiceRPCProxy();
    return a_WebServiceRPC.eventAdd(dateevent, objetvent, lieuevent, hdebvent, hfinvent, struserid);
  }
  
  public java.lang.String getEvenementsByID(java.lang.String userID) throws java.rmi.RemoteException{
    if (a_WebServiceRPC == null)
      _initA_WebServiceRPCProxy();
    return a_WebServiceRPC.getEvenementsByID(userID);
  }
  
  public java.lang.String getEvenementsByUser(int userID) throws java.rmi.RemoteException{
    if (a_WebServiceRPC == null)
      _initA_WebServiceRPCProxy();
    return a_WebServiceRPC.getEvenementsByUser(userID);
  }
  
  public java.lang.String userAdd(java.lang.String nom, java.lang.String prenom, java.lang.String email) throws java.rmi.RemoteException{
    if (a_WebServiceRPC == null)
      _initA_WebServiceRPCProxy();
    return a_WebServiceRPC.userAdd(nom, prenom, email);
  }
  
  public java.lang.String getUsers() throws java.rmi.RemoteException{
    if (a_WebServiceRPC == null)
      _initA_WebServiceRPCProxy();
    return a_WebServiceRPC.getUsers();
  }
  
  public java.lang.String getEvenementsByDates(int userID, java.lang.String dateFrom, java.lang.String dateTo) throws java.rmi.RemoteException{
    if (a_WebServiceRPC == null)
      _initA_WebServiceRPCProxy();
    return a_WebServiceRPC.getEvenementsByDates(userID, dateFrom, dateTo);
  }
  
  
}