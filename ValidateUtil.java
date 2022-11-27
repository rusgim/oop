public class ValidateUtil {
    public static String validateString(String value, String substitution) {
        return (value == null || value.isBlank() || value.isEmpty()) ? substitution : value;
    }

    public static Boolean validateBoolean(Boolean value) {
        return value != null && value;
    }
}
