package Html.Form.LoginFunctionality.UsingMongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends MongoRepository<User,String> {

    @Override
    <S extends User> S insert(S entity);
}
