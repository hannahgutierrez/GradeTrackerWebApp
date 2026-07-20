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
