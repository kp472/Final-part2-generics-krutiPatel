/**
 * 
 */
package section2.classes;

/**
 * @author Kruti
 *
 */
public class StateTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State<Capital, Governor> nj = new State<Capital, Governor>("NJ", new Capital("Trenton"), new Governor("Chris Cristie"));
	    System.out.println("nj name:" +nj.getName() + ", capital name" + nj.getCapitalName() + ",governor name" + nj.getGovernorName());


	}

}
