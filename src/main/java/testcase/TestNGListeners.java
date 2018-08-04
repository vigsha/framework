package testcase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;


public class TestNGListeners implements IAnnotationTransformer,IRetryAnalyzer{
	int iMaxRetry=1;

	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && iMaxRetry<2)
		{
			iMaxRetry++;
			return true;
		}
			
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setInvocationCount(1);
		annotation.setRetryAnalyzer(this.getClass());//to get the class name
		
		if (!testMethod.getName().equals("createLead")) {
			annotation.setEnabled(false);
			}
	}

}
