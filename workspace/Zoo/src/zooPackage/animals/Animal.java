package zooPackage.animals;

public abstract class Animal implements Maintainable {

	private String id;
	
	public abstract void eat();

	public void enjoy(){
		System.out.println(getClass().getName()+" is enjoying!");
	}

	public boolean setId(String id) {
		boolean setOK = false;
		if (id.length ()==0) {
		this.id = id;
		setOK=true;
		
		}
		return setOK;
	}

	public String getId() {
		return id;
	}
}
