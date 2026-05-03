package edu.icet.controller;

import edu.icet.dto.PayrollDto;
import edu.icet.dto.PayrollSendDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("api/payroll")
public class PayrollController {

    private final PayrollService payrollService;

    @GetMapping
    public ResponseEntity<List<PayrollSendDto>> getAllPayrolls() {
        return ResponseEntity.ok(payrollService.getAllPayrolls());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PayrollSendDto> getPayrollById(@PathVariable("id") Integer id) {
        PayrollSendDto payrollSendDto = payrollService.getPayrollById(id);
        if (payrollSendDto != null) {
            return ResponseEntity.ok(payrollSendDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<PayrollSendDto> createPayroll(@Valid @RequestBody PayrollDto payrollDto) {
        PayrollSendDto payrollSendDto = payrollService.addPayroll(payrollDto);
        return ResponseEntity.ok(payrollSendDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PayrollSendDto> updatePayroll(@PathVariable("id") Integer id, @Valid @RequestBody PayrollDto payrollDto) {
        PayrollSendDto updatedPayroll = payrollService.updatePayroll(id, payrollDto);
        if (updatedPayroll != null) {
            return ResponseEntity.ok(updatedPayroll);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
