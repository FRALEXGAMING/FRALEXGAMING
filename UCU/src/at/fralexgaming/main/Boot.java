package at.fralexgaming.main;

import at.fralexgaming.boot.Init;
import at.fralexgaming.boot.PostInit;
import at.fralexgaming.boot.PreInit;

public class Boot {

	public static void preInit(){
		System.out.println("preInit is starting");
		PreInit preInit = new PreInit();
		preInit.main();
		System.out.println("preInit is finished");
	}
	public static void Init(){
		System.out.println("Init is starting");
		Init init = new Init();
		init.main();
		System.out.println("Init is finished");
	}
	public static void postInit(){
		System.out.println("postInit is starting");
		PostInit postInit = new PostInit();
		postInit.main();
		System.out.println("postInit is finished");
	}
}
