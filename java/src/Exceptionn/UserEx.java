package Exceptionn;

public class UserEx {

	public static void main(String[] args) {

		  int a,b;
          a=10;
          b=5;
          try
          {
        	  if(b==0)
        		  throw new UserException();
              else  
            	  System.out.println("Q="+a/b);
          }
          catch(Exception e)
          {}
	}

}
