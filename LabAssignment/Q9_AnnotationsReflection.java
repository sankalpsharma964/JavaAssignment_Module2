import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TrackExecution {
    String value() default "";
    String author() default "system";
    int version() default 1;
}

class Task {
    @TrackExecution(value = "Initialize resources", author = "Sankalp", version = 1)
    public void start() {}

    @TrackExecution(value = "Main processing", author = "Sankalp", version = 2)
    public void process() {}

    public void helper() {}

    @TrackExecution(value = "Release resources", author = "Sankalp", version = 1)
    public void finish() {}
}

public class Q9_AnnotationsReflection {
    public static void main(String[] args) {
        Method[] methods = Task.class.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(TrackExecution.class)) {
                TrackExecution t = m.getAnnotation(TrackExecution.class);
                System.out.println(
                        String.format("Method=%s | value=%s | author=%s | version=%d",
                                m.getName(), t.value(), t.author(), t.version())
                );
            }
        }
    }
}

