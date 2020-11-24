package TestNG_Concept;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransform implements IAnnotationTransformer {
	
	
	public void transform(ITestAnnotation annotation , Class testclass, Constructor testconstructor , Method Testmethod) {
		
		annotation.setRetryAnalyzer(RetryLogicConept.class);
	}

}
