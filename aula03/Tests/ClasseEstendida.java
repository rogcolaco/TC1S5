import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

public class ClasseEstendida extends DisplayNameGenerator.ReplaceUnderscores {

    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
        return super.generateDisplayNameForClass(testClass);
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
        return super.generateDisplayNameForNestedClass(nestedClass)+ "...";
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        String str = testClass.getSimpleName() + " " + testMethod.getName();
        return str.replaceAll("_"," ");
    }
}