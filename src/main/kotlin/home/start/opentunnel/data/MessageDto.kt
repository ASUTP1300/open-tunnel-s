package home.start.opentunnel.data

class MessageDto {
    lateinit var author: String
    lateinit var text: String

    override fun toString(): String {
        return "MessageDto(author='$author', text='$text')"
    }

}
