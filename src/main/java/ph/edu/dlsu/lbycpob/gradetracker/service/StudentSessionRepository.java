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

    /** Returns an unmodifiable view of the student list. */
    public List<Student> getAllStudents() {
        return Collections.unmodifiableList(students);
    }

    /** Returns the student at the given zero-based index, or null. */
    public Student getStudent(int index) {
        if (index < 0 || index >= students.size()) return null;
        return students.get(index);
    }

    /** Total number of students currently stored. */
    public int getCount() { return students.size(); }

    /** Clears all students (equivalent to resetting the app on the desktop). */
    public void clear() { students.clear(); }

    /** True when the list has reached MAX_STUDENTS. */
    public boolean isFull() { return students.size() >= GradeConstants.MAX_STUDENTS; }
