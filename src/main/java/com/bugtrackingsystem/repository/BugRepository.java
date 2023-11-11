package com.bugtrackingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.bugtrackingsystem.enums.BugStatusEnum;
import com.bugtrackingsystem.enums.SeverityEnum;
import com.bugtrackingsystem.models.Bug;
import com.bugtrackingsystem.models.User;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BugRepository extends JpaRepository<Bug, Long> {
    List<Bug> findByProject_IdAndCreatedBy_Id(Long id, Long id1);
    List<Bug> findByProject_IdAndAssignTo_Id(Long id, Long id1);
    List<Bug> findByCreatedOn(LocalDateTime createdOn);
    List<Bug> findByAssignToAndBugStatus(User assignTo, BugStatusEnum bugStatus);
    List<Bug> findByAssignTo_IdAndProject_IdAndBugStatusAndSeverity(@Nullable Long id, @Nullable Long id1, @Nullable BugStatusEnum bugStatus, @Nullable SeverityEnum severity);
    List<Bug> findBySeverity(SeverityEnum severity);
    List<Bug> findByBugStatus(BugStatusEnum bugStatus);
    List<Bug> findByProject_Id(Long id);
    List<Bug> findByCreatedBy_Id(Long id);
    List<Bug> findByAssignTo_Id(Long id);
}
