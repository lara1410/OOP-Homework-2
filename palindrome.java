public class Main {
  public static void main(String[] args) {
  }
  public boolean palindrome(int a[]){
    int length = a.length;
      for(int index = 0; index < length; index++){
        int start = a[index];
        int end = a[--length];
          if(length < index){
            return true;
          }
          if(start !=  end){
            return false;
          }
      }
            return true;
      }

  }
