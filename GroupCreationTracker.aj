package normmonitorngaspects;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import madkit.kernel.Gatekeeper;

public aspect GroupCreationTracker {
	
	int groupID = 0;
	public static Map<Integer, String> createdGroupList = new ConcurrentHashMap<Integer, String>();
	
	pointcut observeCreatedGroups(String communityName, String groupName, boolean isDistributed, Gatekeeper keyMaster) : 
			call(boolean *.createGroupIfAbsent(..)) && 
			args(communityName, groupName, isDistributed, keyMaster);  			

	after (String communityName, String groupName, boolean isDistributed, Gatekeeper keyMaster) returning (boolean r): 
		observeCreatedGroups(communityName, groupName, isDistributed, keyMaster) {
		if (r == true) {
			createdGroupList.put(groupID, groupName);
			groupID++;
		}
	}
}


/*for (Map.Entry<Integer, String> entry : this.createdGroupList.entrySet())
System.out.println(get);*/