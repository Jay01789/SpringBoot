package com.example.Restaurant.management.service.Service;

import com.example.Restaurant.management.service.Model.AuthenticationToken;
import com.example.Restaurant.management.service.Model.User;
import com.example.Restaurant.management.service.Repo.iAuthRepo;
import com.example.Restaurant.management.service.Repo.iUserRepo;
import com.example.Restaurant.management.service.dto.SignInInput;
import com.example.Restaurant.management.service.dto.SignInOutput;
import com.example.Restaurant.management.service.dto.SignUpInput;
import com.example.Restaurant.management.service.dto.SignUpOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    iUserRepo userRepo;

    @Autowired
    private iAuthRepo authRepo ;

    @Autowired
    private AuthenticationService authenticationService;


    //User SignUp

    public SignUpOutput signup(SignUpInput signUpInput) {

        //checking if user alredy exist using there email
        User user = userRepo.findFirstByEmail(signUpInput.getUserEmail());

        if(user != null){
            throw new IllegalStateException("user already exist");
        }

            //save user

         user = new User(signUpInput.getUserName(),signUpInput.getUserage(),signUpInput.getUserEmail() );

         userRepo.save(user);

         //creating token

        AuthenticationToken token = new AuthenticationToken(user);
            authRepo.save(token);

            return new SignUpOutput("SignUp Scussesfull","Please SignIn now");

    }

    // User SignIn ;

    public SignInOutput signin(SignInInput signInInput) {

        User user1 = userRepo.findByEmail(signInInput.getUserEmail());
        if(user1 == null){
            throw new IllegalStateException("/Please SignUp first");
        }

        AuthenticationToken token = authenticationService.getToken(user1);

            return new SignInOutput("signIn Scussessfull", token.getToken());
    }


}
