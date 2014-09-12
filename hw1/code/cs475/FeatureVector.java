package cs475;
import java.util.*;

import java.io.Serializable;

public class FeatureVector implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1861797267377856357L;
	private Map<Integer, Double> _featurevector = new HashMap<Integer,Double>();

	public void add(int index, double value) {
		// TODO Auto-generated method stub
		_featurevector.put(index, value);
		
	}
	
	public double get(int index) {
		// TODO Auto-generated method stub
		return _featurevector.get(index);
	}
	
	public int getsize()
	{
		return _featurevector.size();
	}
	
	public Iterator<Map.Entry<Integer,Double>> getiterator()
	{
		return _featurevector.entrySet().iterator();
		
	}
}
