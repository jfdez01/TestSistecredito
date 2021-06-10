package com.co.cinte.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BuyArticleUI {

	public static final Target BTN_BUY= Target.the("BTN_BUY").located(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[2]/button"));
	public static final Target BTN_CONTINUE= Target.the("BTN_CONTINUE").located(By.xpath("/html/body/div[3]/div[1]/div[4]/div/div/span/div/div/div/div[2]/button"));
	public static final Target BTN_TYPE_DELIVERY= Target.the("BTN_TYPE_DELIVERY").located(By.xpath("//*[@id=\"fbra_checkoutDeliverySummary\"]/div/div/div[1]/div/h2"));
	
}
