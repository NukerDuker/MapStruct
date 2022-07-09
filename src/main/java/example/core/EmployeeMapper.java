package example.core;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface EmployeeMapper {

    @Mappings({
            @Mapping(target="number", source="entity.id"),
            @Mapping(target="lastName", source = "entity.lastName"),
            @Mapping(target="departmentDto", source = "entity.department")
    })
    EmployeeDto entityToDto(Employee entity);
    Employee dtoToEntity(EmployeeDto dto);
}
