package job;
// @SuppressWarningsアノテーションを使うと、あるクラス、メソッド、フィールドなどに対して、一定の種類の警告を行わないよう指示する
// 指定可能なパラメータは
// all: 全ての警告
// serial: serialVersionUIDの宣言なし
// cast: 不要なキャスト
// unchecked: 代入チェックがないキャスト などがある
@SuppressWarnings("serial")
public class SuperHero extends Hero {
	// メソッド宣言の前に@Overrideアノテーションを記述すると
	// そのメソッドが明示的に親クラスの同名メソッドをオーバーライドすることを宣言できる
	// @Overrideアノテーションつけることで問題が起きたときにコンパイラが警告を出してくれるため
	// オーバーライドしたつもりが、実はできていない場合などに、それに気づくことができる
	@Override
	public void attack() {
		super.attack();
		super.attack();
		System.out.println(this.getName() +"は2回攻撃した");
	}

	// @Deprecatedは非推奨だということを宣言している
	// クラス、フィールド、メソッドなどの宣言の先頭に@Deprecatedアノテーションをつけると
	// それが非推奨であることをコンパイラに伝えることができる
	// 例えば、あるクラスに手を加えて、より良いクラスにした結果、古いクラスを使って欲しくない時などに使う
}
