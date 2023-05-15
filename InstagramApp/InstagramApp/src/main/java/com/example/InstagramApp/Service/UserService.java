package com.example.InstagramApp.Service;

import com.example.InstagramApp.Model.AuthenticationToken;
import com.example.InstagramApp.Model.Post;
import com.example.InstagramApp.Model.User;
import com.example.InstagramApp.Repo.IPostRepo;
import com.example.InstagramApp.Repo.IUserRepo;
import com.example.InstagramApp.dto.SIgnInInput;
import com.example.InstagramApp.dto.SignInOutput;
import com.example.InstagramApp.dto.SignUpInput;
import com.example.InstagramApp.dto.SignUpOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.xml.bind.DatatypeConverter;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class UserService {

    @Autowired
    private IUserRepo userRepo;

    @Autowired
    private AuthService tokenService;

    @Autowired
    private IPostRepo postRepo;


    public SignUpOutput signup(SignUpInput signUpDto) throws NoSuchAlgorithmException {

            User user = userRepo.findFirstByUseremail(signUpDto.getUserEmail());

            if(user != null){
            throw  new IllegalStateException("User Email ALready Exist ,Please Login");
            }

        //encrypting the password before saving it to the data base

        String encryptedPassword =  encryptedPassword(signUpDto.getUserPassword());

            //saving user to db

     user =new User(signUpDto.getUserFirstName(),signUpDto.getUserLastName(),signUpDto.getUserEmail(),
             signUpDto.getUserContact(),encryptedPassword);

     userRepo.save(user);

     //token creation and saving

        AuthenticationToken token = new AuthenticationToken(user);

        tokenService.saveToken(token);

return new SignUpOutput("User Registered","Registered Sucessfully");

    }

    //encrypting password and returning it
    private String encryptedPassword(String userPassword ) throws NoSuchAlgorithmException {
MessageDigest md5 =MessageDigest.getInstance("MD5");
  md5.update(userPassword.getBytes());
  byte[] digested =md5.digest();
  String hash= DatatypeConverter.printHexBinary(digested);
  return hash;
    }

    public SignInOutput SignIn(SIgnInInput signInDto) throws NoSuchAlgorithmException {

        User user =userRepo.findFirstByUseremail(signInDto.getUser_Email());

        if(user == null){
            throw new IllegalStateException("User doesnt exist Please SignIn First");
        }

        String encryptedpassword1 = encryptedPassword(signInDto.getUser_Password());

        boolean isPasswordValid = encryptedpassword1.equals(user.getUserPassword());

        if(!isPasswordValid){
throw new IllegalStateException("Wrong Password/email");
        }

        //get the Token

        AuthenticationToken authenticationToken =tokenService.getToken(user);


        return new SignInOutput("SignIn Scussesfull",authenticationToken.getToken());


    }

    public void post(Post post, String userEmail, String token) {

        if(tokenService.authticate(userEmail,token)){
            postRepo.save(post);
        }
    }
}
