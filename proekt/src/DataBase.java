import java.sql.*;
import java.util.ArrayList;

public class DataBase{
    private static Connection connection;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book?serverTimezone=UTC", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void addToDB(Book book){
        try {
            PreparedStatement insert= connection.prepareStatement("INSERT INTO `books`(`id`, `name`, `author`, `Genre`, `price`, `ISBN`, `year`, `publisher`) VALUES (NULL, ?,?,?,?,?,?,?)");
            insert.setString(1,book.getName());
            insert.setString(2,book.getAuthor());
            insert.setString(3,book.getGenre());
            insert.setLong(4,book.getPrice());
            insert.setLong(5,book.getISBN());
            insert.setInt(6,book.getYear());
            insert.setString(7,book.getPublisher());
            insert.executeUpdate();
            insert.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public ArrayList<Book> listOfDB(){
        ArrayList<Book> listFromData= new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM `books` ");
            ResultSet resultSet = statement.executeQuery();///
            while (resultSet.next()){
                Integer id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String author=resultSet.getString("author");
                String Genre= resultSet.getString("Genre");
                Long price= resultSet.getLong("price");
                Long ISBN=resultSet.getLong("ISBN");
                Integer year=resultSet.getInt("year");
                String publisher= resultSet.getString("publisher");
                listFromData.add(new Book(id,name,author,Genre,price,ISBN,year,publisher));
            }
            statement.close();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

        return listFromData;
    }
    public void delete(Integer index){
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("DELETE FROM `books` WHERE id = ?");
            statement.setInt(1, index);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void update(String attribute,String before,String after) {
        if (attribute.equals("name")) {
            try {
                PreparedStatement update = connection.prepareStatement("UPDATE `books` SET name=? WHERE name= ?");
                update.setString(1, after);
                update.setString(2, before);
                update.executeUpdate();
                update.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else  if (attribute.equals("id")) {
            try {
                PreparedStatement update = connection.prepareStatement("UPDATE `books` SET id= ? WHERE id=?");
                update.setInt(1,Integer.parseInt(after));
                update.setInt(2,Integer.parseInt(before));
                update.executeUpdate();
                update.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (attribute.equals("author")) {
            try {
                PreparedStatement update = connection.prepareStatement("UPDATE `books` SET author= ? WHERE author=?");
                update.setString(1, after);
                update.setString(2, before);
                update.executeUpdate();
                update.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (attribute.equals("Genre")) {
            try {
                PreparedStatement update = connection.prepareStatement("UPDATE `books` SET Genre= ? WHERE Genre=?");
                update.setString(1, after);
                update.setString(2, before);
                update.executeUpdate();
                update.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (attribute.equals("price")) {
            try {
                PreparedStatement update = connection.prepareStatement("UPDATE `books` SET price= ? WHERE price=?");
                update.setLong(1,Long.parseLong(after));
                update.setLong(2, Long.parseLong(before));
                update.executeUpdate();
                update.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (attribute.equals("ISBN")) {
            try {
                PreparedStatement update = connection.prepareStatement("UPDATE `books` SET ISBN= ? WHERE ISBN=?");
                update.setLong(1,Long.parseLong(after));
                update.setLong(2, Long.parseLong(before));
                update.executeUpdate();
                update.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else  if (attribute.equals("year")) {
            try {
                PreparedStatement update = connection.prepareStatement("UPDATE `books` SET year= ? WHERE year=?");
                update.setInt(1,Integer.parseInt(after));
                update.setInt(2,Integer.parseInt(before));
                update.executeUpdate();
                update.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        else if (attribute.equals("publisher")) {
            try {
                PreparedStatement update = connection.prepareStatement("UPDATE `books` SET publisher= ? WHERE publisher=?");
                update.setString(1, after);
                update.setString(2, before);
                update.executeUpdate();
                update.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
