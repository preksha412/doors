package USER.com.cox.dti.dao;

import java.util.Arrays;

public class anindyaTest {

	public static void main(String[] args) {
		int doors[]=new int[101];
		Arrays.fill(doors, 0); 
	
		for (int i = 1; i <= 100; i++) {
		      for (int j = i; j <= 100; j++) {
		        if(j % i == 0) {
		        	if(doors[j] == 0) {
		        		doors[j] = 1;
					} else {
						doors[j] = 0;
					}
		        }
		      }
		    }
		
		for (int i = 1; i <= 100; i++) {
			System.out.print("Door " + i + " is ");
		      if (doorOpen(doors[i])) {
		        System.out.println("opened");
		      } else {
		        System.out.println("closed");
		      };
		}
	}

	public static boolean doorOpen(Integer a){
		if(a==1) {
			return true;
		} else {
			return false;
		}
	}
}

