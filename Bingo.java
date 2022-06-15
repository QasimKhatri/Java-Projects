import java.util.Random;
import java.util.Scanner;




public class Bingo{
    private static final int[][] player1=new int[5][5];
    private static final int[][] player2=new int[5][5];
    
    public static void makeCards(int[] numbers,int[] numbers1){
        int count=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==2 && j==2){
                    player1[i][j]=0;
                    player2[i][j]=0;
                }
                else{
                    player1[i][j]=numbers[count];
                    player2[i][j]=numbers[count];
                    count++;
                }
            }
        }
    }


    
    public static boolean isPresent(int[] numbers,int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean cornerCheck(int[][] mat){
        if(mat[0][0] == 0 && mat[4][4] == 0 && mat[0][4] == 0 && mat[4][0] == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean diagonalCheck(int[][] mat){
       if(mat[0][0] == 0 && mat[1][1] == 0 && mat[3][3] == 0 && mat[4][4] == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
   public static boolean rowCheck(int[][] mat){
       if(mat[0][0] == 0 && mat[0][1] == 0 && mat[0][2] == 0 && mat[0][3] == 0 && mat[0][4]==0){
            return true;
        }
       else if(mat[1][0] == 0 && mat[1][1] == 0 && mat[1][2] == 0 && mat[1][3] == 0 && mat[1][4]==0){
            return true;
        }
       else if(mat[2][0] == 0 && mat[2][1] == 0 && mat[2][2] == 0 && mat[2][3] == 0 && mat[2][4]==0){
            return true;
        }
       else if(mat[3][0] == 0 && mat[3][1] == 0 && mat[3][2] == 0 && mat[3][3] == 0 && mat[3][4]==0){
            return true;
        }
       else if(mat[4][0] == 0 && mat[4][1] == 0 && mat[4][2] == 0 && mat[4][3] == 0 && mat[4][4]==0){
            return true;
        }
        else{
            return false;
        }
    }
   
      public static boolean columnCheck(int[][] mat){
       if(mat[0][0] == 0 && mat[1][0] == 0 && mat[2][0] == 0 && mat[3][0] == 0 && mat[4][0]==0){
            return true;
        }
       else if(mat[0][1] == 0 && mat[1][1] == 0 && mat[2][1] == 0 && mat[3][1] == 0 && mat[4][1]==0){
            return true;
        }
       else if(mat[0][2] == 0 && mat[1][2] == 0 && mat[2][2] == 0 && mat[3][2] == 0 && mat[4][2]==0){
            return true;
        }
       else if(mat[0][3] == 0 && mat[1][2] == 0 && mat[2][3] == 0 && mat[3][3] == 0 && mat[4][3]==0){
            return true;
        }
       else if(mat[0][4] == 0 && mat[1][4] == 0 && mat[2][4] == 0 && mat[3][4] == 0 && mat[4][4]==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean winningConditions(){
        //Check for TIE
        if(cornerCheck(player1) && cornerCheck(player2)){ System.out.println("\nBOTH ARE WINNERS!\n");return true;}
        else if(diagonalCheck(player1) && diagonalCheck(player2)){System.out.println("\nBOTH ARE WINNERS!\n");return true;}
        else if(rowCheck(player1) && rowCheck(player2)){System.out.println("\nBOTH ARE WINNERS!\n");return true;}
        else if(columnCheck(player1) && columnCheck(player2)){System.out.println("\nBOTH ARE WINNERS!\n");return true;}
        
        //Check for Player 01
        if(cornerCheck(player1)){ System.out.println("\nPLAYER 01 IS WINNERS!\n");return true;}
        else if(diagonalCheck(player1)){System.out.println("\nPLAYER 01 IS WINNERS!\n");return true;}
        else if(rowCheck(player1)){System.out.println("\nPLAYER 01 IS WINNERS!\n");return true;}
        else if(columnCheck(player1)){System.out.println("\nPLAYER 01 IS WINNERS!\n");return true;}
        
        //Check for Player 02
        if(cornerCheck(player2)){ System.out.println("\nPLAYER 02 IS WINNERS!\n");return true;}
        else if(diagonalCheck(player2)){System.out.println("\nPLAYER 02 IS WINNERS!\n");return true;}
        else if(rowCheck(player2)){System.out.println("\nPLAYER 02 IS WINNERS!\n");return true;}
        else if(columnCheck(player2)){System.out.println("\nPLAYER 02 IS WINNERS!\n");return true;}
        
        else{return false;}
    }
    
    public static void replaceNumber(int num){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(player1[i][j]==num){
                    player1[i][j]=0;
                }
                
                if(player2[i][j]==num){
                    player2[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] numbers=new int[24];
        int[] numbers1=new int[24];
        Scanner sc=new Scanner(System.in);
        int number=0;
        
        for(int i=0;i<24;i++){
            System.out.print("Player One Enter Your Number "+(i+1)+" between 10 and 40: ");
            number=Integer.parseInt(sc.nextLine());     
            if(number<10 || number>40){
                System.out.println("Invalid Number");
                i--;


            }
            else if(isPresent(numbers,number)){
                System.out.println("Number is alredy Present Try new number!");
                i--;
            } 
            
            else{
                numbers[i]=number;
            }
            
        }
        
        System.out.println("======================================================");
        for(int i=0;i<24;i++){
           System.out.print("Player Two Enter Your Number "+(i+1)+" between 10 and 40: ");
             number=Integer.parseInt(sc.nextLine());     
            if(number<10 || number>40){
                System.out.println("Invalid Number");
                i--;


            }
            else if(isPresent(numbers1,number)){
                System.out.println("Number is alredy Present Try new number!");
                i--;
            } 
            
            else{
                numbers1[i]=number;
            }
        }
        
        makeCards(numbers,numbers1);
        System.out.println("Player 01 Card");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(player1[i][j]+" | ");
            }
            
            System.out.println("\n--------------------\n")