package normmonitorngaspects;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.ImageIcon;

import FirstCaseStudy.MonitorAgent;



import madkit.kernel.AbstractAgent;
import madkit.kernel.AbstractAgent.ReturnCode;
import madkit.kernel.KernelAddress;

public aspect SystemMonitor {
	int normID = 0; 
	

	//once the role was required by agent activator will get
	//approriate norm from norm base
	public static  Map<String, String> activatedRequestedRoleList = new ConcurrentHashMap<String, String>(); 
	static Map<String, String> leavedRoleList = new ConcurrentHashMap<String, String>(); 

	pointcut observeLeavingRole(String communityName, String groupName) : 
			 call(ReturnCode conference.main.PCMember.leaveGroup(String, String)) && args(communityName, groupName);  			
					
	after(String communityName, String groupName) returning(ReturnCode r): 
		observeLeavingRole(communityName, groupName) {
	
		AbstractAgent agAd = (AbstractAgent) thisJoinPoint.getTarget();
		leavedRoleList.put(agAd.getNetworkID(), groupName);
		
		
}	
	
	pointcut observeRequiredRole(String communityName, String groupName, String roleName, Object passKey) : 
			 call(ReturnCode *.requestRole(..)) && args(communityName, groupName, roleName, passKey);  			
	
	after (String communityName, String groupName, String roleName, Object passKey) returning (ReturnCode r): 
			observeRequiredRole(communityName, groupName, roleName, passKey) {
		
		Map<String, Boolean> t = new ConcurrentHashMap<String, Boolean>();	
		AbstractAgent agAd = (AbstractAgent) thisJoinPoint.getTarget();
		if (r.equals(ReturnCode.SUCCESS)) {
			if (! activatedRequestedRoleList.containsKey(agAd.getNetworkID())) {
				t.put(roleName, false);
				activatedRequestedRoleList.put(agAd.getNetworkID(), roleName);
				
				
				//NorCtrl4OMASGUI.lblNewLabel_4.setText(agAd.getNetworkID()+ ":" + roleName);
				//normID += 1;
				//NorCtrl4OMASGUI.tableModel.addRow(new Object[] {normID, pendingIcon, "", "", "CMS", agAd, roleName, pendingIcon, "Requested Role"});	
			}
			
			if (activatedRequestedRoleList.size()>0)
				MonitorAgent.isExisteNewRequestedRole = true; 
		}	
	}
}