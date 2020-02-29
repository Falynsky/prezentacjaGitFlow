package fal.contract;

public class Contract {

    private String idn;
    private ContractType contractType;
    private Job jobType;
    private double salary;

    public Contract(String idn, ContractType contractType, Job jobType, double salary) {
        this.idn = idn;
        this.contractType = contractType;
        this.jobType = jobType;
        this.salary = salary;
    }

    public String getIdn() {
        return idn;
    }

    public void setIdn(String idn) {
        this.idn = idn;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public Job getJobType() {
        return jobType;
    }

    public void setJobType(Job jobType) {
        this.jobType = jobType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idn='" + idn + '\'' +
                ", contractType=" + contractType +
                ", jobType=" + jobType +
                ", salary=" + salary +
                '}';
    }
}
