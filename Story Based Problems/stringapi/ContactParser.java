import java.util.StringTokenizer;

public class ContactParser {
    public static void main(String[] args) {
        String data = "John Doe;+1-555-0101;john@email.com;123 Main St, NYC\n" +
                "Jane Smith;+1-555-0102;jane@email.com;456 Oak Ave, LA\n" +
                "Bob Wilson;+1-555-0103;bob@email.com;789 Pine Rd, Chicago\n" +
                "Alice Brown;+1-555-0104;alice@email.com;321 Elm St, Miami\n" +
                "Charlie Davis;+1-555-0105;charlie@email.com;654 Maple Dr, Seattle";

        // Step 1: Tokenize by newline to get individual contacts [cite: 297]
        StringTokenizer contactLines = new StringTokenizer(data, "\n");
        int count = 0;

        while (contactLines.hasMoreTokens()) {
            String line = contactLines.nextToken();
            // Step 2: Tokenize each contact by semicolon [cite: 297]
            StringTokenizer details = new StringTokenizer(line, ";");

            System.out.println("---------- Contact Card ----------");
            if (details.hasMoreTokens()) System.out.println("Name:    " + details.nextToken());
            if (details.hasMoreTokens()) System.out.println("Phone:   " + details.nextToken());
            if (details.hasMoreTokens()) System.out.println("Email:   " + details.nextToken());
            if (details.hasMoreTokens()) System.out.println("Address: " + details.nextToken());
            System.out.println("----------------------------------\n");

            count++;
        }
        System.out.println("Total contacts processed: " + count); [cite: 297]
    }
}