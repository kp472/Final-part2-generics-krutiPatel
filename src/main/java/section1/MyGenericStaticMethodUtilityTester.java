/**
 * 
 */
package section1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kruti
 *
 */
public class MyGenericStaticMethodUtilityTester {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "element_1";
		List<String> strings = new ArrayList<String>();
		strings.add(s1);
		String s = s1;

		Integer i1 = 1234;
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(i1);
		Integer i =i1;
		
		
		System.out.println("added String "+ s +",now strings.size:"+strings.size());
		System.out.println("added Integer " +i+ ",now integer.size:" +integers.size());
		
	

	}

}
