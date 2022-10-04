
public class Main {

	
	public Main() {
		Player player = new Player();
		player.setName("John");
		
		PlayerDAO playerDao = new PlayerDAO();
		playerDao.persistPlayer(player);
		
		System.out.println(player.getName());
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
