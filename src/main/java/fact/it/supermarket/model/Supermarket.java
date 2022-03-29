package fact.it.supermarket.model;

import java.util.ArrayList;
//Senne Van Reusel r0903904

public class Supermarket {
    private String name;
    private int numberCustomers;
    private ArrayList<Department> departmentList = new ArrayList<>();

    public Supermarket(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberCustomers() {
        return numberCustomers;
    }
    public int getNumberOfDepartments(){
        return this.departmentList.size();
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(Department department){
        this.departmentList.add(department);
    }

    public Department searchDepartmentByName(String name){
        for (Department department: departmentList) {
            if (department.getName().equals(name)){
                return department;
            }
        }
        return  null;
    }

    public void registerCustomer(Customer customer){
        numberCustomers++;
        customer.setCardNumber(numberCustomers);
    }
}
