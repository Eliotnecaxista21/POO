public class App {
    public static void main(String[] args) {
       
        Customer c1 = new Customer(1, "Emma", "Lopez", 36, "emma.doe@example.com");
        Customer c2 = new Customer(2, "Eliot", "Calderon", 20, "eliotcalderon19@gmail.com");

        MySqlCRUD conn = new MySqlCRUD();

        
        conn.insertCustomer(c1);
        conn.insertCustomer(c2);
    }
}