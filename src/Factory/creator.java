package Factory;

public abstract class creator {
     abstract ISocialMedia createConnector();

    public void post(String username, String password, String message) {
        ISocialMedia socialMedia = createConnector();
        socialMedia.login(username, password);
        socialMedia.post(message);
        socialMedia.logout();
    }
}
