public class Instructor extends Person {
    private String department;
    private int phoneNumber;

    public Instructor(String name, String userName, int id,String department,int phoneNumber) {
        super(name, userName, id);
        this.department=department;
        this.phoneNumber=phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "department='" + department + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}




