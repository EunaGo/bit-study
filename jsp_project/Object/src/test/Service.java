package test;

public class Service {
	
	//Service 클래스는 Dao클래스에 의존한다.
	//Dao dao = new Dao();
	
	MemberDao dao;
	
	public void  setDao(MemberDao dao) {
		this.dao = dao;
	}
	
	public void print() {
		dao.print();
	}
	
	
}
