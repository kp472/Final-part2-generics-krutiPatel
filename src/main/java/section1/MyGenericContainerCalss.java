/**
 * 
 */
package section1;

/**
 * @author Kruti
 * @param <T>
 *
 */
public class MyGenericContainerCalss<T> implements MyGenericContainerInterFace<T>{

	/**
	 * 
	 */
	
	private T contained; 
	
	public void MyGenericContainerClass(T _contained){ 
		contained = _contained;
	}
	public T getContained() {
		return contained;
	}
	
}
