/**
 * 
 */
package section2.interfaces;

import section2.classes.Governor;

/**
 * @author Kruti
 *
 */
public interface HasGoverner <T extends Governor> {
	public T getGovernor();
	public String getGovernorName();

}
