/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zweitehuefschaur18;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fschaur18
 */
public class HalloJavamitForEach {
    
    List<String> list = new ArrayList<String>();
    
    
   public void foreach()
   {
       for (String string : list) {
           System.out.println(string);
       }
       list.forEach((String s) -> System.out.println(s));
       
       
   }
   
}
