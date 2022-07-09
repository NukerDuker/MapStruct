# MapStruct
generating code with mapstruct (Reflecton)  
This project shows how mapstruct help with crteating DTO objects.  
We can create Emplyee instance, and it will be simply mapped to EmployeeDto object.

1. We need to add @Mapper annotation to our mapper interface
2. Specify @Mappings if there are different property names in original obj and dto
3. Compile code
4. Create Department, Employee, and then use one of mapper interface methods, to map instances
