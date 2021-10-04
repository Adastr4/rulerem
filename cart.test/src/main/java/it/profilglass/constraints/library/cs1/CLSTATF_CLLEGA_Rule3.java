package it.profilglass.constraints.library.cs1;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 1002, name="SubRule3") //order specifies the order the rule should execute in; if not specified, any order may be used
public class CLSTATF_CLLEGA_Rule3 {
  private static final RuleState BREAK = null;

@Given
  private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

  @Result
  private boolean validate;

  @Then
  public RuleState then() {

	  return RuleState.NEXT;
  }

  @When
  public boolean when() {

    return
    		caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().equalsIgnoreCase("3A"));
  }

}
