/**
 * 
 */
package section2.classes;

import section2.interfaces.HasCapital;
import section2.interfaces.HasGoverner;
import section2.interfaces.HasName;

/**
 * @author Kruti
 *
 */
public class State<C extends Capital, G extends Governor> implements HasCapital<C>, HasGoverner<G>, HasName {

	private String name;
	private C capital;
	private G governor;
	
	
	public State(String string, Capital capital2, Governor governor2) {
		// TODO Auto-generated constructor stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	public G getGovernor() {
		// TODO Auto-generated method stub
		return governor;
	}


	public String getGovernorName() {
		// TODO Auto-generated method stub
		return governor.getName();
	}


	public C getCapital() {
		// TODO Auto-generated method stub
		return capital;
	}


	public String getCapitalName() {
		// TODO Auto-generated method stub
		return capital.getName();
	}
}

