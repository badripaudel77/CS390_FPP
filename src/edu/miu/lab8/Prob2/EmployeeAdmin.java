package edu.miu.lab8.Prob2;

import java.util.*;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
        List<Employee> filteredEmployees = new ArrayList<>();

        for(String ssn: socSecNums) {
            var employee = table.get(ssn);
            if(employee != null && employee.getSalary() > 80_000) {
                filteredEmployees.add(employee);
            }
        }
        Collections.sort(filteredEmployees, Comparator.comparing(Employee::getSsn, Comparator.nullsFirst(String::compareTo)));
        // NOTE: Since ssn is always given unique, no two Employee will have same ssn, it is not required to use all fields while comparing.
        // Collections.sort(filteredEmployees, Comparator.comparing(Employee::getSsn).thenComparing(Employee::getName).thenComparing(Employee::getSalary));

		return filteredEmployees;
	}
}
