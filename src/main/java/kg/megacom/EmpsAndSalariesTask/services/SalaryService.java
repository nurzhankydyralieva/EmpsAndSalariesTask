package kg.megacom.EmpsAndSalariesTask.services;

import kg.megacom.EmpsAndSalariesTask.models.dto.SalaryDto;

import java.util.List;

public interface SalaryService {
    SalaryDto addSalary(SalaryDto salaryDto);
    List<SalaryDto> getSalaries();

    SalaryDto getSalary(Long salaryId);

    SalaryDto updateSalary(Long salaryId, SalaryDto salaryDto);

    void deleteSalary(Long salaryId);

}
