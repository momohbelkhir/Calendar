/**
 * A_WebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com._4d.www.namespace._default;

public class A_WebServiceLocator extends org.apache.axis.client.Service implements com._4d.www.namespace._default.A_WebService {

    public A_WebServiceLocator() {
    }


    public A_WebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public A_WebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for A_WebServicePort
    private java.lang.String A_WebServicePort_address = "http://localhost:8080/Test/services/A_WebServicePort";

    public java.lang.String getA_WebServicePortAddress() {
        return A_WebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String A_WebServicePortWSDDServiceName = "A_WebServicePort";

    public java.lang.String getA_WebServicePortWSDDServiceName() {
        return A_WebServicePortWSDDServiceName;
    }

    public void setA_WebServicePortWSDDServiceName(java.lang.String name) {
        A_WebServicePortWSDDServiceName = name;
    }

    public com._4d.www.namespace._default.A_WebServiceRPC getA_WebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(A_WebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getA_WebServicePort(endpoint);
    }

    public com._4d.www.namespace._default.A_WebServiceRPC getA_WebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com._4d.www.namespace._default.A_WebServiceBindingStub _stub = new com._4d.www.namespace._default.A_WebServiceBindingStub(portAddress, this);
            _stub.setPortName(getA_WebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setA_WebServicePortEndpointAddress(java.lang.String address) {
        A_WebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com._4d.www.namespace._default.A_WebServiceRPC.class.isAssignableFrom(serviceEndpointInterface)) {
                com._4d.www.namespace._default.A_WebServiceBindingStub _stub = new com._4d.www.namespace._default.A_WebServiceBindingStub(new java.net.URL(A_WebServicePort_address), this);
                _stub.setPortName(getA_WebServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("A_WebServicePort".equals(inputPortName)) {
            return getA_WebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.4d.com/namespace/default", "A_WebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.4d.com/namespace/default", "A_WebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("A_WebServicePort".equals(portName)) {
            setA_WebServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
