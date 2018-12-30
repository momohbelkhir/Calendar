/**
 * A_WebServiceRPC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com._4d.www.namespace._default;

public interface A_WebServiceRPC extends java.rmi.Remote {
    public java.lang.String getEvenements() throws java.rmi.RemoteException;
    public java.lang.String eventAdd(java.lang.String dateevent, java.lang.String objetvent, java.lang.String lieuevent, java.lang.String hdebvent, java.lang.String hfinvent, java.lang.String struserid) throws java.rmi.RemoteException;
    public java.lang.String getEvenementsByID(java.lang.String userID) throws java.rmi.RemoteException;
    public java.lang.String getEvenementsByUser(int userID) throws java.rmi.RemoteException;
    public java.lang.String userAdd(java.lang.String nom, java.lang.String prenom, java.lang.String email) throws java.rmi.RemoteException;
    public java.lang.String getUsers() throws java.rmi.RemoteException;
    public java.lang.String getEvenementsByDates(int userID, java.lang.String dateFrom, java.lang.String dateTo) throws java.rmi.RemoteException;
}
