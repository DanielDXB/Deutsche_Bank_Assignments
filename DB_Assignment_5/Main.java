import spark.Spark;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        /*For implementation testing
        All methods' behavior available in Utils Class
        */
        Utils utils = new Utils();

        //Customers
        Spark.put("/co_database/customers_table/:username/:last_name/:first_name/:phone" +
                "/:address/:city/:postalCode/:country", (req, res) -> {
            utils.insert(req.params(":username"), req.params(":last_name"), req.params(":first_name"), req.params(":phone"),
                    req.params(":address"), req.params(":city"), req.params(":postalCode"), req.params(":country"));
            return "Customer details: " + req.params(":username/:last_name/:first_name/:phone/:address/:city/:postalCode/:country");
        });

        Spark.put("/co_database/customers_table/:id/:username/:last_name/:first_name/:phone" +
                "/:address/:city/:postalCode/:country", (req, res) -> {
            int id = Integer.parseInt(req.params("id"));
            utils.update(id, req.params(":username"), req.params(":last_name"), req.params(":first_name"), req.params(":phone"),
                    req.params(":address"), req.params(":city"), req.params(":postalCode"), req.params(":country"));
            return "Customer details: " + req.params(":username/:last_name/:first_name/:phone/:address/:city/:postalCode/:country");
        });

        Spark.delete("/co_database/customers_table/:id", (req, res) -> {
            int id = Integer.parseInt(req.params(":id"));
            utils.delete(id);
            return "Customer has been deleted successfully ";
        });

        Spark.get("/co_database/customers_table/:id", (req, res) -> {
            int id = Integer.parseInt(req.params(":id"));
            utils.getById(id);
            return "Customer details: " + req.params();
        });

        Spark.get("/co_database/customers_table", (req, res) -> {
            utils.getALL();
            return "Customer details: " + req.params();
        });

        // Orders
        Spark.put("/co_database/orders_table/:order_date/:shipped_date/:status/:comments/:customer_id", (req, res) -> {
            int customer_id = Integer.parseInt(req.params(":customer_id"));
            utils.addNewOrder(req.params(":order_date"), req.params(":shipped_date"),
                    req.params(":status"), req.params(":comments"), customer_id);
            return "Order details: " + req.params(":order_date/:shipped_date/:status/:comments/:customer_id");
        });

        Spark.put("/co_database/orders_table/:shipped_date/:status/:order_id", (req, res) -> {
            int order_id = Integer.parseInt(req.params(":order_id"));
            utils.updateOrder(req.params(":shipped_date"), req.params(":status"),  order_id);
            return "Order updated!";
        });

        Spark.delete("/co_database/orders_table/:id", (req, res) -> {
            int id = Integer.parseInt(req.params(":id"));
            utils.deleteOrder(id);
            return "Order has been deleted successfully ";
        });

        Spark.get("/co_database/orders_table/:id", (req, res) -> {
            int id = Integer.parseInt(req.params(":id"));
            utils.viewAllOrders(id);
            return "Order details: " + req.params().toString();
        });

        Spark.get("/co_database/orders_table", (req, res) -> {
            utils.viewAllOrdersFromAllCustomers();
            return "viewAllOrdersFromAllCustomers";
        });

    }
}
