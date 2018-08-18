package com.payu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		EmpInsertion ci = new EmpInsertion();
		ci.InsertSQL();	
		
		ProductInsertion pi = new ProductInsertion();
		pi.InsertSQL();
*/	
		System.out.println("-------HQL By Delete Query---------");
		SQLQuery.DeleteByHQl();
		
		System.out.println("-------SQL By Select Query---------");
		SQLQuery.SelectBySQL();
		System.out.println("-------HQL By Select Query---------");
		SQLQuery.SelectByHQl();
		
		System.out.println("-------Criteria Query---------");
		SQLQuery.SelectByCriteries();
		
		/*System.out.println("-------SQL By Update Query---------");
		SQLQuery.UpdateBySQL();
		System.out.println("-------HQL By Update Query---------");
		SQLQuery.UpdateByHQL();
		
		
		System.out.println("-------SQL By Having Query---------");
		SQLQuery.HavingBySQL();
		System.out.println("-------HQL By Having Query---------");
		SQLQuery.HavingByHQL();
		*/
		
		System.out.println("-------SQL By SElECTtOP Query---------");
		SQLQuery.SelectTopBySQL();
	
		
		System.out.println("-------SQL By And Query---------");
		SQLQuery.ANDBySQL();
		System.out.println("-------HQL By And Query---------");
		SQLQuery.ANDByHQL();
		
		
		System.out.println("-------SQL By Or Query---------");
		SQLQuery.ORBySQL();
		System.out.println("-------HQL By Or Query---------");
		SQLQuery.ORByHQL();
		
		System.out.println("-------SQL By NOT Query---------");
		SQLQuery.NotBySQL();
		System.out.println("-------HQL By NOT Query---------");
		SQLQuery.NotByHQL();
		
		System.out.println("-------SQL By Column Query---------");
		SQLQuery.GetColumnBySQL();
		System.out.println("-------HQL By column Query---------");
		SQLQuery.GetColumnByHQL();
		System.out.println("-------Criteria Query---------");
		SQLQuery.CriteriaSelectAttribute();
		
		
		System.out.println("-------SQL By WhereClause Query---------");		
		SQLQuery.WhereClauseBySQL();
		System.out.println("-------HQL By WhereClause Query---------");				
		SQLQuery.WhereClauseByHQL();
		System.out.println("----------------Criteria-----------------");				
		SQLQuery.CriteriaLike();
		
		
		
		System.out.println("-------SQL By ORDERBY Query---------");
		SQLQuery.OrderBySQL();
		System.out.println("-------HQL By ORDERBY Query---------");
		SQLQuery.OrderByHQL();
		
		System.out.println("-------SQL By GROUPBY Query---------");
		SQLQuery.GroupBySQL();
		System.out.println("-------HQL By GROUPBY Query---------");
		SQLQuery.GroupByHQL();
		
	}
}
