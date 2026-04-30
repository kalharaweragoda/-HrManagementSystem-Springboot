package edu.icet.service;

public interface EmployeeService {
    List<LeaveSendDto> getAllLeaves();

    LeaveSendDto getLeaveById(Integer id);

    LeaveSendDto addLeave(LeaveDto leaveDto);

    LeaveSendDto updateLeave(Integer id, LeaveDto leaveDto);

    Boolean deleteLeave(Integer id);
}
