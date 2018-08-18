package com.JPQL;

public class TestJPQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------SELECT ALL---------------------------------------------------");
		AllJPQLQueries.SelectByJPQL();
		/*System.out.println("--------------------------------GET COLUMN---------------------------------------------------");
		AllJPQLQueries.GetColumnByJPQL();*/
		
		System.out.println("--------------------------------UPDATE--------------------------------------------------------");
		AllJPQLQueries.UpdateByJPQL();
		
		/*System.out.println("--------------------------------DELETE--------------------------------------------------------");
		AllJPQLQueries.DeleteByJPQL();*/
		
		System.out.println("--------------------------------Where Clause--------------------------------------------------------");
		AllJPQLQueries.WhereClauseByJPQL();
		
		System.out.println("-------------------------------ORDER BY --------------------------------------------------------");
		AllJPQLQueries.OrderByJPQL();
		
		System.out.println("-------------------------------GROUP BY --------------------------------------------------------");
		AllJPQLQueries.GroupByJPQL();
	}

}
