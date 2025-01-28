public class Hash {
        public static void main(String[] args){
            int n=5;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==1 || i==3||j==1 ||j==3){
                        System.out.print("#");
    
                    }else if((i+j)%2==0){
                        System.out.print("*");
    
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
           }
    
        }
    }

