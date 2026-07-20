package ph.edu.dlsu.lbycpob.gradetracker.service;

import org.springframework.stereotype.Service;
import ph.edu.dlsu.lbycpob.gradetracker.dto.StudentFormDTO;
import ph.edu.dlsu.lbycpob.gradetracker.model.Student;
import ph.edu.dlsu.lbycpob.gradetracker.util.GradeCalculator;
import ph.edu.dlsu.lbycpob.gradetracker.util.IDVerifier;


public class GradeService {
    public Student buildStudent(@Valid StudentFormDTO dto) {
        return null;
    }

    public String verifyIdNumber(@Nullable Object idNumber) {
        return "";
    }
}
