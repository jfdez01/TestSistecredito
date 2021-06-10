package com.co.cinte.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ListOfFavoritesUI {

	//CREATE
	public static final Target TXT_ACCESSORIE= Target.the("TXT_ACCESSORIE").located(By.xpath("//*[@id=\"main-CardGroup-bbdca08f-5637-488a-8f32-40d6d7654fe7-card-3\"]/div/div[2]"));
	public static final Target BTN_WATCH= Target.the("BTN_WATCH").located(By.id("testId-pod-displaySubTitle-9164266"));
	public static final Target BTN_ADD_BAG= Target.the("BTN_ADD_BAG").located(By.xpath("//*[@id=\"testId-Pod-action-9164266\"]/div/div"));
	public static final Target BTN_VIEW_BAG= Target.the("BTN_VIEW_BAG").located(By.id("linkButton"));
	
	//VERIFY
	public static final Target BTN_ICON= Target.the("BTN_ICON").located(By.xpath("//*[@id=\"header\"]/nav/div[1]/div/div[1]/a[1]/i"));
	public static final Target BTN_BAG= Target.the("BTN_BAG").located(By.xpath("//*[@id=\"testId-UserAction-basket\"]/div/a/i"));
	public static final Target BTN_DELETE= Target.the("BTN_BAG").located(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/section/form/div/div[2]/div[3]/div[1]"));
	

}
