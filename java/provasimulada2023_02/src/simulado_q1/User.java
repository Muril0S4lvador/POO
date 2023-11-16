package simulado_q1;

import java.util.ArrayList;
import java.util.*;

public class User {
    private String twitterId;
    private String nome;
    private LinkedList<Tweet> tweets = new LinkedList<>();

    public User(String nome){
        this.nome = nome;
        this.twitterId = nome;
    }

    public String getId(){
        return this.twitterId;
    }
    public String getNome(){
        return this.nome;
    }
    public List<Tweet> getTweets(){
        return new ArrayList<>(tweets);
    }

    public void tweet(String tweet){
        this.tweets.add(new Tweet(tweet));
    }

    public Boolean isVerified(){
        return false;
    }

    public int tamanhoMedioTweets(){
        int sum = 0, cont = 0;
        for( Tweet t : this.tweets ){
            sum += t.getLengthTweet();
            cont++;
        }
        return sum / cont;
    }

    @Override
    public String toString(){
        return "Usuario: " + this.nome;
    }

}
