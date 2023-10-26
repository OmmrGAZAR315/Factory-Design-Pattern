package Factory;

public class Factory {
    creator Factory;

    public Factory(String type) {
        switch (type) {
            case "Twitter" -> Factory = new TwitterCreator();
            case "Facebook" -> Factory = new FacebookCreator();
            case "Instagram" -> Factory = new InstagramCreator();
        }

    }

    public void post(String username, String password, String message) {
        Factory.post(username, password, message);
    }
}
