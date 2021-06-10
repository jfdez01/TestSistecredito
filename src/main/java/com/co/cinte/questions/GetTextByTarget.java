package com.co.cinte.questions;



import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class GetTextByTarget implements Question<String> {

  private Target target;

  public GetTextByTarget(Target target) {
    this.target = target;
  }

  @Override
  public String answeredBy(Actor actor) {
    actor.attemptsTo(WaitUntil.the(target, isVisible()).forNoMoreThan(1).seconds());
    return target.resolveFor(actor).getText();
  }

  public static Question<String> value(Target target) {
    return new GetTextByTarget(target);
  }
}
