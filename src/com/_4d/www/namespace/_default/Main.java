package com._4d.www.namespace._default;

import java.rmi.RemoteException;

public class Main {
	public static void main(String[] args) throws RemoteException {
		A_WebServiceRPCProxy soap=new A_WebServiceRPCProxy();
		System.out.println("http://46.21.205.149:8083/4DSOAP/");
		
		
	   System.out.println("getUsers :\n"+soap.getUsers()+"**");
	   System.out.println("getEvenements :\n"+soap.getEvenements()+"**");
	   //System.out.println("getEvenements :\n"+soap.eventAdd("30/12/2018", "test java", "Paris", "14:00:00", "20:00:00", "5") +"**");
	   System.out.println("getEvenementsByUser :\n"+soap.getEvenementsByUser(5)+"**");  
	   System.out.println("GetEvenementsByID :\n"+soap.getEvenementsByID("5")+"**");
	   System.out.println("GetUsers :\n"+soap.getUsers()+"**");
	   System.out.println("GetEvenementsByDates :\n"+soap.getEvenementsByDates(5, "01/12/2018", "30/12/2018")+"**");
	}

}
