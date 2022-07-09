package example.core;

public class DepartmentDto {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public DepartmentDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DepartmentDto setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "DepartmentDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
