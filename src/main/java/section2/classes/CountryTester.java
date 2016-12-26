/**
 * 
 */
package section2.classes;

/**
 * @author Kruti
 *
 */
public class CountryTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country<Capital> us = new Country<Capital>("USA", new Capital("Washington D.C"));
		System.out.println("us name:" + us.getName() + ",capital name: " +us.getCapitalName());

		Country<Capital> turkey = new Country<Capital>("Turkey", new Capital("Ankara"));
		System.out.println("turkey name:" + turkey.getName() + ",capital name: " +turkey.getCapitalName());


	}

}
