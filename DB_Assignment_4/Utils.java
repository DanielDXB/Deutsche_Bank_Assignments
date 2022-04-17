import java.sql.*;

public class Utils {
    private final String url = "jdbc:mysql://localhost:3306/course2db";
    private final String user = "root";
    private final String password = "root";

    Connection connection = DriverManager.getConnection(url, user, password);

    public Utils() throws SQLException {
    }

    public void insert(String username, String last_name, String first_name,
                       String phone, String address, String city,
                       String postalCode, String country) throws SQLException {
        String insertValues = "insert into customers (username, last_name, first_name, phone, address, city, postalCode, country) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertValues);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, last_name);
        preparedStatement.setString(3, first_name);
        preparedStatement.setString(4, phone);
        preparedStatement.setString(5, address);
        preparedStatement.setString(6, city);
        preparedStatement.setString(7, postalCode);
        preparedStatement.setString(8, country);
        preparedStatement.execute();
    }

    public void delete(int idToBeDeleted) throws SQLException {
        String delete = "DELETE FROM customers WHERE id = " + idToBeDeleted;

        PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.execute();
    }

    public void update(int id, String username, String last_name, String first_name,
                       String phone, String address, String city,
                       String postalCode, String country) throws SQLException {
        String update = ("UPDATE customers SET username=?, last_name=?, first_name=?," +
                "phone=?, address=?, city=?, postalCode=?, country=? WHERE id = " + id);

        PreparedStatement preparedStatement = connection.prepareStatement(update);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, last_name);
        preparedStatement.setString(3, first_name);
        preparedStatement.setString(4, phone);
        preparedStatement.setString(5, address);
        preparedStatement.setString(6, city);
        preparedStatement.setString(7, postalCode);
        preparedStatement.setString(8, country);
        preparedStatement.execute();
    }

    public void getById(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customers WHERE id=" + id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.print(id + " ");
            System.out.println(resultSet.getString("username") + " "
                    + resultSet.getString("last_name") + " "
                    + resultSet.getString("first_name") + " "
                    + resultSet.getString("phone") + " "
                    + resultSet.getString("address") + " "
                    + resultSet.getString("city") + " "
                    + resultSet.getString("postalCode") + " "
                    + resultSet.getString("country"));
        }
    }

    public void getALL() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customers");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("username") + " "
                    + resultSet.getString("last_name") + " "
                    + resultSet.getString("first_name") + " "
                    + resultSet.getString("phone") + " "
                    + resultSet.getString("address") + " "
                    + resultSet.getString("city") + " "
                    + resultSet.getString("postalCode") + " "
                    + resultSet.getString("country"));
        }
    }

    public void addNewOrder(Date order_date, Date shipped_date, String status, String comments, int customer_id) throws SQLException {
        String addNewOrder = ("INSERT INTO orders (order_date, shipped_date, status, comments, customer_id)" +
                "values (?,?,?,?,?)");
        String userExists = "SELECT * FROM customers WHERE id=" + customer_id;
        PreparedStatement preparedStatementCheck = connection.prepareStatement(userExists);
        if (preparedStatementCheck.execute()) {
            PreparedStatement preparedStatement = connection.prepareStatement(addNewOrder);
            preparedStatement.setDate(1, order_date);
            preparedStatement.setDate(2, shipped_date);
            preparedStatement.setString(3, status);
            preparedStatement.setString(4, comments);
            preparedStatement.setInt(5, customer_id);
            preparedStatement.execute();

            String updateStatus = ("UPDATE stocks SET quantity=?");
            ResultSet resultSet = preparedStatement.executeQuery();
            PreparedStatement preparedStatementUpdate = connection.prepareStatement(updateStatus);
            preparedStatementUpdate.setInt(1, resultSet.getInt(2) - 1);
            preparedStatementUpdate.execute();
        }
    }

    public void viewAllOrders(int customer_id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM orders WHERE customer_id=" + customer_id);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getDate("order_date") + " "
                    + resultSet.getDate("shipped_date") + " "
                    + resultSet.getString("status") + " "
                    + resultSet.getString("comments"));
        }
    }

    public void updateOrder(String status, int customer_id) throws SQLException {
        String updateStatus = ("UPDATE orders SET status=? WHERE id = " + customer_id);

        PreparedStatement preparedStatement = connection.prepareStatement(updateStatus);
        preparedStatement.setString(1, status);
        preparedStatement.execute();
    }

    public void addComments(String comment, int customer_id) throws SQLException {
        String addStatus = ("UPDATE orders SET comments=? WHERE id = " + customer_id);

        PreparedStatement preparedStatement = connection.prepareStatement(addStatus);
        preparedStatement.setString(1, comment);
        preparedStatement.execute();
    }
}
