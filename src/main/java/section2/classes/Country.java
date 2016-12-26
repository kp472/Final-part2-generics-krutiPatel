/**
 * 
 */
package section2.classes;

import section2.interfaces.HasCapital;

import section2.interfaces.HasName;

/**
 * @author Kruti
 *
 */
public class Country<C extends Capital> implements HasName, HasCapital<C> {
	
	private String name;
	private C capital;
	public Country (String _name, C _capital){
		_name = name;
		_capital = capital;
	}
	
	public C getCapital() {
		return capital;
	}
	
	public String getCapitalName() {
		return capital.getName();
	}
	
	public String getName() {
		return name;
	}
}