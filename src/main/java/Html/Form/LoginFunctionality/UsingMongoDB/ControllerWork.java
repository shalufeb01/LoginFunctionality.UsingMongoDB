package Html.Form.LoginFunctionality.UsingMongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class ControllerWork {

    //private MongoTemplate mongoTemplate;

   private Repo repo;

@Autowired
private Service service;

    @RequestMapping(value = "/get_ragister",method = RequestMethod.POST)
    public User ragister(@ModelAttribute User user){

        System.out.println(user);
      if(repo.save(user)!= null){
        repo.save(user);}

         return user;
    }
}
