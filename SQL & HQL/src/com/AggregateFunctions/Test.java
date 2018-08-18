package com.AggregateFunctions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count Function
		System.out.println("-------------SQL Count------------");
		AggreFunctions.countSQL();
		System.out.println("-------------HQL Count------------");
		AggreFunctions.countHQL();
		System.out.println("-------------Criteria------------");
		AggreFunctions.countCriteria();
		System.out.println("-------------SQL Distinct Count------------");
		AggreFunctions.countDistinctSQL();
		
		
		
		System.out.println("-------------SQL Average----------");		
		AggreFunctions.AvgSQL();
		System.out.println("-------------HQL Average----------");		
		AggreFunctions.AvgHQL();
		
		System.out.println("-------------Criteria Average----------");		
		AggreFunctions.AvgCriteria();
		
		System.out.println("-------------SQL Sum--------------");		
		AggreFunctions.SumSQL();
		System.out.println("-------------HQL Sum--------------");		
		AggreFunctions.SumHQL();
		System.out.println("-------------Criteria Sum--------------");		
		AggreFunctions.SumCriteria();
		
		
		System.out.println("-------------SQL Mininum--------------");		
		AggreFunctions.MinSQL();
		System.out.println("-------------HQL Minimum--------------");		
		AggreFunctions.MinHQL();
		
		System.out.println("-------------Criteria Minimum--------------");		
		AggreFunctions.MinCriteria();
		
		System.out.println("-------------SQL Maximum--------------");		
		AggreFunctions.MaxSQL();
		System.out.println("-------------HQL Maximum--------------");		
		AggreFunctions.MaxHQL();
		System.out.println("-------------Criteria Maximum--------------");		
		AggreFunctions.MaxCriteria();
	}
}
