package edu.miu.lab6.prob2;

import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
        var sum = 0.0;
        if(aList == null || aList.isEmpty()) {
            return sum;
        }
		//implement
		//compute sum of all salaries of people in aList and return
        for (EmployeeData employeeData : aList) {
            if(employeeData != null) {
               sum += employeeData.getSalary();
            }
        }
        return sum;
	}
}
