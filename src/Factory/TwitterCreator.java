package Factory;


import Factory.Poster.TwitterPoster;

class TwitterCreator extends creator {
    @Override
    public ISocialMedia createConnector() {
        return new TwitterPoster();
    }
}
