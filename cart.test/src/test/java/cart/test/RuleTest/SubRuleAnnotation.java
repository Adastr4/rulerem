package cart.test.RuleTest;



import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.deliveredtechnologies.rulebook.annotation.Rule;

/**
 * Created by clong on 3/14/17.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Rule
public @interface SubRuleAnnotation {
}
