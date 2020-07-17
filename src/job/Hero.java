package job;
/**
 * 勇者クラス
 * このクラスは勇者を表すクラスです
 * @author tatsuya
 * @version 1.1
 */
public class Hero {
	/**
	 * 勇者の名前
	 */
	private String name;
	/**
	 *  勇者のHP
	 */
	private int hp;
	/**
	 * 勇者のMP
	 */
	private int mp;
	/**
	 *  引数に名前を渡すためのコンストラクタ
	 *  @param name 勇者につけたい名前を渡してください
	 */
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 50;
	}
	/**
	 *  引数のないコンストラクタ
	 */
	public Hero() {
		this("名無し");
	}

	public String getName() {
		return this.name;
	}

	public void attack() {
		System.out.println(this.name +"は攻撃をした");
	}
}
