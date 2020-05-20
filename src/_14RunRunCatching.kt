fun main() {
//    one()
//    two()
//    three()
//    four()
    five()
}

private fun getRandomItem(i: Int): Int = (0..i).random()

private fun one() {
    println(getRandomItem(10))
    // Will fail, because a range cannot be (0..-10)
    // println(getRandomItem(-10))

    try {
        println(getRandomItem(-10))
    } catch (e: Exception) {
        println("Ooops. Something went wrong :(")
    }
}

private fun two() {
    run {
        println(getRandomItem(10))
    }

    val value = run { getRandomItem(20) }
    println(value)

    println(run { getRandomItem(30) })

    // println(run { getRandomString(-30) })
}

private fun three() {
    runCatching {
        getRandomItem(10)
    }.onSuccess {
        println("success: $it")
    }.onFailure {
        println("ERROR: ${it.message}")
    }
}

private fun four() {
    "-10".runCatching {
        val number = this.toInt()
        getRandomItem(number)
    }.onSuccess {
        println("success: $it")
    }.onFailure {
        println("ERROR: ${it.message}")
    }
}

private fun five() {
    val value: Result<Int> = (-10).runCatching {
        val number = this
        getRandomItem(number)
    }

    println("RESULT:" + when {
        value.isSuccess -> value.getOrNull()
        else -> value.exceptionOrNull()?.message
    })

    // BAD!!! Not all cases are covered.
    when {
        value.isSuccess -> value.getOrNull()
    }
}
