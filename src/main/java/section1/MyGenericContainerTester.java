/**
 * 
 */
package section1;

/**
 * @author Kruti
 *
 */
	public class MyGenericContainerTester{
		/**
		 * 
		 */
	public static void main( String[] args){
		MyGenericContainerCalss<String> c4String = new MyGenericContainerCalss<String>();
		
		MyGenericContainerCalss<Integer> c4Integer= new MyGenericContainerCalss<Integer>();
		
		 System.out.println( "String Container contains:"+ c4String.getContained());
		 System.out.println( "Integer Container contains:"+ c4Integer.getContained());
		 
	}
		
		}

