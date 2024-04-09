package normmonitorngaspects;

import controllerGui.NorCtrl4OMASGUI;
import madkit.kernel.Madkit;

public aspect LaunchingControlledApplication {
		
		pointcut lunchingMainMethod() : call(* Madkit.main(..)) ||
		call( Madkit.new(..)) ||
		call(* executeThisAgent(..));

		before () : lunchingMainMethod() {
			NorCtrl4OMASGUI.CFPtime = System.currentTimeMillis();
			NorCtrl4OMASGUI.main(null);
			// launching NorCtrl4OMAS agents
			//NorCtrl4OMASAgentsLauncher.launcheNorCtrl4OMAS();
			
		}
}
