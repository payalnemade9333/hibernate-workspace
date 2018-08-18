package com.Projection;

import com.Restrictions.selectAllRecords;

public class TestProjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------------------------PARTICULAR COLUMN QUERY------------------------------------------------");
		ParticularColumn.getColumn();
		
		System.out.println("-----------------------------------------------------AF COUNT QUERY------------------------------------------------");
		AggregateFunction.getCount();
		
		System.out.println("-----------------------------------------------------AVERAGE   QUERY------------------------------------------------");
		AggregateFunction.getAvg();
		
		System.out.println("-----------------------------------------------------SUM   QUERY------------------------------------------------");
		AggregateFunction.getSum();
		
		System.out.println("-----------------------------------------------------MINIMUM   QUERY------------------------------------------------");
		AggregateFunction.getMin();
		
		System.out.println("-----------------------------------------------------MAXIMUM   QUERY------------------------------------------------");
		AggregateFunction.getMax();
		
		
		System.out.println("-----------------------------------------------------GROUP BY   QUERY------------------------------------------------");
		GroupByClause.getGroupBy();
		
		System.out.println("-----------------------------------------------------HAVING  QUERY------------------------------------------------");
		HavingClause.getHavingClause();
	}

}
