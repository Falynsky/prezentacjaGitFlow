package fal.contract;

public enum ContractType {
    UOP(1,1), UZ(1,2), B2B(1,1);

    private ContractType(final int nominator, final int denominator){
        this.nominator = nominator;
        this.denominator = denominator;
    }

    private int nominator;
    private int denominator;

    public double getJobType(){
        int jobType = nominator / denominator;
        return jobType;
    }

}
