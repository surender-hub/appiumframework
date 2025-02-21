package tests;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import utils.RetryAnalyzer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

        annotation.setRetryAnalyzer(RetryAnalyzer.class);
    }
}