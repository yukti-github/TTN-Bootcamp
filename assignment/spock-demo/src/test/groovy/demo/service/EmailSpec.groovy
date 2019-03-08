package demo.service


import demo.domain.Order
import spock.lang.Specification

class EmailSpec extends Specification {

    def "Send Email"() {
        setup:
        EmailService emailservice = EmailService.getInstance();

        when:

        emailservice.sendEmail(Mock(Order));

        then:
        thrown(RuntimeException)
    }

    def "Send Email using a string"() {

        setup:
        EmailService emailservice = EmailService.getInstance();

        when:
        Order order = Mock(Order)
        Boolean result = emailservice.sendEmail(new Order(), "abc");

        then:
        result
    }
}