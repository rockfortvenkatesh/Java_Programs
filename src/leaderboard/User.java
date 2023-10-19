package leaderboard;

public class User implements Comparable<User>{
    String name;
    String emaid_id;
    int score;
    String counry;

    public User(String argument, String argument1, String argument2) {
        this.name=argument;
        this.emaid_id=argument2;
        this.counry=argument1;
    }
    public int compareTo(User u){

        return this.score-u.score;
    }
}
