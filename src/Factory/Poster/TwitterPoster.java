package Factory.Poster;

import Factory.ISocialMedia;

public class TwitterPoster implements ISocialMedia {
    @Override
    public void login(String username, String password) {
        System.out.println("you have logged in twitter successfully\nMr." + username);
    }
      @Override
      public void post(String message) {
          System.out.println(message + " in twitter");
      }
    @Override
    public void logout() {
        System.out.println("you have log out in twitter successfully");

    }


}
