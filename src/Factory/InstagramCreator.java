package Factory;

import Factory.Poster.InstagramPoster;

class InstagramCreator extends creator {
    @Override
    public ISocialMedia createConnector() {
        return  new InstagramPoster();
    }
}
