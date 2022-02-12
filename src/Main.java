import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static public void main(String[] argv) {
		Node[] nodes = new Node[50];
		
		for (int i=0;i<50;i++) {
			nodes[i] = new Node(i);
		}
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String cmd = sc.next();
			
			switch (cmd.charAt(0)) {
			case 'i':
				int x = sc.nextInt();
				int y = sc.nextInt();
				makeFriend(nodes,x,y);
				break;
			case 'd':
				x = sc.nextInt();
				y = sc.nextInt();
				breakFriend(nodes,x,y);
				break;
			case 'n':
				x = sc.nextInt();
				getNoOfFriends(nodes,x);
				break;
			case 'f':
				x = sc.nextInt();
				getNoOfFriends(nodes,x);
				break;
			case 's':
				x = sc.nextInt();
				y = sc.nextInt();
				getDistance(x,y);
				break;
			case 'q':
				return;
			default:
				return;
			}
		}
	}

	private static void getDistance(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	private static void getNoOfFriends(Node[] nodes, int x) {
		// TODO Auto-generated method stub
		
	}

	private static void breakFriend(Node[] nodes, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	private static void makeFriend(Node[] nodes, int x, int y) {
		// TODO Auto-generated method stub
		
	}
}

class Node {
	int id;
	List<Node> neighbours = new ArrayList<>();
	
	public Node(int id) {
		this.id = id;
	}
}


