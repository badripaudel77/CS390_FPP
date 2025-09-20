package edu.miu.lab8.Prob2;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        // NOTE: Since ssn is always given unique, no two Employee will have same ssn, it is not required to use all fields while comparing.
        return Comparator
                .comparing(Employee::getSsn, Comparator.nullsFirst(Comparator.naturalOrder()))
                .compare(employee1, employee2);
    }
}
