package ph.edu.dlsu.lbycpob.gradetracker.service;

import jakarta.validation.Valid;
import org.jspecify.annotations.Nullable;
import ph.edu.dlsu.lbycpob.gradetracker.dto.StudentFormDTO;
import ph.edu.dlsu.lbycpob.gradetracker.model.Student;

public class GradeService {
    public Student buildStudent(@Valid StudentFormDTO dto) {
        return null;
    }

    public String verifyIdNumber(@Nullable Object idNumber) {
        return "";
    }
}
