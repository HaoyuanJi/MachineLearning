package cs475;
import java.util.*;
import java.io.*;

public class Majority_Predictor extends Predictor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3144447919321570937L;

	private int _majoritylabel;

	public void train(List<Instance> instances)
	{
          Map<String,Integer> countlist = new HashMap<String,Integer>();
          for(int i = 0; i< instances.size();i++)
          {
        	  String itemkey = instances.get(i).getLabel().toString();
        	  if(!countlist.containsKey(itemkey))
        		  countlist.put(itemkey, 1);
        	  else
        	  {
        		  int originalvalue = countlist.get(itemkey);
        		  countlist.put(itemkey, originalvalue + 1);
        	  }        		  
          }
          ArrayList<String> maxlabel = new ArrayList<String>();
          int maxcount = 0;
          for(Map.Entry<String, Integer> entry:countlist.entrySet())
          {
        	  if(entry.getValue() == maxcount)
        	  {
        		  maxlabel.add(entry.getKey());
        	  }
        	  else if(entry.getValue() > maxcount)
        	  {
        		  maxlabel = new ArrayList<String>();
        		  maxlabel.add(entry.getKey());
        		  maxcount = entry.getValue();
        	  }
          }
          Random random = new Random();
          _majoritylabel = Integer.parseInt(maxlabel.get(random.nextInt(maxlabel.size())));
	}
	
	public Label predict(Instance instance)
	{
		return new ClassificationLabel(_majoritylabel);
	}

}
