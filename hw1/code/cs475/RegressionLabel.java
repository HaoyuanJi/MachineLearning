package cs475;

import java.io.Serializable;

public class RegressionLabel extends Label implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -235378825456953329L;
	double _label;
	public RegressionLabel(double label) {
		// TODO Auto-generated constructor stub
		_label = label;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(_label);
	}

}
