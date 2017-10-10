/**
 * @author ykartsev
 */
fun main(args: Array<String>) {
    var client : Client? = null
    printEmail(client)

    client = client ?: Client(null)
    printEmail(client)

    client = Client(PersonalInfo("example@example.com"))
    printEmail(client)
}

fun printEmail(client: Client?) {
    println("Email: ${client?.personalInfo?.email ?: "Unknown"}")
}


class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)