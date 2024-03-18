package demxième_ètude_de_cas;

import java.util.logging.Level;

import madkit.kernel.Agent;
import madkit.kernel.AgentAddress;
import madkit.message.ObjectMessage;

public class Monitoring1  extends Agent{
	 public static int vites ;
    // public static int temp_fou ;
     public static int degre_catastrophique ;
     public static  int taux_de_precipitation ;
      
    public static int[] informationR(int v,int t) {
  	   
	    vites=v ;
	 //  degre_catastrophique= 80;
	   taux_de_precipitation=t;
	 //  desciption= "jj";
	  
	  int d[]= {vites, taux_de_precipitation};
	return d;
   }
  
	

	protected void activate() {
		
		createGroup("community", "road");
        requestRole("community","road","moniteur");
		
        
	}
	protected void live() {
		pause(100);
		 AgentAddress other = null;
	       // Until we have an agent (in the group GroupTest in the community communication) having the role RoleTest2.
	       while (other == null) {
	           // Getting the address of an agent being in the community "communication" and the group "GroupTest", and having the role
	           // "RoleTest2".
	           other = getAgentWithRole("community","road","reinforcement");

	           // Trying to get another agent (Agent3).
	           if (other == null) {
	              other = getAgentWithRole("community","road","reinforcement");
	           }
	          
	       }
	      

	       sendMessage(other, new ObjectMessage<String>("desciption"));// Sending the message to the agent we found.
	       

			
			
		
	}
		
	 
public static void main(String[] args) {
	//executeThisAgent(1, false);
	// new Madkit("--launchAgents", Reinforcement .class.getName() + ",false,1;", Monitoring .class.getName()+ ",false,1;");
	
}

}
