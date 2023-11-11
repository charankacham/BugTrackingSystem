package com.bugtrackingsystem.dto;

import com.bugtrackingsystem.enums.BugStatusEnum;
import com.bugtrackingsystem.enums.SeverityEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchDTO {
    private Long projectId;
    private BugStatusEnum bugStatus;
    private SeverityEnum severity;
    private Long userId;
}
