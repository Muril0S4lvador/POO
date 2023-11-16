package simulado_q1;

public class Tweet {
    private String tweet;

    public Tweet(String tweet){
        this.tweet = tweet;
    }

    public int getLengthTweet(){
        return tweet.length();
    }

    @Override
    public String toString(){
        return this.tweet;
    }
    
}
