package example.core;

public class EmployeeDto {

    private String number;

    private String lastName;

    public DepartmentDto departmentDto;

    public String getNumber() {
        return number;
    }

    public EmployeeDto setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public EmployeeDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeDto setDepartmentDto(DepartmentDto departmentDto) {
        this.departmentDto = departmentDto;
        return this;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "number='" + number + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentDto=" + departmentDto +
                '}';
    }
}
