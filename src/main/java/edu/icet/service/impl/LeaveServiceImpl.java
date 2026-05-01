package edu.icet.service.impl;

import edu.icet.dto.EmployeeDto;
import edu.icet.dto.LeaveDto;
import edu.icet.dto.LeaveSendDto;
import edu.icet.entity.LeaveEntity;
import edu.icet.repository.LeaveRepository;
import edu.icet.service.EmployeeService;
import edu.icet.service.LeaveService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LeaveServiceImpl implements LeaveService {

    private final LeaveRepository leaveRepository;
    private final EmployeeService employeeService;
    private final ModelMapper modelMapper;

    @Override
    public List<LeaveSendDto> getAllLeaves() {
        List<LeaveEntity> allLeaves = leaveRepository.findAll();
        List<EmployeeDto> allEmployees = employeeService.getAllEmployees();
        List<LeaveSendDto> dtoList = new ArrayList<>();

        for (LeaveEntity leave : allLeaves) {
            LeaveDto leaveDto = modelMapper.map(leave, LeaveDto.class);
            for (EmployeeDto employee : allEmployees) {
                if (employee.getId().equals(leaveDto.getEmployeeId())) {
                    dtoList.add(getLeaveSendDto(leaveDto, employee));
                }
            }
        }
        return dtoList;
    }
}
