package lk.ijse.dep13.spring.web.api;

import com.google.gson.Gson;
import lk.ijse.dep13.spring.web.to.CustomerTo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin
public class CustomerHttpController {

    public CustomerHttpController() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable("id") String id){
        try(Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/dep13_spring_web",
                        "root", "mysql");
            Statement stm = connection.createStatement()){
            int affectedRows = stm.executeUpdate("DELETE FROM customer WHERE id=" + id);
            if (affectedRows == 1) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping
    public List<CustomerTo> getAllCustomers(){
        try(Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/dep13_spring_web",
                        "root", "mysql");
            Statement stm = connection.createStatement()){
            ResultSet rst = stm.executeQuery("SELECT * FROM customer");
            List<CustomerTo> customerList = new ArrayList<>();
            while (rst.next()){
                String id = "C%03d".formatted(rst.getInt("id"));
                String name = rst.getString("name");
                String address = rst.getString("address");
                customerList.add(new CustomerTo(id, name, address));
            }
            return customerList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
