package normmonitorngaspects;


import madkit.kernel.Agent;
import madkit.kernel.Madkit;
import madkit.kernel.Madkit.LevelOption;
import madkit.kernel.Madkit.Option;

public class SystemAgentLauncher extends Agent {

	protected void activate() {

	};
	
	@Override
	protected void live() {
		pause(Integer.MAX_VALUE);
	}
	
	public static void launcheNorCtrl4OMAS() {
		
		String[] argss = {LevelOption.agentLogLevel.toString(), "INFO",
				Option.launchAgents.toString(),
				SystemAgentLauncher.class.getName()+",false,1;"+
				NormManager.class.getName()+",false,1;"+
				//Activator.class.getName()+",false,1;"+
				Instantiator.class.getName()+",false, 1;"+
				Enforcer.class.getName()+",false,1;"
				
				};
		// Madkit.main(argss);
	}
}
