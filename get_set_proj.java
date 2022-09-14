// make a class employe 
class Employee{
    int salary;
    String name;
    public int getsalary(){
        salary = 1300;
        return salary;
    }
    public String getname(){
        name = "suraj";
        return name;
    }
    public String setname(String n_name){
        name = n_name;
        return name;
    }
}
public class get_set_proj {
    
    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println(obj.getsalary());
        System.out.println(obj.getname());
        System.out.println(obj.setname("master"));
    }
}
