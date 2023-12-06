class Password(
    private var passwordString: String = "",

    private var optionLength: Int = 5,
    private var optionIncludeNumber: Boolean = true,
    private var optionIncludeUpperAndLower: Boolean = false,
    private var optionIncludeSpecial: Boolean = false,
    private var optionIncludeWord: Boolean = false,
    private var optionNoDuplicates: Boolean = false
) {
    init {
        buildPassword()
    }

    fun buildPassword(){

    }
}