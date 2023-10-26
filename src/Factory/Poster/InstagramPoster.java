package Factory.Poster;

import Factory.ISocialMedia;

public class InstagramPoster implements ISocialMedia {
    @Override
    public void login(String username, String password) {
        System.out.println("you have logged in instagram successfully\nMr."+username);
    }
     @Override
     public void post(String message) {
         System.out.println(message + " in instagram");
     }
    @Override
    public void logout() {
        System.out.println("you have log out in instagram successfully");

    }


}
