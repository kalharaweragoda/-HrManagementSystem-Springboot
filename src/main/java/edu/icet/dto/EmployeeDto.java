package edu.icet.dto;

import edu.icet.util.DepartmentType;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private Integer id;

    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name must not exceed 100 characters")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name must only contain letters and spaces")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email format is invalid")
    private String email;

    @NotNull(message = "Department is required")
    private DepartmentType departmentType;

    private LocalDate createdAt;
    private LocalDate updatedAt;

}
