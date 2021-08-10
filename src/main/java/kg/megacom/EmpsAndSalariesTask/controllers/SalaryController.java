package kg.megacom.EmpsAndSalariesTask.controllers;

import kg.megacom.EmpsAndSalariesTask.models.dto.SalaryDto;
import kg.megacom.EmpsAndSalariesTask.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/salary")
public class SalaryController {
    @Autowired
    private SalaryService salaryService;


    @PostMapping("/create")
    public SalaryDto createInfo(@RequestBody SalaryDto salaryDto) {
        return salaryService.addSalary(salaryDto);
    }
}
