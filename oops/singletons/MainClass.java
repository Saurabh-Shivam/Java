package oops.singletons;

public class MainClass {

	public static void main(String[] args) {

        AppConfig obj = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();
        AppConfig obj3 = AppConfig.getInstance();
	}

}
