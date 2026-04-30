package edu.icet.service;

import edu.icet.dto.LeaveDto;
import edu.icet.dto.LeaveSendDto;

import java.util.List;

public interface EmployeeService {
    List<LeaveSendDto> getAllLeaves();

    LeaveSendDto getLeaveById(Integer id);

    LeaveSendDto addLeave(LeaveDto leaveDto);

    LeaveSendDto updateLeave(Integer id, LeaveDto leaveDto);

    Boolean deleteLeave(Integer id);
}
