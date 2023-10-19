package Practice;

public class uniqueArray {

    public static void main(String[] args) {
        int d[]={10,20,90,20,50,60,70,10,90,90,110,80,120};
        for(int i = 0 ; i < d.length;i++){
//            boolean check = true;
            int count = 1;
            for(int j = 0;j<d.length;j++){
                if(i !=j && d[i] ==d[j]){
                    count++;
                    //check = false;
                    break;
                }
            }
            if(count==1){
                System.out.print(d[i]+ " ");
            }

        }

    }
}
