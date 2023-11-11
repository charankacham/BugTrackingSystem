package com.bugtrackingsystem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.bugtrackingsystem.enums.BugStatusEnum;
import com.bugtrackingsystem.enums.SeverityEnum;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private SeverityEnum severity;
    private String comments;
    @OneToOne
    private User createdBy;
    @OneToOne
    private User assignTo;
    @OneToOne
    private Project project;
    private BugStatusEnum bugStatus;
    private LocalDateTime createdOn;
    private LocalDateTime lastUpdatedOn;

}
