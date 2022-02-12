import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
				System.out.println(getNoOfFriendsOfFriends(nodes,x));
				break;
			case 's':
				x = sc.nextInt();
				y = sc.nextInt();
				int distance = getDistance(nodes, x,y);
				System.out.println(distance==-1?"not connected":distance );
				break;
			case 'q':
				return;
			default:
				return;
			}
		}
	}

	private static int getNoOfFriendsOfFriends(Node[] nodes, int x) {
		// TODO Auto-generated method stub
		int count = 0;
		for (Node neighbour: nodes[x].neighbours) {
			for (Node level2Neighbour: neighbour.neighbours) {
				if (level2Neighbour != nodes[x] && !nodes[x].neighbours.contains(level2Neighbour)) {
					count++;
				}
			}
		}
		return count;
	}

	private static int getDistance(Node[] nodes, int x, int y) {
		// TODO Auto-generated method stub
		int distance = 0;
		Set<Node> visited = new HashSet<>();
		Set<Node> current = new HashSet<>();
		current.add(nodes[x]);
		Set<Node> next = new HashSet<>();
		
		while (!current.isEmpty()) {
			for (Node node: current) {
				if (node == nodes[y])
					return distance;
				visited.add(node);
				next.addAll(node.neighbours);
			}
			next.removeAll(visited);
			distance++;
			current = next;
			next = new HashSet<>();
		}
		return -1;
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


