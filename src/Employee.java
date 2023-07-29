public class Employee extends Person{
    private  double experience;

    public Employee(String id, String name, String address, int age, double experience) {
        super(id, name, address, age);
        this.experience = experience;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", age=" + getAge() +
                ", experience=" + experience +
                '}';
    }
}
