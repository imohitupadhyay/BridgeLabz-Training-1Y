public class ProductDescriptionGenerator {
    public static String generateDescription(String title, String brand, String model, String price) {
        StringBuilder sb = new StringBuilder(); // Efficient for dynamic building [cite: 309]

        // Product Title and SKU [cite: 304]
        sb.append("<h1>").append(title).append("</h1>\n");

        // Basic Info [cite: 304]
        sb.append("<p><strong>Brand:</strong> ").append(brand)
                .append(" | <strong>Model:</strong> ").append(model).append("</p>\n");

        // Features [cite: 304]
        sb.append("<h3>Key Features:</h3>\n<ul>\n")
                .append("  <li>High performance</li>\n")
                .append("  <li>Energy efficient</li>\n")
                .append("  <li>2-year warranty</li>\n")
                .append("  <li>Water resistant</li>\n")
                .append("</ul>\n");

        // Pricing [cite: 304]
        sb.append("<p>Price: <span style='color:green'>").append(price).append("</span></p>");

        return sb.toString();
    }

    public static void main(String[] args) {
        String product = generateDescription("Pro Laptop 2026", "TechCo", "PX-500", "$1200");
        System.out.println(product);
        System.out.println("\nTotal Description Length: " + product.length()); [cite: 304]
    }
}