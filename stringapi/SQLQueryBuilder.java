public class SQLQueryBuilder {
    private StringBuilder query = new StringBuilder();

    public void addSelect(String columns) {
        query.append("SELECT ").append(columns).append(" ");
    }

    public void addFrom(String table) {
        query.append("FROM ").append(table).append(" ");
    }

    public void addJoin(String table, String condition) {
        query.append("JOIN ").append(table).append(" ON ").append(condition).append(" "); [cite: 298]
    }

    public void addWhere(String condition) {
        query.append("WHERE ").append(condition).append(" ");
    }

    public void addOrderBy(String column, String direction) {
        query.append("ORDER BY ").append(column).append(" ").append(direction).append(" "); [cite: 298]
    }

    public void setLimit(int limit) {
        query.append("LIMIT ").append(limit); [cite: 298]
    }

    public String build() {
        return query.toString().trim(); [cite: 298]
    }

    public static void main(String[] args) {
        SQLQueryBuilder builder = new SQLQueryBuilder();
        builder.addSelect("id, name, email");
        builder.addFrom("users");
        builder.addJoin("roles", "users.role_id = roles.id");
        builder.addWhere("age > 18 AND status = 'active'");
        builder.addOrderBy("name", "ASC");
        builder.setLimit(10);

        String finalQuery = builder.build();
        System.out.println("Generated Query:\n" + finalQuery);
        System.out.println("Query Length: " + finalQuery.length()); [cite: 298]
    }
}