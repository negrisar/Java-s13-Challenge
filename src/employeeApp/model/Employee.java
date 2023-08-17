package employeeApp.model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Employee {

    private int id;
    private String fullname;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullname, String email, String password, String[] healthplans){
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;

    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void addHealthplan(int index, String name) {
        healthplans[index] = name;
        try {
            if (healthplans[index] == null) {
                healthplans[index] = name;
            } else {
                System.out.println("İlgili index için atama yapılmış.");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Olmayan index için atama yapıldı" + index);
        }

    }

    @Override
    public String toString() {
        return "FullName: " + fullname + " Healthplan: " + Arrays.toString(healthplans);
    }
}
