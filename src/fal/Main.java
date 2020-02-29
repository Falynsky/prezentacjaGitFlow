package fal;

import fal.employee.Employee;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        List<String> names = new ArrayList<>(Arrays.asList("Arthur", "Lenny", "Hosea"));
        List<String> surenames = new ArrayList<>(Arrays.asList("Morgan", "Summers", "Matthews"));
        List<String> ages = new ArrayList<>(Arrays.asList("36", "60", "23"));
        List<Employee> employees = createEmployees(names, surenames, ages);

        employees.forEach(t -> System.out.println(t.toString()));
    }

    private static List<Employee> createEmployees(List<String> names, List<String> surenames, List<String> ages) throws Exception {
        int employeesSize = isListsSizeEquals(names, surenames, ages);
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < employeesSize; i++) {
            employees.add(createEmployee(names, surenames, ages, i));
        }

        return employees;
    }

    private static int isListsSizeEquals(List<String> names, List<String> surenames, List<String> ages) throws Exception {
        int namesSize = names.size();
        int surenamesSize = surenames.size();
        int agesSize = ages.size();
        if (namesSize != surenamesSize && namesSize != agesSize) {
            throw new Exception("Nie pasująca liczba danych w listach!");
        }
        return namesSize;
    }

    private static Employee createEmployee(List<String> names, List<String> surenames, List<String> ages, int index) {
        return new Employee(names.get(index), surenames.get(index), Integer.parseInt(ages.get(index)));
    }
}
