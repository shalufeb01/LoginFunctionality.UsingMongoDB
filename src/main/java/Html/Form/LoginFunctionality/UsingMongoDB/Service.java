package Html.Form.LoginFunctionality.UsingMongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@org.springframework.stereotype.Service
public class Service {


MongoTemplate mongoTemplate;

   public User saveData(User user){
      return mongoTemplate.save(user);

   }

}
