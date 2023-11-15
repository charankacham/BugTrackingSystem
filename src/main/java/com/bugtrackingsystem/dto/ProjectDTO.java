package com.bugtrackingsystem.dto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO {

	private Integer projId;
	private String projName;
	private String projectDescription;
	private String projStatus;
	private List<DeveloperDTO> devList;
	private List<TestEngineerDTO> testEngList;
	

}
