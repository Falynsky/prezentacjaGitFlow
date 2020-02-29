package fal;

import fal.contract.Contract;
import fal.contract.ContractType;
import fal.contract.Job;
import fal.employee.Employee;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        List<String> names = new ArrayList<>(Arrays.asList("Arthur", "Lenny", "Hosea"));
        List<String> surenames = new ArrayList<>(Arrays.asList("Morgan", "Summers", "Matthews"));
        List<String> ages = new ArrayList<>(Arrays.asList("36", "60", "23"));

        List<Contract> contracts = new ArrayList<>(
                Arrays.asList(
                        new Contract("Z1DFD2", ContractType.B2B, Job.PROGRAMMER, 12000),
                        new Contract("A13ASGIY", ContractType.UZ, Job.SCRUM_MASTER, 5500),
                        new Contract("SDSAD232AS1", ContractType.UOP, Job.MANAGER, 10500)
                )
        );


        List<Employee> employees = createEmployees(names, surenames, ages, contracts);

        employees.forEach(t -> System.out.println(t.toString()));
    }

    private static List<Employee> createEmployees(List<String> names, List<String> surenames, List<String> ages, List<Contract> contracts) throws Exception {
        int employeesSize = isListsSizeEquals(names, surenames, ages, contracts);
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < employeesSize; i++) {
            employees.add(createEmployee(names, surenames, ages, contracts, i));
        }

        return employees;
    }

    private static int isListsSizeEquals(List<String> names, List<String> surenames, List<String> ages, List<Contract> contracts) throws Exception {
        int namesSize = names.size();
        int surenamesSize = surenames.size();
        int agesSize = ages.size();
        int contractsSize = contracts.size();
        if (namesSize != surenamesSize && namesSize != agesSize && namesSize != contractsSize) {
            throw new Exception("Nie pasująca liczba danych w listach!");
        }
        return namesSize;
    }

    private static Employee createEmployee(List<String> names, List<String> surenames, List<String> ages, List<Contract> contracts, int index) {
        return new Employee(names.get(index), surenames.get(index), Integer.parseInt(ages.get(index)), Collections.singletonList(contracts.get(index)));
    }
}
