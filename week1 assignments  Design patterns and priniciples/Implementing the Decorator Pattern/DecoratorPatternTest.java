public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create an email notifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate with SMS and Slack notifications
        Notifier smsAndSlackNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(emailNotifier));

        // Send notification
        smsAndSlackNotifier.send("Hello, this is a test notification!");
    }
}

