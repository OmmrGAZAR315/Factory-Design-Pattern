package Factory.Poster;

import Factory.ISocialMedia;

public class FacebookPoster implements ISocialMedia {
    @Override
    public void login(String username, String password) {
        System.out.println("you have logged in facebook successfully\nMr."+username);
    }
     @Override
     public void post(String message) {
         System.out.println(message + " in facebook");
     }
    @Override
    public void logout() {
        System.out.println("you have log out in facebook successfully");

    }


}
