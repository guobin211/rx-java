fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    val emailData = client?.personalInfo?.email
    if (emailData != null && message != null) {
        mailer.sendMessage(emailData, message)
    }
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
