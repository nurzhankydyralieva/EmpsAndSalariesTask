package kg.megacom.EmpsAndSalariesTask.models.dto;

import kg.megacom.EmpsAndSalariesTask.models.Employee;
import lombok.Data;

import java.util.Date;

@Data
public class SalaryDto {
    private Long salaryId;
    private double salary;
    private Date startDate;
    private Date endDate;
    private Employee employee;

}
