package com.example.helloworld;

public class Calculation {
    private Integer Operator; // 1 für +, 2 für -, 3für * und 4 für /
    private Double NumberOne;
    private Double NumberTwo;
    private Double Result;

    public Calculation(Double NumberOne, Double NumberTwo, Integer Operator) {
        this.NumberOne = NumberOne;
        this.NumberTwo = NumberTwo;
        this.Operator = Operator;
        this.Calculate();
    }

    public Calculation(Double NumberOne, Double NumberTwo, Double Result, Integer Operator){
        this.NumberOne =NumberOne;
        this.NumberTwo =NumberTwo;
        this.Operator =Operator;
        this.Result =Result
    }

    public Integer getOperator(){
        return this.Operator;
    }

    public void setOperator(Integer Operator){
        this.Operator = Operator;
    }

    public Double getNumberOne(){
        return this.NumberOne;
    }

    public void setNumberOne(Double NumberOne){
        this.NumberOne = NumberOne;
    }

    public Double getNumberTwo(){
        return this.NumberTwo;
    }

    public void setNumberTwo(Double NumberTwo){
        this.NumberTwo = NumberTwo;
    }

    public Double getResult(){
        return this.Result;
    }

    public void setResult(Double Result){
        this.Result = Result;
    }

    void Calculate(){
        switch (Operator){
            case 1:
                Result = NumberOne + NumberTwo;
                break;

            case 2:
                Result = NumberOne - NumberTwo;
                break;

            case 3:
                Result = NumberOne * NumberTwo;
                break;

            case 4:
                Result = NumberOne / NumberTwo;
                break;
        }
    }

    public String toString() {
        String Calculation;
        Calculation = NumberOne.toString() + " " + Operator.toString() + " " + NumberTwo.toString() + " = " + Result.toString();
    }

    private String OperatorToString(){
        switch (Operator){
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            case 4:
                return "/";
            default:
                return "";
        }

    }

}
