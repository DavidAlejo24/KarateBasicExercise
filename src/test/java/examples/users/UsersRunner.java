package examples.users;

import com.intuit.karate.junit5.Karate;

class   UsersRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("../features/petStoreCRUD.feature").relativeTo(getClass());
    }    

}
