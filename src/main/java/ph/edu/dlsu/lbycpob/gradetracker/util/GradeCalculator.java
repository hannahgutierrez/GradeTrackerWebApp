package ph.edu.dlsu.lbycpob.gradetracker.util;

// ============================================================
// GradeCalculator.java
// ============================================================
public final class GradeCalculator {

    private GradeCalculator() { }  // prevent instantiation

    /** Arithmetic mean of a scores array. Returns 0.0 for null/empty. */
    public static double computeAverage(double[] scores) {
        if (scores == null || scores.length == 0) return 0.0;
        double sum = 0.0;
        for (double score : scores) sum += score;
        return sum / scores.length;
    }

