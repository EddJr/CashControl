/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

import core.modelTypes.BelongsTo;

/**
 *
 * @author Eduardo Jr
 */
public class Phones extends BelongsTo{
        	
        public Phones() {
		models = new String[] {"People"};
	}
}
