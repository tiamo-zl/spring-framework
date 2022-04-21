import com.lll.study.Student;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * <p>detail description</p>
 *
 * @author zl
 * @version 1.0
 * @date 2022-04-15 18:28
 * @update 2022-04-15 18:28
 * @since 1.0
 **/
public class AppApplicatiion {

    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory =
                new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Student student = (Student) xmlBeanFactory.getBean("student");
        System.out.println(student);
    }
}
