/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zweitehuefschaur18;

/**
 *
 * @author fschaur18
 */
public class NumberTester {
    public interface NumberTest{ boolean testNumber(int number); }
    
    public static void main(String[] args) {
        
    }
        public NumberTester(String fileName){}
        
        public void setOddEvenTester(NumberTest oddTester){};
        public void setPrimeTester(NumberTest primeTester){};
        public void setPalindromeTester(NumberTest palindromeTester){};
        
        public void testFile() {};
        
}
