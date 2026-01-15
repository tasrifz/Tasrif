/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection_Jan_06;

/**
 *
 * @author TASRIF ZAMAN
 */
class SalaryStructure{
    private double minSalary;
    private double maxSalary;
    private double currSalary;
    private String incrementType;
    private double incrementValue;

    public SalaryStructure(double minSalary, double maxSalary, double currSalary, String incrementType, double incrementValue) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.currSalary = currSalary;
        this.incrementType = incrementType;
        this.incrementValue = incrementValue;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public double getCurrSalary() {
        return currSalary;
    }

    public void setCurrSalary(double currSalary) {
        this.currSalary = currSalary;
    }

    public String getIncrementType() {
        return incrementType;
    }

    public void setIncrementType(String incrementType) {
        this.incrementType = incrementType;
    }

    public double getIncrementValue() {
        return incrementValue;
    }

    public void setIncrementValue(double incrementValue) {
        this.incrementValue = incrementValue;
    }

    @Override
    public String toString() {
        return "SalaryStructure{" + "minSalary=" + minSalary + ", maxSalary=" + maxSalary + ", currSalary=" + currSalary + ", incrementType=" + incrementType + ", incrementValue=" + incrementValue + '}';
    }
    
}
class EmployeeAddress{
    private String address;
    private int road;
    private int holdingNumber;
    private String area ;
    private int postalCode;

    public EmployeeAddress(String address, int road, int holdingNumber, String area, int postalCode) {
        this.address = address;
        this.road = road;
        this.holdingNumber = holdingNumber;
        this.area = area;
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoad() {
        return road;
    }

    public void setRoad(int road) {
        this.road = road;
    }

    public int getHoldingNumber() {
        return holdingNumber;
    }

    public void setHoldingNumber(int holdingNumber) {
        this.holdingNumber = holdingNumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" + "address=" + address + ", road=" + road + ", holdingNumber=" + holdingNumber + ", area=" + area + ", postalCode=" + postalCode + '}';
    }
    
}
class Employee {
    private int id;
    private String employeeName;
    private Integer age;
    private  SalaryStructure salary;
    private EmployeeAddress address;

    public Employee(int id, String employeeName, Integer age, SalaryStructure salary, EmployeeAddress address) {
        this.id = id;
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SalaryStructure getSalary() {
        return salary;
    }

    public void setSalary(SalaryStructure salary) {
        this.salary = salary;
    }

    public EmployeeAddress getAddress() {
        return address;
    }

    public void setAddress(EmployeeAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", employeeName=" + employeeName + ", age=" + age + ", salary=" + salary + ", address=" + address + '}';
    }
  
}
