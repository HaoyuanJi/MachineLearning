package cs475;

import java.util.*;

public class Odd_Even_Predictor extends Predictor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1744805525711540931L;
	
	@Override
	public void train(List<Instance> instances) {
		// TODO Auto-generated method stub
        // Don't need to do this
	}

	@Override
	public Label predict(Instance instance) {
		// TODO Auto-generated method stub
		double odd_sum = 0.0;
		double even_sum = 0.0;
		
		FeatureVector checklist = instance.getFeatureVector();
		
		// get the iterator of featurevector
        Iterator<Map.Entry<Integer, Double>> iterator = checklist.getiterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, Double> item = iterator.next();
			if(item.getKey() % 2 == 0)
				even_sum += item.getValue();
			else
				odd_sum += item.getValue();
		}
		
		if(even_sum >= odd_sum)
		   return new ClassificationLabel(1);
		else
			return new ClassificationLabel(0);
	}

}
