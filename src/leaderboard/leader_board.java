package leaderboard;
import java.util.*;
import leaderboard.User;

public class leader_board {
  public static  ArrayList<User> userDB = new ArrayList<>();
    public static void main(String[] args) {

        boolean proceed=true;
        Scanner sc = new Scanner(System.in);
        while(proceed){


            String input=sc.nextLine();
            String[] arguments=input.split(",");
             for(int i=0;i<arguments.length;i++){
                 arguments[i]=arguments[i].trim();
             }
            switch(arguments[0]){
                case "UPSERT_USER":
                    updateUser(arguments);
                break;
                case "UPSERT_SCORE":
                    updatescore(arguments);
                break;
                case "GET_TOP":
                    getopRank(arguments);
                break;
                case "GET_USERS_WITH_SCORE":
                    getUserwithScore(arguments);
                break;
                case "SEARCH":
                    searchUser(arguments);
                break;
                default:
                    proceed=false;
                break;
             }
        }

    }

    private static void searchUser(String[] arguments) {
        String name=arguments[1];
        String email=arguments[2];
        String country=arguments[3];
        StringBuffer output=new StringBuffer();
        for(int i=0;i<userDB.size();i++){
            User user=userDB.get(i);
            if(!name.equalsIgnoreCase("null")&&!name.equals(user.name)){
                continue;
            }
            if(!email.equalsIgnoreCase("null")&&!email.equals(user.emaid_id)){
                continue;
            }
            if(!country.equalsIgnoreCase("null")&&!country.equals(user.counry)){
                continue;
            }
            output.append(user.emaid_id+",");
        }
        if(output.length()>0){
            output.deleteCharAt(output.length()-1);
        }
        System.out.println(output.toString());

    }

    private static void getUserwithScore(String[] arguments) {
         int score=Integer.parseInt(arguments[1]);
         StringBuffer sbuser=new StringBuffer();
        for(int i=0;i<userDB.size();i++){
            User user=userDB.get(i);
              if(user.score==score){
                  sbuser.append(i+"."+user.emaid_id+" ");
              }
        }
        System.out.println(String.format("Users with score %d are %s",score,sbuser.toString()));
    }

    private static void getopRank(String[] arguments) {
          Collections.sort(userDB);
           int topnum=Integer.parseInt(arguments[1]);
        StringBuffer sbuser=new StringBuffer();
           for(int i=1;i<=topnum;i++){
               User user=userDB.get(i-1);
               
               sbuser.append(i+"."+user.emaid_id+" ");
           }
        System.out.println(String.format("TOP%d users are %s",topnum,sbuser.toString()));

    }


    private static void updatescore(String[] arguments) {
        boolean updated=false;

        for(int i=0;i<userDB.size();i++){
            User user=userDB.get(i);
            if(user.emaid_id.equals(arguments[1])){
                user.score +=Integer.parseInt(arguments[2]);
                System.out.println(String.format("score updated"));
            }
        }
    }

    private static void updateUser(String[] arguments) {
       User user = new User(arguments[1],arguments[2],arguments[3]);
       userDB.add(user);
       System.out.println(String.format("%s added to the leaderboard.",arguments[1]));
    }
}
