package kg.megacom.EmpsAndSalariesTask.services.impl;

import kg.megacom.EmpsAndSalariesTask.models.dto.SalaryDto;
import kg.megacom.EmpsAndSalariesTask.services.SalaryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class SalaryServiceImpl implements SalaryService {
    private List<SalaryDto> salaryDtoList = new CopyOnWriteArrayList<>();

    @Override
    public SalaryDto addSalary(SalaryDto salaryDto) {
        salaryDtoList.add(salaryDto);
        return salaryDto;
    }

    @Override
    public List<SalaryDto> getSalaries() {
        return salaryDtoList;
    }

    @Override
    public SalaryDto getSalary(Long salaryId) {
        return salaryDtoList
                .stream()
                .filter(s -> s.getSalaryId() == salaryId)
                .findFirst()
                .get();
    }


    @Override
    public SalaryDto updateSalary(Long salaryId, SalaryDto salaryDto) {
        salaryDtoList
                .stream()
                .forEach(s -> {
                    if (s.getSalaryId() == salaryId) {
                        s.setEmployee(salaryDto.getEmployee());
                        s.setSalary(salaryDto.getSalary());
                        s.setStartDate(salaryDto.getStartDate());
                        s.setEndDate(salaryDto.getEndDate());

                    }
                });
        return salaryDtoList
                .stream()
                .filter(s -> s.getSalaryId() == salaryId)
                .findFirst()
                .get();
    }


    @Override
    public void deleteSalary(Long salaryId) {
        salaryDtoList
                .stream()
                .forEach(s -> {
                    if (s.getSalaryId() == salaryId) {
                        salaryDtoList.remove(s);
                    }
                });

    }


}



