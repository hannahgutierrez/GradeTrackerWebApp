package ph.edu.dlsu.lbycpob.gradetracker.util;

// ============================================================
// IDVerifier.java
// ============================================================

public final class IDVerifier {

    private IDVerifier() { }  // prevent instantiation

    /**
     * Returns true iff the ID string passes all three checks:
     *   (1) exactly ID_LENGTH (8) characters
     *   (2) all characters are digits
     *   (3) dot-product is divisible by ID_DIVISOR (11)
     */
    public static boolean isValidID(String idNumber) {
        if (idNumber == null || idNumber.length() != GradeConstants.ID_LENGTH)
            return false;
        if (!idNumber.chars().allMatch(Character::isDigit))
            return false;
        return calculateDotProduct(idNumber) % GradeConstants.ID_DIVISOR == 0;
    }

    /**
     * Returns "faculty" or "student" based on the dot-product quotient.
     * Call ONLY after isValidID() returns true.
     */
    public static String getIDRole(String idNumber) {
        int quotient = calculateDotProduct(idNumber) / GradeConstants.ID_DIVISOR;
        return (quotient >= GradeConstants.FACULTY_THRESHOLD) ? "faculty" : "student";
    }

/**
 * Returns a human-readable validation result message.
 *   Invalid -> message starts with "Invalid"
 *   Valid   -> "Valid faculty ID number." or "Valid student ID number."
 */
