package edu.icet.service;

import edu.icet.dto.LeaveSendDto;

import java.util.List;

public interface LeaveService {

    List<LeaveSendDto> getAllLeaves();

    LeaveSendDto getLeaveById(Integer id);

    LeaveSendDto addLeave(LeaveDto leaveDto);

    LeaveSendDto updateLeave(Integer id, LeaveDto leaveDto);

    Boolean deleteLeave(Integer id);
}
