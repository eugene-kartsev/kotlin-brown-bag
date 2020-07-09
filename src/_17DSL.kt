
fun main() {
    val htmlAsText = html {
        // Same as:
        // this.head({})
        head {
        }
        body {
            p(attributes = mapOf("color" to "red",
                                 "style" to "font-weight: bold;"),
              text = "blah")
        }
    }.toText()

    println(htmlAsText)
}

fun html(f: HtmlRoot.() -> Unit): HtmlRoot {
    return HtmlRoot().also { f(it) }
}

class HtmlRoot {
    private val elements: MutableList<Any> = mutableListOf()

    fun head(f: HtmlHead.() -> Unit): HtmlHead {
        return HtmlHead().also {
            f(it)
            elements.add(it)
        }
    }
    fun body(f: HtmlBody.() -> Unit): HtmlBody {
        return HtmlBody().also {
            f(it)
            elements.add(it)
        }
    }
    fun toText(): String {
        return "<html>\n" +
               elements.joinToString("\n") +
               "\n</html>"
    }
}

class HtmlHead(val padding: Int = 4) {
    override fun toString(): String {
        return "${" ".repeat(padding)}<head></head>"
    }
}

class HtmlBody(val padding: Int = 4) {
    private val elements: MutableList<Any> = mutableListOf()

    fun p(attributes: Map<String, String> = mapOf(),
          text: String = "",
          f: HtmlP.() -> Unit = {}): HtmlP {
        return HtmlP(padding + 4).also {
            it.attributes = attributes
            it.text = text
            f(it)
            elements.add(it)
        }
    }

    override fun toString(): String {
        return " ".repeat(padding) +
               "<body>\n" +
               elements.joinToString("\n") +
               "\n" + " ".repeat(padding) +
               "</body>"
    }
}

class HtmlP(val padding: Int) {
    var attributes: Map<String, String> = mapOf()
    var text: String = ""

    override fun toString(): String {
        return " ".repeat(padding) +
               "<p " +
               attributes.map { "\"${it.key}\"=\"${it.value}\"" }.joinToString(" ") +
               ">$text</p>"
    }
}