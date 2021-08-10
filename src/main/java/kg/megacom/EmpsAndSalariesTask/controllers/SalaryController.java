package kg.megacom.EmpsAndSalariesTask.controllers;

import kg.megacom.EmpsAndSalariesTask.models.dto.SalaryDto;
import kg.megacom.EmpsAndSalariesTask.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/salary")
public class SalaryController {
    @Autowired
    private SalaryService salaryService;


    @PostMapping("/create")
    public SalaryDto createInfo(@RequestBody SalaryDto salaryDto) {
        return salaryService.addSalary(salaryDto);
    }

    @PutMapping("/{salaryId}")
    public SalaryDto updateSalary(@PathVariable("salaryId") Long salaryId, @RequestBody SalaryDto salaryDto) {
        return salaryService.updateSalary(salaryId, salaryDto);
    }
    @GetMapping
    public List<SalaryDto> getSalaryAll() {
        return salaryService.getSalaries();
    }

    @GetMapping("/{salaryId}")
    public SalaryDto getSalaryById(@PathVariable("salaryId") Long salaryId) {
        return salaryService.getSalary(salaryId);
    }
}
