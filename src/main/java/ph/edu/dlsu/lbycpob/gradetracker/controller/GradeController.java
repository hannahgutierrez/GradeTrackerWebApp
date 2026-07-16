package ph.edu.dlsu.lbycpob.gradetracker.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ph.edu.dlsu.lbycpob.gradetracker.dto.ClassStatsResult;
import ph.edu.dlsu.lbycpob.gradetracker.dto.IDVerifyFormDTO;
import ph.edu.dlsu.lbycpob.gradetracker.dto.StudentFormDTO;
import ph.edu.dlsu.lbycpob.gradetracker.model.Student;
import ph.edu.dlsu.lbycpob.gradetracker.service.GradeService;
import ph.edu.dlsu.lbycpob.gradetracker.service.StudentSessionRepository;
import ph.edu.dlsu.lbycpob.gradetracker.util.GradeCalculator;
import ph.edu.dlsu.lbycpob.gradetracker.util.GradeConstants;
import ph.edu.dlsu.lbycpob.gradetracker.util.IDVerifier;

public class GradeController {
    private final StudentSessionRepository repo;
    private final GradeService gradeService;

    // Constructor injection -- preferred over @Autowired on fields
    public GradeController(StudentSessionRepository repo, GradeService gradeService) {
        this.repo         = repo;
        this.gradeService = gradeService;
    }

}
