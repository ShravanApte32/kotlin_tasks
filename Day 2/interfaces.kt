/*
Question:
Create an interface named Notification with a function sendNotification(message: String).

Create three classes:
EmailNotification
SMSNotification
PushNotification

Each class should implement the Notification interface and provide its own implementation of sendNotification().

In main(), create an object of each class and call the function.
*/

fun main() {
    val notif_email = EmailNotification()
    val notif_sms = SMSNotification()
    val notif_push = PushNotification()

    notif_email.sendNotification("Hello!")
    notif_sms.sendNotification("Hello!")
    notif_push.sendNotification("Hello!")
}

interface Notification {
    abstract fun sendNotification(message: String)
}

class EmailNotification : Notification {
    override fun sendNotification(message: String) {
        println("Notification sent through Email: $message")
    }
}

class SMSNotification : Notification {
    override fun sendNotification(message: String) {
        println("Notification sent through SMS: $message")
    }
}

class PushNotification : Notification {
    override fun sendNotification(message: String) {
        println("Notification sent through Push Notification: $message")
    }
}