package testAOPAnn;
//testAOPAnn.hellobean
public class hellobean implements inter {
	
	private String what ;
	
	
	@Override
	public void saywhat(String sql,String name) {
		// TODO Auto-generated method stub
		if(!this.what.equals("")){
			System.out.println("你好 "+this.what);
		}else{
			System.out.println("asdf");
		}
	}


	public String getWhat() {
		return what;
	}


	public void setWhat(String what) {
		this.what = what;
	}

}
