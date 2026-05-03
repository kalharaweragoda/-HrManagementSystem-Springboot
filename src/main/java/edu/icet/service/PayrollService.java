package edu.icet.service;

import edu.icet.dto.PayrollSendDto;

public interface PayrollService {
    PayrollSendDto getPayrollById(Integer id);
}
