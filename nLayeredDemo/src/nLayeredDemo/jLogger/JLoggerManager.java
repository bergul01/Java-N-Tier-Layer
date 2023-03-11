package nLayeredDemo.jLogger;

public class JLoggerManager {
/*bu yapılan kısım dışarıdan birisinin yazmış olduğu servisi örnek olarak mikroservisi bizim projemizin içine dahil etmek
 * örnek olarak burada kodları biz yazıcaz simüle edicez ama bu kod normalde dışardan hazır olarak alınıp sisteme eklenicek */
	public void log(String massage) {
		System.out.println("J Logger ile loglandi. " + massage);
	}
}
