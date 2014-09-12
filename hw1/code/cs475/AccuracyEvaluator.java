package cs475;

import java.util.List;

public class AccuracyEvaluator extends Evaluator{

	@Override
	public double evaluate(List<Instance> instances, Predictor predictor) {
		long countcorrect = 0;
		long nolabel = 0;
		for(Instance item:instances)
		{
			Label predictlabel = predictor.predict(item);
			if(item.getLabel().toString().equals("-1"))
				nolabel ++;
			if(!item.getLabel().toString().equals("-1") && predictlabel.toString().equals(item.getLabel().toString()))
				countcorrect++;
		}
		if(nolabel == instances.size())
			return -1.0;
		return (double) countcorrect / instances.size();
	}
	

}
