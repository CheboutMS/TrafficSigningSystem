package demxième_ètude_de_cas;

import java.util.logging.Level;

import madkit.kernel.Agent;
import madkit.kernel.Madkit;
import madkit.message.ObjectMessage;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Rule;
import premier_étude_de_cas.Enforcement;
import premier_étude_de_cas.Monitoring;

public class Enforcemont1 extends Agent {
	protected void activate() {
		//getLogger().setLevel(Level.FINEST);
		createGroup("community", "road");
        requestRole("community","road","reinforcement");
		
        pause(500);
	}
	protected void live() {
		pause(100);
		  ObjectMessage<String> m =(ObjectMessage<String>)waitNextMessage(100);
		 if(m !=null){
			 System.out.println(" ");

		              
		  
		  } }
	public static double[] function(int[] tab) {
		
		String filename = "text.fcl";
		
		FIS fis = FIS.load(filename, true);
	   
		
		
		if (fis == null) { 
			System.err.println("Can't load file: '" + filename + "'");
			System.exit(1);
			
		}
            FunctionBlock fb = fis.getFunctionBlock(null);
JFuzzyChart.get().chart(fis);

// Set inputs
fb.setVariable("speed", tab[0]);
//fr.setVariable("accident", tab[1]);
fb.setVariable("rainny", tab[1]);


fb.evaluate();
fb.getVariable("punishement").defuzzify();
fb.getVariable("reward").defuzzify();

//System.out.println("agent red =");
//System.out.println("punishement: " + fr.getVariable("punishement").getValue());
   double p=fb.getVariable("punishement").getValue();
  double r=fb.getVariable("reward").getValue();
 
	    // System.out.println("punishement: " + p);
  
	  
       //  System.out.println("reward: " + r);
    JFuzzyChart.get().chart(fb.getVariable("punishement"),fb.getVariable("punishement").getDefuzzifier(),true);
    JFuzzyChart.get().chart(fb.getVariable("reward"),fb.getVariable("reward").getDefuzzifier(),true);
    for( Rule r1 : fis.getFunctionBlock("text").getFuzzyRuleBlock("No1").getRules() )
        System.out.println(r1);
    double[] tab1= {p,r};
	return tab1;
}
	public static void main(String[] args) {
		new Madkit("--launchAgents", Enforcemont1 .class.getName() + ",false,1;", Monitoring1 .class.getName()+ ",false,1;");
	//	int t[]= {49,7};
	//	 function(t);

	}
}


