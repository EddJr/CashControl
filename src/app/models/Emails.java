/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package app.models;

import core.modelTypes.BelongsTo;

/**
 *
 * @author Macário Martins <macariomartinsjunior@gmail.com>
 *
 */
public class Emails extends BelongsTo {

	public Emails() {
		models = new String[] {"People"};
	}
	
}
