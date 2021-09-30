package Html.Form.LoginFunctionality.UsingMongoDB;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@Document(collection = "userLoginFormData")
public class User {


    @Id
    int id;
    String name;

    @Indexed
    String password;
    public User(){

    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
