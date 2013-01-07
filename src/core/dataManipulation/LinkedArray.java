/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package core.dataManipulation;

import java.util.ArrayList;
/**
 *
 * @author Macário Martins <macariomartinsjunior@gmail.com>
 *
 */
public class LinkedArray {
	
	private ArrayList keys = new ArrayList();
	private ArrayList values = new ArrayList();
	
	public int size() {
		return keys.size();
	}
	
	public boolean isEmpty() {
		return values.isEmpty();
	}
	
	public void merge(LinkedArray linkedArray) {
		for (int i = 0; i < linkedArray.size(); i++)
			this.add(linkedArray.getKeyByIndex(i), linkedArray.getValueByIndex(i));
	}
	
	public void add(Object key, Object value) {
		if ( ! keys.contains(key)) {
			keys.add(key);
			values.add(value);
		}
		else {
			int index = keys.indexOf(key);
			values.remove(index);
			values.add(index, value);
		}
	}
	
	public void put(Object value) {
		boolean added = false;
		
		for (int i = 0; i < this.size(); i++)
			if ( ! this.containsKey(i)) {
				this.add(i, value);
				added = true;
				break;
			}
		
		if ( ! added)
			this.add(this.size(), value);
	}
	
	public void remove(Object key) {
		removeByKey(key);
	}
	
	public void removeByIndex(int index) {
		keys.remove(index);
		values.remove(index);
	}
	
	public void removeByKey(Object key) {
		removeByIndex(keys.indexOf(key));
	}
	
	public void removeByValue(Object value) {
		removeByIndex(values.indexOf(value));
	}
	
	public Object get(Object key) {
		return getValueByKey(key);
	}
		
	public Object getKeyByIndex(int index) {
		return keys.get(index);
	}
	
	public Object getValueByIndex(int index) {
		return values.get(index);
	}
	
	public Object getKeyByValue(Object value) {
		return getKeyByIndex(values.indexOf(value));
	}
	
	public Object getValueByKey(Object key) {
		return getValueByIndex(keys.indexOf(key));
	}
	
	public ArrayList getKeysArray() {
		return keys;
	}
	
	public ArrayList getValuesArray() {
		return values;
	}
	
	public Object extract(Object key) {
		Object section = this.get(key);
		this.remove(key);
		
		return section;
	}
	
	public boolean containsKey(Object key) {
		return keys.contains(key);
	}
	
	public boolean containsValue(Object value) {
		return values.contains(value);
	}
	
	public void reset() {
		keys	= new ArrayList();
		values	= new ArrayList();
	}
	
}
