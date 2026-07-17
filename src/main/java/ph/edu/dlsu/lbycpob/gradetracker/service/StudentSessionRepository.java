package ph.edu.dlsu.lbycpob.gradetracker.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import ph.edu.dlsu.lbycpob.gradetracker.model.Student;
import ph.edu.dlsu.lbycpob.gradetracker.util.GradeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ============================================================
// StudentSessionRepository.java
// ============================================================
@Component
@SessionScope
public class StudentSessionRepository {

    private final List<Student> students = new ArrayList<>();

    /** Adds a student to the session list if capacity allows. */
    public boolean addStudent(Student s) {
        if (students.size() >= GradeConstants.MAX_STUDENTS) return false;
        students.add(s);
        return true;
    }
