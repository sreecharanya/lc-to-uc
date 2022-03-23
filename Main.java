
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    String s="";
    String j="";
    int i;
    int num;
    
     Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter the string");
    String userName= myObj.nextLine(); 
    char c;
    char arr[]=userName.toCharArray();
    
  for(i=0;i<arr.length;i++){  
     num = (int) arr[i];
  // System.out.println("num value "+arr[i]+" is "+num);
   if(num>=97 && num<=122){
     
        arr[i]=(char)((int) arr[i]-32); 
        }else if(num>=65 && num<=90){
       arr[i]=(char)((int) arr[i]+32); 
      }else if(num>=48 && num<=57){
     arr[i]=(char) '#';
      }else if(num == 32){
     arr[i] = (char) '*';
      }else if((num>=33 && num<=47)|| (num>=58 && num<=64)||(num>=91 && num<=96) || (num>=123 && num<=126)){
     arr[i] = (char) '?';
      }
    }
     
 for(i=0;i<arr.length;i++){
  s=Character.toString(arr[i]);
   j+=s;
}     
        System.out.println("The modified string is: "+j);
 }
    
  }
