import java.util.StringTokenizer;
import java.time.LocalTime;

public class SocialMediaProcessor {
    // Part C: Thread-safe history [cite: 306]
    private static StringBuffer history = new StringBuffer();

    // Part A & B: Parsing and Formatting [cite: 306]
    public static String processMessage(String user, String rawMessage) {
        StringTokenizer st = new StringTokenizer(rawMessage, " ", true);
        StringBuilder formatted = new StringBuilder();
        formatted.append("[").append(LocalTime.now().withNano(0)).append("] ")
                .append(user).append(": ");

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.startsWith("@")) {
                formatted.append("**").append(token).append("**"); // Bold mentions
            } else if (token.startsWith("#")) {
                formatted.append("*").append(token).append("*");    // Italic hashtags
            } else if (token.startsWith("/")) {
                formatted.append("[CMD: ").append(token.substring(1)).append("]"); // Color-coded
            } else {
                formatted.append(token);
            }
        }

        String result = formatted.toString();
        synchronized(history) {
            history.append(result).append("\n");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(processMessage("Alice", "Hello @John! Let's discuss #Java. /help"));
        System.out.println(processMessage("Bob", "@Alice thanks! I love #Programming"));

        System.out.println("\n--- Conversation Thread ---");
        System.out.println(history.toString());
    }
}