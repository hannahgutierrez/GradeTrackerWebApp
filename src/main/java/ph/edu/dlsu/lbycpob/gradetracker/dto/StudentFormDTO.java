package ph.edu.dlsu.lbycpob.gradetracker.dto;

import jakarta.validation.constraints.*;

// ============================================================
// StudentFormDTO.java  (no desktop equivalent)
// ============================================================

public class StudentFormDTO {
    // ---- Identity fields ----
    @NotBlank(message = "Student name is required.")
    private String name;

    @NotBlank(message = "ID number is required.")
    @Size(min = 8, max = 8, message = "ID number must be exactly 8 digits.")
    @Pattern(regexp = "\\d{8}", message = "ID number must contain exactly 8 digits.")
    private String idNumber;

    // ---- Lab Performance: 5 module scores (40% of grade) ----
    @DecimalMin(value = "0.0", message = "Module 1 score must be 0 - 100.")
    @DecimalMax(value = "100.0", message = "Module 1 score must be 0 - 100.")
    private double module1;

    @DecimalMin(value = "0.0", message = "Module 2 score must be 0 - 100.")
    @DecimalMax(value = "100.0", message = "Module 2 score must be 0 - 100.")
    private double module2;

    @DecimalMin(value = "0.0", message = "Module 3 score must be 0 - 100.")
    @DecimalMax(value = "100.0", message = "Module 3 score must be 0 - 100.")
    private double module3;

    @DecimalMin(value = "0.0", message = "Module 4 score must be 0 - 100.")
    @DecimalMax(value = "100.0", message = "Module 4 score must be 0 - 100.")
    private double module4;

    @DecimalMin(value = "0.0", message = "Module 5 score must be 0 - 100.")
    @DecimalMax(value = "100.0", message = "Module 5 score must be 0 - 100.")
    private double module5;

    // ---- Other grade components ----
    @DecimalMin(value = "0.0", message = "Class Participation must be 0 - 100.")
    @DecimalMax(value = "100.0", message = "Class Participation must be 0 - 100.")
    private double classParticipation;

    @DecimalMin(value = "0.0", message = "Teacher's Evaluation must be 0 - 100.")
    @DecimalMax(value = "100.0", message = "Teacher's Evaluation must be 0 - 100.")
    private double teacherEvaluation;

    @DecimalMin(value = "0.0", message = "Practical Exam score must be 0 - 100.")
    @DecimalMax(value = "100.0", message = "Practical Exam score must be 0 - 100.")
    private double practicalExam;

    @DecimalMin(value = "0.0", message = "Project score must be 0 - 100.")
    @DecimalMax(value = "100.0", message = "Project score must be 0 - 100.")
    private double project;
