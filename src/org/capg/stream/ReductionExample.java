package org.capg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dibyanand
 */
public class ReductionExample {

    public static void main(String... args) {
    	
    	 List<Integer> list = Arrays.asList(10,20,30);
         
         Integer red = 
         list.stream()
                 .reduce(0,Integer::sum); 
         
         System.out.println("red = " + red);

        System.out.println(" max reductions========================");
        
        List<Integer> list2 = Arrays.asList(-10,-10);
        Optional<Integer> red2 = 
        list2.stream()
                .reduce(Integer::max);
        
        System.out.println("red 2 = " + red2);
        
        System.out.println(" Optional empty =======================");
        List<Integer> list3 = Arrays.asList();
        Optional<Integer> red3 = 
        list3.stream()
                .reduce(Integer::max);
        
        System.out.println("red 3 = " + red3);
        
    }
}
