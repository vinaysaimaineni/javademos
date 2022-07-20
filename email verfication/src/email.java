import java.util.ArrayList;

public class email{

    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        
        emailID.add("sai12@gmail.com");
        emailID.add("srinivas@gmail.com");
        emailID.add("shoban@gmail.com");
        emailID.add("ntr0@gmail.com");
        emailID.add("ravi2@gmail.com");
        emailID.add("mahesh@gmail.com");
       
        int c = 0;
        
   
        String searchEmail = "srinivas@gmail.com";
        
                for(int i=0; i<emailID.size(); i++) {
                    
                    
                    if(searchEmail==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                       c = 1;
                        
                        break;
                        
                    }
                }
                
                if(c==1)
                {System.out.println("email ID :" + searchEmail + "  is found");}
                else{System.out.println("email ID Not found");}

    }

}