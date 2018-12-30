/**
 * A_WebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com._4d.www.namespace._default;

public interface A_WebService extends javax.xml.rpc.Service {
    public java.lang.String getA_WebServicePortAddress();

    public com._4d.www.namespace._default.A_WebServiceRPC getA_WebServicePort() throws javax.xml.rpc.ServiceException;

    public com._4d.www.namespace._default.A_WebServiceRPC getA_WebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
