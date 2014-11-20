package testIOC;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class bean {
	private int uid;
	private String name;
	private String[] steam;
	private List<String> slist;
	private Set<String> sset;
	private Map<String,String> smap;
	private bean friend;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getSteam() {
		return steam;
	}
	public void setSteam(String[] steam) {
		this.steam = steam;
	}
	public List<String> getSlist() {
		return slist;
	}
	public void setSlist(List<String> slist) {
		this.slist = slist;
	}
	public Set<String> getSset() {
		return sset;
	}
	public void setSset(Set<String> sset) {
		this.sset = sset;
	}
	public Map<String, String> getSmap() {
		return smap;
	}
	public void setSmap(Map<String, String> smap) {
		this.smap = smap;
	}
	public bean getFriend() {
		return friend;
	}
	public void setFriend(bean friend) {
		this.friend = friend;
	}
	
	
}
