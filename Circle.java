public class Circle {
        public static void printpattern(int n){
            int i,j;
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if(i==2&&(j==1||j==3)){
                        System.out.print("0");
                    }else if((i==1)&&(j==2)){
                        System.out.print("0");
                    }else if(i==3&&j==2){
                        System.out.print("0");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        public static void main(String[] args){
            int n=5;
            printpattern(n);
        }
 
    }
    

