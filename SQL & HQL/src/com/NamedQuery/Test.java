package com.NamedQuery;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------------All records of employee table-----------------------------------------------");
		getAllQueries.GetAllQuery();
		
		System.out.println("------------------------------------------------Name employee table-----------------------------------------------");		
		getAllQueries.GetNameQuery();
		
		System.out.println("-----------------------------------------------AND query----------------------------------------------------------");				
		getAllQueries.getAndQuery();
	}

}
