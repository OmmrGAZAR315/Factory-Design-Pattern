package Factory;


import Factory.Poster.FacebookPoster;

class FacebookCreator extends creator {
    @Override
    public ISocialMedia createConnector() {
        return  new FacebookPoster();
    }
}
