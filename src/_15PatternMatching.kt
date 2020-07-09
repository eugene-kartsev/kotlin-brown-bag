import DeliveryStatus.DeliveryFailed
import DeliveryStatus.Pending
import DeliveryStatus.Success

fun main() {
    val status: DeliveryStatus = deliverSuccessfully()
    // val status: DeliveryStatus = deliverAndFail()

    // If "when" is used in a return statement
    // or assigned to a variable - it must be exhaustive.
    // DeliveryStatus is an algebraic data type
    println(when (status) {
        is Success -> "Delivery was successful. Result: ${status.response}"
        is Pending -> "Still Pending"
        is DeliveryFailed -> "Ooops. Something went wrong. Message: ${status.error.message}"
    })

    // If "when" is used as a block - it doesn't have to cover all cases :(((
    // However, if you add ".let {}" at the end - it'll enforce to cover all cases
    when (status) {
        is Success -> println("Delivery was successful. Result $status")
    }
}

private fun deliverSuccessfully(): DeliveryStatus {
    return Success("Yay!")
}

private fun deliverAndFail(): DeliveryStatus {
    return DeliveryFailed(Exception(";("))
}

sealed class DeliveryStatus {
    object Pending: DeliveryStatus()

    data class Success(
        val response: String
    ): DeliveryStatus()

    data class DeliveryFailed(
        val error: Exception
    ): DeliveryStatus()

    // When a new case is introduced
    // existing code will have to cover it.
    // Otherwise, it'll fail to compile
    //
    // object SomeOtherStuff: DeliveryStatus()
}
