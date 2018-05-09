//given two sorted and distinct arrays
//find # of and lists common elements

import java.util.*;

public class CommonElements {

    public static void main(String[] args) {
    	
    	int[] A1 = {1,5,15,20,30,37};
    	int[] A2 = {2,5,23,30,32,35,37,42};
    	
    	CommonElements test = new CommonElements();
    	List<Integer> list = test.listOfCommonElements(A1, A2);
    	int numberOfCommonElements = list.size();
    	
    	System.out.printf("Number of common elements: %d\n", numberOfCommonElements);
    	System.out.print("Common elements: ");
    	for (Integer i: list) {
    		System.out.print(i + " ");
    	}
    }
    
    public List<Integer> listOfCommonElements(int[] A1, int[] A2){
    	
    	List<Integer> commonElements = new ArrayList<Integer>();
    	
    	//for each element in A1 and A2, compare them
    	//if equal, add to commonElements and ++ indexes
    	//then increment index for whichever value is smaller

    	for (int i = 0, j = 0; i < A1.length && j < A2.length;){
    		if (A1[i] == A2[j]) {
    			if (!commonElements.contains(A1[i])){ //only necessary if not distinct arrays
    				commonElements.add(A1[i]);
    			}
    			i++;
    			j++;
    		} else if (A1[i] < A2[j])
    			i++;
    		  else j++;
    	}
    	
    	return commonElements;
    }
}
