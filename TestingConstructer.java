/*
 * 
 */

package Testing;

public class TestingConstructer {
    int para;

    public TestingConstructer() {
        para = 5;  
    }
    
    public static void main(String[] args) {
        TestingConstructer myObj = new TestingConstructer(); 
        System.out.println(myObj.para);
    }
}

