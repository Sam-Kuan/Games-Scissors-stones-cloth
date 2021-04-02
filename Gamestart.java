import java.util.Scanner;

public class Gamestart {
	public static int round=1;

	public static int attack(int p1,int p2) {
		//Draw=0, Player1_Win=1, Player2_Win=2
		if(p1==1){
            if (p2==1) return 0;
            else if (p2==2) {return 2;}
            else if (p2==3) {return 1;}
            else {return -1;}
		}
		else if(p1==2){
        	if (p2==1) {return 1;}
            else if (p2==2) {return 0;}
            else if (p2==3) {return 2;}
            else {return -1;}
		}
        else if(p1==3){
        	if (p2==1) {return 2;}
            else if (p2==2) {return 1;}
            else if (p2==3) {return 0;}
            else return -1;}
        else return -1;
	}
	
    public static void main(String[] args) {
    	Player Player1 = new Player();
    	Player Player2 = new Player();
    	System.out.println("Round " + round);
    	System.out.println("Please:(1=Scissors,2=Rock,3=Paper)");
        Scanner sc=new Scanner(System.in);
        int player=sc.nextInt();
        Scanner ex_state=new Scanner(System.in);
        int computer=(int)(Math.random()*3)+1;
        attack(player, computer);
        if(attack(player, computer)==0) {
        	System.out.println("Draw");
			System.out.println("Player HP: "+ Player1.getHP() +", Computer HP: " + Player2.getHP());
			System.out.println("");
			System.out.println("---------------------------------------------------");
        }
        else if(attack(player, computer)==1) {
        	System.out.println("Player Win");
        	System.out.println("Player attack Computer");
        	Player2.setHP(Player2.getHP()-1);
			System.out.println("Player HP: "+ Player1.getHP() +", Computer HP: " + Player2.getHP());
			System.out.println("");
			System.out.println("---------------------------------------------------");

        }
        else if(attack(player, computer)==2) {
        	System.out.println("Computer Win");
        	System.out.println("Computer attack Player");
        	Player1.setHP(Player1.getHP()-1);
        	System.out.println("Player HP: "+ Player1.getHP() +", Computer HP: " + Player2.getHP());
			System.out.println("");
			System.out.println("---------------------------------------------------");
        }
        round++;
        
        while (Player1.getHP()!=0&&Player2.getHP()!=0) {
        	System.out.println("Round " + round);
        	System.out.println("Please:(1=Scissors,2=Rock,3=Paper)");
        	player=sc.nextInt();
        	computer=(int)(Math.random()*3)+1;
            attack(player, computer);
            if(attack(player, computer)==0) {
            	System.out.println("Draw");
    			System.out.println("Player HP: "+ Player1.getHP() +", Computer HP: " + Player2.getHP());
    			System.out.println("");
    			System.out.println("---------------------------------------------------");
            }
            else if(attack(player, computer)==1) {
            	System.out.println("Player Win");
            	System.out.println("Player attack Computer");
            	Player2.setHP(Player2.getHP()-1);
    			System.out.println("Player HP: "+ Player1.getHP() +", Computer HP: " + Player2.getHP());
    			System.out.println("");
    			System.out.println("---------------------------------------------------");
            	
            }
            else if(attack(player, computer)==2) {
            	System.out.println("Computer Win");
            	System.out.println("Computer attack Player");
            	Player1.setHP(Player1.getHP()-1);
            	System.out.println("Player HP: "+ Player1.getHP() +", Computer HP: " + Player2.getHP());
    			System.out.println("");
    			System.out.println("---------------------------------------------------");
         
            }
            round++;
        }
        
        
        if (Player1.getHP()==0)System.out.println("Computer Win");
        if (Player2.getHP()==0)System.out.println("Player Win");
        
        sc.close();
        ex_state.close();
    }
}
