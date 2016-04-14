import a.b.c.Foo;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * by Irina.Petrovskaya, on 02.12.11, 19:16
 */
public class RunMe {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:/spring-config.xml");
        ctx.refresh();
        Foo foo = ctx.getBean(Foo.class);
        System.out.println("foo.getP1() = " + foo.getP1());
    }
}
