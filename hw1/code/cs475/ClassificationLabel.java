package cs475;

import java.io.Serializable;

public class ClassificationLabel extends Label implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4573461616240824565L;
	private int _label;

	public ClassificationLabel(int label) {
		// TODO Auto-generated constructor stub
		_label = label;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(_label);
	}

}
