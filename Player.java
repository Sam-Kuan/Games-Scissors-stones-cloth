
public class Player {
	private int HP;
	private int attach;
	private int defense;
	private int EX_level;
	private int ex;
	
	public Player() {
		this.HP=3;
		this.attach=1;
		this.defense=0;
		this.EX_level=0;
		this.ex=0;
	}
	
	//--------------HP----------------
	public void setHP(int h){
		this.HP= h;
	}
		public int getHP(){
		return this.HP;
	}
	
	//------------attack----------------
	public void setattack(int a){
		this.attach= a;
	}
	public int getattach(){
		return this.attach;
	}
	
	//------------defense----------------
	public void setdefense(int d){
		this.defense= d;
	}
	public int getdefense(){
		return this.defense;
	}
	
	//------------EX_level----------------
	public void setEX(int e){
		this.EX_level= e;
	}
	public int getEX(){
		return this.EX_level;
	}
	
	//--------------ex----------------
		public void setex(int h){
			this.ex= h;
	}
			public int getex(){
			return this.ex;
	}
	
}
