package kg.megacom.EmpsAndSalariesTask.models.dto;

import lombok.Data;

@Data
public class EmployeeDto {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private boolean active;

}
